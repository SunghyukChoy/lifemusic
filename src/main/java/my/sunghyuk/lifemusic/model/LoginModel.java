package my.sunghyuk.lifemusic.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LoginModel {
    private String memberId;
    private String password;
    private String redirectUrl;
}
