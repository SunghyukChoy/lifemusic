package my.sunghyuk.lifemusic.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import my.sunghyuk.lifemusic.domain.Member;
import my.sunghyuk.lifemusic.entity.MemberEntity;
import my.sunghyuk.lifemusic.repository.MemberRepository;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public Member login(HttpSession session, String memberId, String password) throws Exception {
        // 1. memberId 를 가지고 repository 에서 MemberEntity 를 가져온다
        MemberEntity memberEntity = memberRepository.getOneByUserId(memberId);
        // 2. 만약에 MemberEntity 가 안나오면 예외를 던져라 (throw new Exception("해당 회원 정보가 존재하지 않음"))
        if (memberEntity == null) {
            throw new Exception("해당 회원 정보가 존재하지 않음");
        }
        // 3. MemberEntity 가 존재하면, MemberEntity 의 password 랑 password 매개변수를 비교하여 만약에 틀리면
        // 예외를 던져라
        if (!memberEntity.getPassword().equals(password)) {
            throw new Exception("비밀번호가 일치하지 않음");
        }
        // 4. 같으면 MemberEntity 를 buildDomain 메서드를 통해 Member 로 변환하여 리턴시킨다
        Member member = memberEntity.buildDomain();

        // 5. 로그인 성공한 사용자의 정보를 Session 에 저장한다.
        session.setAttribute("member", objectMapper.writeValueAsString(member));

        // 6. member를 리턴한다.
        return member;
    }
}
