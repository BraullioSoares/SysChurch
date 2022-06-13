package com.syschurch.SysChurchSolutions;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

@SpringBootApplication
public class SysChurchSolutionsApplication {

	public static void main(String[] args) throws IOException {
		ClassLoader classLoader = SysChurchSolutionsApplication.class.getClassLoader();

		File file = new File(Objects.requireNonNull(classLoader
				.getResource("syschurch-database-firebase-adminsdk-1qa67-47f1f41974")).getFile());

		FileInputStream serviceAccount =
				new FileInputStream(file.getAbsolutePath());

		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(serviceAccount))
				.build();

		FirebaseApp.initializeApp(options);


		SpringApplication.run(SysChurchSolutionsApplication.class, args);
	}

}
