package com.ahmetduruer.challenges.java.alberthealth.repository;

import com.ahmetduruer.challenges.java.alberthealth.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {

}
