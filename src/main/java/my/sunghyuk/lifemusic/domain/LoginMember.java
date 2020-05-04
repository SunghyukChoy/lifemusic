package my.sunghyuk.lifemusic.domain;

import lombok.Builder;
import lombok.Getter;
import my.sunghyuk.lifemusic.domain.enums.MemberStatus;
import my.sunghyuk.lifemusic.entity.enums.MemberRole;

@Getter
@Builder
public class LoginMember {

    private long id;
    private String userId;
    private String firstName;
    private String middleName;
    private String lastName;
    private MemberStatus status;
    private MemberRole role;

}