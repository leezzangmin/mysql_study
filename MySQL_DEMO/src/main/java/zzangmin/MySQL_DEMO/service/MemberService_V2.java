package zzangmin.MySQL_DEMO.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zzangmin.MySQL_DEMO.entity.Member;
import zzangmin.MySQL_DEMO.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService_V2 {

    private final MemberRepository memberRepository;

    public void join(Member member) {
        validateForm(member);
        saveMember(member);
        sendEmail(member);
    }

    @Transactional
    protected void saveMember(Member member) {
        memberRepository.save(member);
    }

    private void sendEmail(Member member) {
        // 외부 네트워크 통신 로직
    }

    private void validateForm(Member member) {
        // 아주 찰나의 검증로직
    }


}
