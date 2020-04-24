package my.sunghyuk.lifemusic.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.sunghyuk.lifemusic.entity.RecordEntity;
import my.sunghyuk.lifemusic.entity.mapper.RecordMapper;

@Repository
public class RecordRepositoryMyBatis implements RecordRepository {

    @Autowired
    private RecordMapper recordMapper; // MyBatis 핵심 부분

    @Override
    public RecordEntity findOne(long id) {
        return recordMapper.findById(id);
    }

    @Override
    public List<RecordEntity> findAll() {
        return recordMapper.findAll();
    }

}
