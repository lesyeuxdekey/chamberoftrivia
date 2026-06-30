package com.keydan.chamberoftrivia.Repository;

import com.keydan.chamberoftrivia.Model.QuizAnswerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizAnswerRepository extends JpaRepository<Long, QuizAnswerModel> {
}
