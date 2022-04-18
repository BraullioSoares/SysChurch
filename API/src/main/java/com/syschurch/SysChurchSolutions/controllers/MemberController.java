package com.syschurch.SysChurchSolutions.controllers;

import com.syschurch.SysChurchSolutions.exceptions.ResourceNotFoundException;
import com.syschurch.SysChurchSolutions.models.Member;
import com.syschurch.SysChurchSolutions.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("members")
    public List<Member> getAllMembers() {
        return this.memberRepository.findAll();
    }

    @GetMapping("members/{id}")
    public ResponseEntity<Member> getMemberById(@PathVariable(value = "id") Long memberId) throws ResourceNotFoundException {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new ResourceNotFoundException("Member not found with id" + memberId));
        return ResponseEntity.ok().body(member);
    }

    @PostMapping("members")
    public Member createMember(@RequestBody Member member) {
        return this.memberRepository.save(member);
    }

    // TODO -> Update and Delete methods
}
