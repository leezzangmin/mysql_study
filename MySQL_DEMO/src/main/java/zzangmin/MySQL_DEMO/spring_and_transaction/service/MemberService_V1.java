package zzangmin.MySQL_DEMO.spring_and_transaction.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zzangmin.MySQL_DEMO.spring_and_transaction.entity.Member;
import zzangmin.MySQL_DEMO.spring_and_transaction.repository.MemberRepository;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService_V1 {

    private final MemberRepository memberRepository;

    @Transactional // (exclude = {validateForm(), sendEmail())
    public void join(Member member) {
//transaction begin

        validateForm(member);

        memberRepository.save(member);

        sendEmail(member); //if exception ?
//commit, transaction end

    }

    private void sendEmail(Member member) {
        // 외부 네트워크 통신 로직
    }

    private void validateForm(Member member) {
        // 아주 찰나의 검증로직
    }

}
