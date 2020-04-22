package my.sunghyuk.lifemusic.repository;

import java.util.List;

import my.sunghyuk.lifemusic.entity.RecordEntity;

public interface RecordRepository {
	
	RecordEntity findOne(long id);
	List<RecordEntity> findAll();
	
}
