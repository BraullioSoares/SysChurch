package com.syschurch.SysChurchSolutions.controllers;

import com.syschurch.SysChurchSolutions.dto.MemberDto;
import com.syschurch.SysChurchSolutions.exceptions.ResourceNotFoundException;
import com.syschurch.SysChurchSolutions.models.Member;
import com.syschurch.SysChurchSolutions.services.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/v1/members")
@AllArgsConstructor
public class MemberController {


    private MemberService memberService;

    @GetMapping
    public List<Member> getAllMembers() {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberDto> getMemberById(@PathVariable(value = "id") String memberId) throws ResourceNotFoundException {
        return null;
    }

    @PostMapping
    public String createMember(@RequestBody MemberDto memberDto) throws ExecutionException, InterruptedException {
        return memberService.create(memberDto);
    }

    // TODO -> Update and Delete methods
}
