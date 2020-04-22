package my.sunghyuk.lifemusic.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.sunghyuk.lifemusic.entity.RecordEntity;
import my.sunghyuk.lifemusic.entity.mapper.RecordMapper;

@Repository("recordRepository")
public class RecordRepositoryMyBatis implements RecordRepository {

	@Autowired
	private RecordMapper mapper;		// MyBatis 핵심 부분
	
	@Override
	public RecordEntity findOne(long id) {
		return mapper.findById(id);
	}

	@Override
	public List<RecordEntity> findAll() {
		return mapper.findAll();
	}

}
