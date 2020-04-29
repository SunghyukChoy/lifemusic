package my.sunghyuk.lifemusic.domain;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Menu {

    private long id;
    private String name;
    private String url;

    private List<Menu> childMenus;
}
