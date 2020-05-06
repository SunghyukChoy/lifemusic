package my.sunghyuk.lifemusic.entity;

import java.time.LocalDateTime;

import lombok.Getter;
import my.sunghyuk.lifemusic.domain.LoginMember;
import my.sunghyuk.lifemusic.domain.Member;
import my.sunghyuk.lifemusic.domain.enums.MemberStatus;
import my.sunghyuk.lifemusic.entity.enums.Role;

@Getter
public class MemberEntity {
    private long id;
    private String userId;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private MemberStatus status;
    private Role role;
    private long createdBy;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;

    public Member buildDomain() {
        return Member.builder().id(id).userId(userId).password(password).firstName(firstName)
                .middleName(middleName).lastName(lastName).status(status).role(role).build();
    }

    public void buildEntity(Member member) {
        this.id = member.getId();
        this.userId = member.getUserId();
        this.password = member.getPassword();
        this.firstName = member.getFirstName();
        this.middleName = member.getMiddleName();
        this.lastName = member.getLastName();
        this.status = member.getStatus();
        this.role = member.getRole();
    }

    public LoginMember buildLoginMember() {
        return LoginMember.builder().id(id).userId(userId).firstName(firstName).middleName(middleName)
                .lastName(lastName).status(status).role(role).build();
    }
}