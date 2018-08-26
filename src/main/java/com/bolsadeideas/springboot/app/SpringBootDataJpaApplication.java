package com.bolsadeideas.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.bolsadeideas.springboot.app.models.service.IUploadFileService;

@SpringBootApplication
public class SpringBootDataJpaApplication implements CommandLineRunner {

	@Autowired
	IUploadFileService uploadFileService;
<<<<<<< HEAD
//	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
=======
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
>>>>>>> branch 'master' of https://github.com/prietomoral/spring-boot-jwt.git

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		uploadFileService.deleteAll();
		uploadFileService.init();
		
//		String password = "12345";
//		
//		for(int i=0; i<2; i++) {
//			String bcryptPassword = passwordEncoder.encode(password);
//			System.out.println(bcryptPassword);
//		}
	}
}
