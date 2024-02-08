package com.sinfruits.repositories;

import com.sinfruits.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String > {

}
