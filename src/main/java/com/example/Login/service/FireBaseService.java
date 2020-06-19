package com.example.Login.service;

import com.example.Login.Objects.Person;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class FireBaseService {
    public String saveUserDetails(Person person) throws ExecutionException, InterruptedException {
        Firestore dbFireStore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionApiFuture  = (ApiFuture<WriteResult>) dbFireStore.collection("example").document(person.getName());
        return collectionApiFuture.get().getUpdateTime().toString();
    }

    public Person getUserDetails(String name) throws ExecutionException, InterruptedException {
        Firestore dbFireStore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFireStore.collection("example").document(name);
        ApiFuture<DocumentSnapshot> future = documentReference.get();

        DocumentSnapshot document  = future.get();

        Person person = null;

        if(document.exists()){
            person = document.toObject(Person.class);
            return person;
        }else {
            return null;
        }
    }

    public String updateUserDetails(Person person) throws ExecutionException, InterruptedException {
        Firestore dbFireStore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionApiFuture  = (ApiFuture<WriteResult>) dbFireStore.collection("example").document(person.getName());
        return collectionApiFuture.get().getUpdateTime().toString();
    }

    public String deleteUserDetails(String name){
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = dbFirestore.collection("example").document(name).delete();
        return "Document with ID "+name+" is Deleted";
    }
}

