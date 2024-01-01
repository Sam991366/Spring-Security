package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.UserCredential;

@Repository
public interface UserCredentialRepository extends JpaRepository<UserCredential, Integer> {

}
