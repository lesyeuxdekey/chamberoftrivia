package com.keydan.chamberoftrivia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keydan.chamberoftrivia.Model.QuizAnswerModel;
import com.keydan.chamberoftrivia.Model.QuizSessionModel;

public interface QuizAnswerRepository extends JpaRepository<Long, QuizAnswerModel> {
      List<QuizAnswerModel> findByQuizSession(QuizSessionModel quizSession);
}
