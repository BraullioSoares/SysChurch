package com.syschurch.SysChurchSolutions.client;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.syschurch.SysChurchSolutions.dto.MemberDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class FirebaseClientImpl implements FirebaseClient {

    private final static String COLLECTION_NAME = "users";

    @Override
    public String createMember(MemberDto member) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COLLECTION_NAME)
                .document(member.getDocumentId()).set(member);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    @Override
    public MemberDto getMemberDetails(String documentId) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection(COLLECTION_NAME).document(documentId);
        ApiFuture<DocumentSnapshot> future = documentReference.get();

        DocumentSnapshot document = future.get();

        MemberDto member;

        if (document.exists()) {
            member = document.toObject(MemberDto.class);
            return member;
        } else {
            return null;
        }
    }

    @Override
    public String updateMemberDetails(MemberDto memberDto) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COLLECTION_NAME)
                .document(memberDto.getDocumentId()).set(memberDto);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    @Override
    public List<MemberDto> getAllMembers() throws ExecutionException, InterruptedException {
/*        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection(COLLECTION_NAME).document();
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();

        List<MemberDto> member = document.toObject(MemberDto.class);
        return member;*/
        return null;

    }

    @Override
    public String deleteMember(String documentId) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = dbFirestore.collection(COLLECTION_NAME).document(documentId).delete();
        return "Document with Member ID " + documentId + " has been deleted";
    }
}
