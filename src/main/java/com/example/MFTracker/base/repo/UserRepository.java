package com.example.MFTracker.base.repo;

import com.example.MFTracker.base.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
