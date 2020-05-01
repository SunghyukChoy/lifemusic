package my.sunghyuk.lifemusic.repository;

import java.util.List;

import my.sunghyuk.lifemusic.entity.RecordEntity;

public interface RecordRepository {

    List<RecordEntity> findAll();

    List<RecordEntity> findBySearchFilterAndKeyword(String searchFilter, String keywords);

    RecordEntity findById(long id);

}
