package my.sunghyuk.lifemusic.repository;

import java.util.List;

import my.sunghyuk.lifemusic.entity.MemberEntity;

public interface MemberRepository {

    List<MemberEntity> findAll();

    MemberEntity findById(long id);

    MemberEntity getOneByUserId(String userId);
    
}