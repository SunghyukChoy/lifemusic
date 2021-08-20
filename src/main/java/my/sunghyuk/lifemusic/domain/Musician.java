package my.sunghyuk.lifemusic.domain;

import lombok.Builder;
import lombok.Getter;

//현업에서는 Setter 에서 일어나는 많은 문제로 Setter 사용을 지양하고있고,
// 이를 해소하기 위해 생성자를 통해 값을 넣거나 (이경우는 @AllArgsConstructor, @NoArgsConstructor,
// @RequiredArgsConstructor 세가지 사용)
// 혹은 Builder Pattern 을 통해서 (이경우는 @Builder 지정) 필요한 값만 설정해서 넣는다.
// Artist artist = new Artist(1, "최성혁", null, null, "아무거나"); // 생성자 입력 방법
// Artist artist = Artist.builder().id(1).name("최성혁").description("아무거나").build();

@Getter
@Builder
public class Musician {
    private long id;
    private String name;
    private int debutYear;
}
