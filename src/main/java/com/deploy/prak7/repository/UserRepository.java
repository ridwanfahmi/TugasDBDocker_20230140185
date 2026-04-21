package com.deploy.prak7.repository;

import com.deploy.prak7.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String> {
}
