package com.easypay.CapstoneProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
=======
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> a9a2d2b4459c365ed3b1066ddc047ba4285f7217
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CapstoneProjectApplication {

        @RequestMapping("/")
	public String home() {
	            return "Hello Simplilearn! Thanks for the great DevOps course! this is just for the Capstone Project ";
	              }
	public static void main(String[] args) {
		SpringApplication.run(CapstoneProjectApplication.class, args);
	}

	@RestController
	static final class MyController {

		@GetMapping("/")
		String hello() {
			return "Hello Simplilearn!\n";
		}
	}

}


//package com.easypay.CapstoneProject;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
//@RestController
//public class CapstoneProjectApplication {

//        @RequestMapping("/")
//	public String home() {
//	            return "Hello Simplilearn! Thanks for the great DevOps course! this is just for the Capstone Project ";
//	              }
//	public static void main(String[] args) {
//		SpringApplication.run(CapstoneProjectApplication.class, args);
//	}

//}
