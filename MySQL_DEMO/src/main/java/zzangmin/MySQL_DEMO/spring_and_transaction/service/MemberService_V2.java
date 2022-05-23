package zzangmin.MySQL_DEMO.spring_and_transaction.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zzangmin.MySQL_DEMO.spring_and_transaction.entity.Member;
import zzangmin.MySQL_DEMO.spring_and_transaction.repository.MemberRepository;

@Service
@RequiredArgsConstructor

public class MemberService_V2 {

    private final MemberRepository memberRepository;

    public void join(Member member) {
        validateForm(member);
        //begin
        saveMember(member);
        //end
        sendEmail(member);
    }

    @Transactional
    public void saveMember(Member member) {
        memberRepository.save(member);
    }

    private void sendEmail(Member member) {
        // 외부 네트워크 통신 로직
    }

    private void validateForm(Member member) {
        // 아주 찰나의 검증로직
    }


}
