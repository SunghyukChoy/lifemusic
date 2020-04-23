package my.sunghyuk.lifemusic.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import my.sunghyuk.lifemusic.domain.enums.MemberStatus;

@Getter
@Setter
@NoArgsConstructor
public class LoginUser {
    private String userId;
    private String firstName;
    private String middleName;
    private String lastName;
    private MemberStatus status;
}