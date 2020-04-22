package my.sunghyuk.lifemusic.entity.mapper;

import java.util.List;

import my.sunghyuk.lifemusic.entity.RecordEntity;

public interface RecordMapper {
	
	List<RecordEntity> findAll();
	RecordEntity findById(long id);
	
}
