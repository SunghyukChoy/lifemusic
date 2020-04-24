package my.sunghyuk.lifemusic.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.sunghyuk.lifemusic.entity.MemberEntity;
import my.sunghyuk.lifemusic.entity.mapper.MemberMapper;

@Repository
public class MemberRepositoryMyBatis implements MemberRepository {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public MemberEntity getOneByUserId(String userId) {
        // TODO Auto-generated method stub
        return null;
    }

}