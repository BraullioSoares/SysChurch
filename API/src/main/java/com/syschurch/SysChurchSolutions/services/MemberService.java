package com.syschurch.SysChurchSolutions.services;

import com.syschurch.SysChurchSolutions.dto.MemberDto;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface MemberService {

    List<MemberDto> getAllMembers() throws ExecutionException, InterruptedException;

    String create(MemberDto member) throws ExecutionException, InterruptedException;

    String deleteMember(String documentId);

    MemberDto getMemberDetails(String document) throws ExecutionException, InterruptedException;

    String updateMemberDetails(MemberDto member) throws ExecutionException, InterruptedException;
}
