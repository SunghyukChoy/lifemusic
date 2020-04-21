package my.sunghyuk.lifemusic.dummy;

import java.time.LocalDateTime;

import my.sunghyuk.lifemusic.domain.*;
import my.sunghyuk.lifemusic.domain.enums.MemberStatus;

public class DummyBuilder {
    public static Member getMember() {
        Member member = new Member();

        member.setUserId("likeaglow");
        member.setPassword("1234");
        member.setFirstName("성혁");
        member.setLastName("최");
        member.setStatus(MemberStatus.ACTIVE);
        member.setCreatedDateTime(LocalDateTime.now());
        member.setUpdatedDateTime(LocalDateTime.now());

        return member;
    }
}
