package my.sunghyuk.lifemusic.domain;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Breadcrumb {

    private String title;
    private List<BreadcrumbItem> items;

}
