package com.keydan.chamberoftrivia.Repository;

import com.keydan.chamberoftrivia.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Long, UserModel> {
}
