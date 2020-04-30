package my.sunghyuk.lifemusic.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import my.sunghyuk.lifemusic.domain.LoginMember;
import my.sunghyuk.lifemusic.service.CustomUserDetailService;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    CustomUserDetailService customUserDetailService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UsernamePasswordAuthenticationToken authToken = (UsernamePasswordAuthenticationToken) authentication;
        
        LoginMember loginMember = (LoginMember) customUserDetailService.loadUserByUsername(authToken.getName());

        if (loginMember == null) {
            throw new UsernameNotFoundException(authToken.getName());
        }

        if (loginMember.getPassword() != authToken.getCredentials()) {
            throw new BadCredentialsException("not matching password");
        }

        List<GrantedAuthority> authorities = (List<GrantedAuthority>)loginMember.getAuthorities();

        return new UsernamePasswordAuthenticationToken(loginMember, null, authorities);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }

}