package my.sunghyuk.lifemusic.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BreadcrumbItem {

    private String name;
    private String url;

}
