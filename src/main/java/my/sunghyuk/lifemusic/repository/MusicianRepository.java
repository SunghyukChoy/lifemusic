package my.sunghyuk.lifemusic.repository;

import my.sunghyuk.lifemusic.entity.MusicianEntity;

public interface MusicianRepository {

    MusicianEntity findById(long id);

}