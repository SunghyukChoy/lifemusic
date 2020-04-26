package my.sunghyuk.lifemusic.entity;

import java.time.LocalDateTime;

import lombok.Getter;
import my.sunghyuk.lifemusic.domain.Member;
import my.sunghyuk.lifemusic.domain.enums.MemberStatus;

@Getter
public class MemberEntity {
    private long id;
    private String userId;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private MemberStatus status;
    private boolean isAdmin;
    private long createdBy;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;

    public Member buildDomain() {
        Member member = Member.builder()
                              .id(id)
                              .userId(userId)
                              .password(password)
                              .firstName(firstName)
                              .middleName(middleName)
                              .lastName(lastName)
                              .status(status)
                              .build();
        return member;
    }

    public void buildEntity(Member member) {
        this.id = member.getId();
        this.userId = member.getUserId();
        this.password = member.getPassword();
        this.firstName = member.getFirstName();
        this.middleName = member.getMiddleName();
        this.lastName = member.getLastName();
        this.status = member.getStatus();
        this.isAdmin = false;
    }
}