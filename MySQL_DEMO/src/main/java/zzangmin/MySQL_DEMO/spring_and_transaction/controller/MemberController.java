package zzangmin.MySQL_DEMO.spring_and_transaction.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import zzangmin.MySQL_DEMO.spring_and_transaction.entity.Member;
import zzangmin.MySQL_DEMO.spring_and_transaction.service.MemberService_V1;
import zzangmin.MySQL_DEMO.spring_and_transaction.service.MemberService_V2;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService_V2 memberService_v2;
    private final MemberService_V1 memberService_v1;

    @PostMapping("member/join")
    public String memberJoinForm(Member member) {
        memberService_v1.join(member);
        memberService_v2.join(member);

        return "redirect:/";
    }

}
