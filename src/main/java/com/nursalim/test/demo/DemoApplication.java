package com.nursalim.test.demo;

import com.nursalim.test.demo.entity.User;
import com.nursalim.test.demo.entity.UserContact;
import com.nursalim.test.demo.repository.UserContactRepository;
import com.nursalim.test.demo.repository.UserRepository;
import com.nursalim.test.demo.service.UserContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoApplication implements ApplicationRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserContactRepository userContactRepository;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("userRepository : {}", userRepository);
		log.info("userContactRepository : {}", userContactRepository);

		User user1 = new User("nursalim", "Nursalim", 30);
		userRepository.save(user1);

		UserContact userContactService1 = new UserContact("userContact1","Jakarta", user1);
		userContactRepository.save(userContactService1);

		User user2 = new User("adinda", "Adinda", 25);
		userRepository.save(user2);

		UserContact userContactService2 = new UserContact("userContact2","Bandung", user2);
		userContactRepository.save(userContactService2);

	}
}
