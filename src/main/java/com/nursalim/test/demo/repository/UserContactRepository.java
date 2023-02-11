package com.nursalim.test.demo.repository;

import com.nursalim.test.demo.entity.UserContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserContactRepository extends JpaRepository<UserContact, String> {
}
