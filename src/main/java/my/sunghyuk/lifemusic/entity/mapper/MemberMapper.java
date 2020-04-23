package my.sunghyuk.lifemusic.entity.mapper;

import java.util.List;

import my.sunghyuk.lifemusic.entity.MemberEntity;

public interface MemberMapper {
	
	List<MemberEntity> findAll();
	MemberEntity getOneByUserId(String userId);
	
}
