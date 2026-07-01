package com.keydan.chamberoftrivia.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keydan.chamberoftrivia.Model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<Long, UserModel> {
    Optional<UserModel> findByUsername(String username);

    boolean existsByUsername(String username);
}
