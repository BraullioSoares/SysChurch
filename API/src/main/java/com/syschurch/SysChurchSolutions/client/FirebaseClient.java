package com.syschurch.SysChurchSolutions.client;

import com.syschurch.SysChurchSolutions.dto.MemberDto;

import java.util.concurrent.ExecutionException;

public interface FirebaseClient {

    String createUser(MemberDto member) throws ExecutionException, InterruptedException;

    void deleteMemberById(String memberId);
}
