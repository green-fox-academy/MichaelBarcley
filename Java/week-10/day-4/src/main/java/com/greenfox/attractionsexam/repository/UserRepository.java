package com.greenfox.attractionsexam.repository;

import com.greenfox.attractionsexam.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
