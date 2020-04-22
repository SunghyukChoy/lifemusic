package my.sunghyuk.lifemusic.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import my.sunghyuk.lifemusic.entity.RecordEntity;

//@Repository("recordRepository")
public class RecordRepositoryDummy implements RecordRepository {

	@Override
	public RecordEntity findOne(long id) {
		return new RecordEntity(2, "The 1975", "", "/imgs/sample/recordcover2.jpg", "The 1975", LocalDate.of(2014, 1, 21), "Seon");
	}

	@Override
	public List<RecordEntity> findAll() {
		ArrayList<RecordEntity> records = new ArrayList<RecordEntity>();
		
		records.add(new RecordEntity(1, "The Stand-In", "", "/imgs/sample/recordcover1.jpg", "Caitlin Rose", LocalDate.of(2013, 3, 5), "Choi"));
		records.add(new RecordEntity(2, "The 1975", "", "/imgs/sample/recordcover2.jpg", "The 1975", LocalDate.of(2014, 1, 21), "Seon"));
		records.add(new RecordEntity(3, "Love Is Dead", "", "/imgs/sample/recordcover3.jpg", "CHVRCHES", LocalDate.of(2016, 11, 22), "Lee"));
		
		return records;
	}

}
