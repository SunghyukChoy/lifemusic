package my.sunghyuk.lifemusic.test.service;

import org.mockito.Mock;
import org.springframework.test.context.web.WebAppConfiguration;

import my.sunghyuk.lifemusic.repository.MemberRepository;

@WebAppConfiguration
public class MemberServiceTests {

    @Mock
    private MemberRepository memberRepository;

    void tryLogin_Success() {
        // arrange

        // action

        // assert
    }

}