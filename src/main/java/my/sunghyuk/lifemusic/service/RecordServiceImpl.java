package my.sunghyuk.lifemusic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.sunghyuk.lifemusic.domain.Record;
import my.sunghyuk.lifemusic.entity.RecordEntity;
import my.sunghyuk.lifemusic.repository.RecordRepository;

@Service("recordService")
public class RecordServiceImpl implements RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Override
	public Record getRecordById(long id) {
		RecordEntity entity = repository.findOne(id);
		return entity != null ? repository.findOne(id).buildDomain() : null;
	}

	@Override
	public List<Record> getAllRecords() {
		List<RecordEntity> entities = repository.findAll();
		List<Record> records = new ArrayList<Record>();
		
		for (RecordEntity entity : entities) {
			records.add(entity.buildDomain());
		}
		
		return records;
	}
	
}
