package com.syschurch.SysChurchSolutions.services;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service
public class FBInitialize {

    @PostConstruct
    public void initialize() {
        try {

            FileInputStream serviceAccount = new FileInputStream("/Users/braulliosoares/Documents/Projects/SysChurch/API/src/main/resources/syschurch-18154-firebase-adminsdk-zn7hz-2ecaa2e9ff.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://syschurch-18154-default-rtdb.firebaseio.com")
                    .build();

            FirebaseApp.initializeApp(options);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
