package my.sunghyuk.lifemusic.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import my.sunghyuk.lifemusic.entity.RecordEntity;
import my.sunghyuk.lifemusic.repository.RecordRepository;

public interface RecordMapper extends RecordRepository {
    List<RecordEntity> findBySearchFilterAndKeyword(@Param(value = "keywords") String keywords);
}
