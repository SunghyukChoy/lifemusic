package my.sunghyuk.lifemusic.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import my.sunghyuk.lifemusic.domain.Member;
import my.sunghyuk.lifemusic.entity.enums.MemberRole;
import my.sunghyuk.lifemusic.service.MemberService;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private MemberService memberService;

    @Override
    public Authentication authenticate(Authentication authentication) {
        String memberId = authentication.getName();
        Member member = memberService.findByMemberId(memberId);

        if (member == null) {
            throw new UsernameNotFoundException(memberId);
        }

        if (!member.getPassword().equals(authentication.getCredentials())) {
            throw new BadCredentialsException("not matching password");
        }

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                member.getId(), member.getPassword(), MemberRole.getAuthorities());
        authenticationToken.setDetails(member.buildLoginMember());

        return authenticationToken;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }

}