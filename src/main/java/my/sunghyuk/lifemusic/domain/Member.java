package my.sunghyuk.lifemusic.domain;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import my.sunghyuk.lifemusic.domain.enums.MemberStatus;
import my.sunghyuk.lifemusic.entity.enums.MemberRole;

@Getter
@Builder
public class Member {

    private long id;
    private String userId;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private MemberStatus status;
    private MemberRole role;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;

    public LoginMember buildLoginMember() {
        return LoginMember.builder().id(id).userId(userId).firstName(firstName).middleName(middleName)
                .lastName(lastName).status(status).role(role).build();
    }
}
