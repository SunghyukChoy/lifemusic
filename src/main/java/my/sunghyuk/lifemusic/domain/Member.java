package my.sunghyuk.lifemusic.domain;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import my.sunghyuk.lifemusic.domain.enums.MemberStatus;

@Getter
public class Member {
    
    private long id;
    private String userId;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private MemberStatus status;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;

    @Builder
    public Member(long id, String userId, String password, String firstName, String middleName, 
            String lastName, MemberStatus status) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.status = status;
    }
}
