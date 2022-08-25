package com.syschurch.SysChurchSolutions.services;

import com.syschurch.SysChurchSolutions.dto.MemberDto;
import com.syschurch.SysChurchSolutions.models.Member;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface MemberService {

    List<Member> getMembers() throws ExecutionException, InterruptedException;

    MemberDto findById(String memberId) throws ExecutionException, InterruptedException;

    List<Member> getAllMembers();

    String create(MemberDto member) throws ExecutionException, InterruptedException;

    void deleteMember(String memberId);
}
