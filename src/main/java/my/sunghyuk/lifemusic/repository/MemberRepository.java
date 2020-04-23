package my.sunghyuk.lifemusic.repository;

import my.sunghyuk.lifemusic.entity.MemberEntity;

public interface MemberRepository {
    MemberEntity getOneByUserId(String userId);
}