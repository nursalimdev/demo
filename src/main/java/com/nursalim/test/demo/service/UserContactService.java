package com.nursalim.test.demo.service;

import com.nursalim.test.demo.entity.UserContact;
import com.nursalim.test.demo.repository.UserContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserContactService {
    @Autowired
    private UserContactRepository userContactRepository;

    public UserContactService(UserContactRepository userContactRepository){
        this.userContactRepository = userContactRepository;
    }

    public List<UserContact> getAllUserContact(){
        return userContactRepository.findAll();
    }
}
