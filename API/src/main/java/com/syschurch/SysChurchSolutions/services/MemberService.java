package com.syschurch.SysChurchSolutions.services;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.syschurch.SysChurchSolutions.models.Member;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class MemberService {

    public static final String COL_NAME = "members";

    public String saveMemberDetails(Member member) throws ExecutionException, InterruptedException {
        Firestore dbFireStore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionApiFuture = dbFireStore.collection(COL_NAME).document(member.getName()).set(member);

        return collectionApiFuture.get().getUpdateTime().toString();
    }
}
