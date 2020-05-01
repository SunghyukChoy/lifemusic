package my.sunghyuk.lifemusic.service;

import java.util.List;

import my.sunghyuk.lifemusic.domain.Record;

public interface RecordService {

    Record getRecordById(long id);

    List<Record> getAllRecords();

    List<Record> getRecordsByFilters(String searchFilter, String keywords);

}
