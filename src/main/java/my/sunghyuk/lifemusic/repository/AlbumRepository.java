package my.sunghyuk.lifemusic.repository;

import java.util.List;

import my.sunghyuk.lifemusic.entity.AlbumEntity;

public interface AlbumRepository {
	
	AlbumEntity findOne(AlbumEntity entity);
	List<AlbumEntity> findAll();
	
}

// abstract class VS interface
/*

	1. 불러오는 방법이 다르다
		- abstract : extends	/ interface : implements
	2. abstract 는 Logic 이 들어갈 수 있고, interface 는 알맹이가 없다
	3. abstract 는 단일상속 / interface 는 다중상속 가능
	
	유일한 공통점
	- 객체를 바로 생성할 수 없지 : 덜 만든 붕어빵틀
	new AlbumRepository();

*/