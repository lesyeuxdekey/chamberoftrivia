package com.keydan.chamberoftrivia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keydan.chamberoftrivia.Model.QuizSessionModel;
import com.keydan.chamberoftrivia.Model.UserModel;

@Repository
public interface QuizSessionRepository extends JpaRepository<Long, QuizSessionModel> {
    List<QuizSessionModel> findByUser(UserModel user);

    /*Optional<GameModel> findTopByUserOrderByScoreDesc(UserModel user); */
}
