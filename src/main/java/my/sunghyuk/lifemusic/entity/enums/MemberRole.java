package my.sunghyuk.lifemusic.entity.enums;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum MemberRole {
    ROLE_MEMBER, ROLE_ADMIN;

    public static Collection<GrantedAuthority> getAuthorities() {
        return Arrays.asList(MemberRole.values()).stream().map(r -> new SimpleGrantedAuthority(r.name()))
                .collect(Collectors.toList());
    }

}