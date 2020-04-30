package my.sunghyuk.lifemusic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.sunghyuk.lifemusic.domain.Record;
import my.sunghyuk.lifemusic.entity.RecordEntity;
import my.sunghyuk.lifemusic.repository.RecordRepository;

@Service
public class RecordServiceImpl implements RecordService {

    private final RecordRepository recordRepository;

    @Autowired
    public RecordServiceImpl(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public Record getRecordById(long id) {
        RecordEntity entity = recordRepository.findById(id);
        return entity != null ? entity.buildDomain() : null;
    }

    @Override
    public List<Record> getAllRecords() {
        List<RecordEntity> entities = recordRepository.findAll();
        List<Record> records = new ArrayList<>();

        for (RecordEntity entity : entities) {
            records.add(entity.buildDomain());
        }

        return records;
    }

}
