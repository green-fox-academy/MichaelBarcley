package com.greenfox.p2pchat.repository;

import com.greenfox.p2pchat.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
  Optional<User> findById(long id);

  @Modifying
  @Transactional
  @Query(value = "UPDATE user u SET u.name = :name WHERE u.id = 0", nativeQuery = true)
  void updateUsername(@Param("name") String name);
}
