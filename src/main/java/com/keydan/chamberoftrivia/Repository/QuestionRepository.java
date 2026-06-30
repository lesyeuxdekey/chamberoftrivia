package com.keydan.chamberoftrivia.Repository;

import com.keydan.chamberoftrivia.Model.QuestionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Long, QuestionModel> {
    @Query(value = "SELECT * FROM question ORDER BY RAND() LIMIT 10", nativeQuery = true)
    List<QuestionModel> findRandomQuestions();
}
