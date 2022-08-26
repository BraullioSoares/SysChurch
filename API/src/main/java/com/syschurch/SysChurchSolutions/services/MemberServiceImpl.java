package com.syschurch.SysChurchSolutions.services;

import com.syschurch.SysChurchSolutions.client.FirebaseClient;
import com.syschurch.SysChurchSolutions.dto.MemberDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class MemberServiceImpl implements MemberService {

    private final FirebaseClient firebaseClient;

    public MemberServiceImpl(FirebaseClient firebaseClient) {
        this.firebaseClient = firebaseClient;
    }

    @Override
    public List<MemberDto> getAllMembers() throws ExecutionException, InterruptedException {
        return firebaseClient.getAllMembers();
    }

    @Override
    public String create(MemberDto member) throws ExecutionException, InterruptedException {
        return firebaseClient.createMember(member);
    }

    @Override
    public String deleteMember(String documentId) {
       return firebaseClient.deleteMember(documentId);
    }

    @Override
    public MemberDto getMemberDetails(String documentId) throws ExecutionException, InterruptedException {
        return firebaseClient.getMemberDetails(documentId);
    }

    @Override
    public String updateMemberDetails(MemberDto member) throws ExecutionException, InterruptedException {
       return firebaseClient.updateMemberDetails(member);
    }
}
