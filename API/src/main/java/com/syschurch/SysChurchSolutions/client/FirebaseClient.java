package com.syschurch.SysChurchSolutions.client;

import com.syschurch.SysChurchSolutions.dto.MemberDto;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface FirebaseClient {

    String createMember(MemberDto member) throws ExecutionException, InterruptedException;

    MemberDto getMemberDetails(String documentId) throws ExecutionException, InterruptedException;

    String deleteMember(String documentId);

    String updateMemberDetails(MemberDto member) throws InterruptedException, ExecutionException;

    List<MemberDto> getAllMembers() throws ExecutionException, InterruptedException;
}
