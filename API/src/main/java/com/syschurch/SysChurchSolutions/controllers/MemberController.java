package com.syschurch.SysChurchSolutions.controllers;

import com.syschurch.SysChurchSolutions.dto.MemberDto;
import com.syschurch.SysChurchSolutions.exceptions.ResourceNotFoundException;
import com.syschurch.SysChurchSolutions.models.Member;
import com.syschurch.SysChurchSolutions.services.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("api/v1/members")
@AllArgsConstructor
public class MemberController {


    private MemberService memberService;


    @GetMapping
    public List<MemberDto> getAllMembers() throws ExecutionException, InterruptedException {
        return memberService.getAllMembers();
    }


    @PostMapping
    public String createMember(@RequestBody MemberDto memberDto) throws ExecutionException, InterruptedException {
        return memberService.create(memberDto);
    }

    @GetMapping("/getMemberDetails")
    public MemberDto getMemberDetails(@RequestParam String documentId ) throws InterruptedException, ExecutionException{
        return memberService.getMemberDetails(documentId);
    }

    @PutMapping
    public String updateMemberDetails(@RequestBody MemberDto member  ) throws InterruptedException, ExecutionException {
        return memberService.updateMemberDetails(member);
    }

    @DeleteMapping
    public String deleteMember(@RequestParam String documentId){
        return memberService.deleteMember(documentId);
    }
}
