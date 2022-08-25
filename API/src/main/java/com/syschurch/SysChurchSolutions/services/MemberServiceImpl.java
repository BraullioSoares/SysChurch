package com.syschurch.SysChurchSolutions.services;

import com.syschurch.SysChurchSolutions.client.FirebaseClient;
import com.syschurch.SysChurchSolutions.dto.MemberDto;
import com.syschurch.SysChurchSolutions.models.Member;
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
    public List<Member> getMembers() throws ExecutionException, InterruptedException {
    /*    Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection(COLLECTION_NAME).document();
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();*/

        return null;

    }

    @Override
    public MemberDto findById(String memberId) throws ExecutionException, InterruptedException {
/*        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection(COLLECTION_NAME).document(memberId);
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();
        MemberDto member;

        if (document.exists()){
            member = document.toObject(MemberDto.class);
            return member;
        }*/
        return null;
    }

    @Override
    public List<Member> getAllMembers() {
        return null;
    }

    @Override
    public String create(MemberDto member) throws ExecutionException, InterruptedException {
        return firebaseClient.createUser(member);
    }

    @Override
    public void deleteMember(String memberId) {
        firebaseClient.deleteMemberById(memberId);
    }


/*    public String deleteMember(String name) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = dbFirestore.collection(COL_NAME).document(name).delete();
        return "Document with Patient ID "+name+" has been deleted";
    }*/
}
