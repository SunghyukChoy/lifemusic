package my.sunghyuk.lifemusic.repository;

import java.util.List;

import my.sunghyuk.lifemusic.entity.RecordEntity;

public interface RecordRepository {

    List<RecordEntity> findAll();

    RecordEntity findById(long id);

}
