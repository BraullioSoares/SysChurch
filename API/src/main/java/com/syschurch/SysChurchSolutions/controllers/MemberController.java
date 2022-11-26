package com.syschurch.SysChurchSolutions.controllers;

import com.syschurch.SysChurchSolutions.models.Member;
import com.syschurch.SysChurchSolutions.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/v1/")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/createMember")
    public String createMember(@RequestBody Member member) throws ExecutionException, InterruptedException {
        return this.memberService.saveMemberDetails(member);
    }

    // TODO -> Update and Delete methods
}
