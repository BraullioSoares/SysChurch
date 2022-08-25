package com.syschurch.SysChurchSolutions.client;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.syschurch.SysChurchSolutions.dto.MemberDto;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class FirebaseClientImpl implements FirebaseClient {

    private final static String COLLECTION_NAME = "users";

    @Override
    public String createUser(MemberDto member) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COLLECTION_NAME)
                .document(member.getName()).set(member);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    @Override
    public void deleteMemberById(String memberId) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        dbFirestore.collection(COLLECTION_NAME).document(memberId).delete();
    }


}
