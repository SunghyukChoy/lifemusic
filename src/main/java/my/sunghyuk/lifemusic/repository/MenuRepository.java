package my.sunghyuk.lifemusic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.sunghyuk.lifemusic.domain.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}