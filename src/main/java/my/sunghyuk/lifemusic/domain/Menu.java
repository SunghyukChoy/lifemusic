package my.sunghyuk.lifemusic.domain;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class Menu {

    private long id;
    private String name;
    private String url;

    private Menu parent;

    @Setter
    private List<Menu> childs;
}
