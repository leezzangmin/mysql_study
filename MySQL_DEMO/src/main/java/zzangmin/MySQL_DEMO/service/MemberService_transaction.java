package zzangmin.MySQL_DEMO.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import zzangmin.MySQL_DEMO.entity.Member;
import zzangmin.MySQL_DEMO.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService_transaction {

    private final MemberRepository memberRepository;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 1, readOnly = true, rollbackFor = Exception.class, noRollbackFor = RuntimeException.class)
    public void saveMember(Member member) {
        memberRepository.save(member);
    }




}
