package com.keydan.chamberoftrivia.Repository;

import java.util.List;
import java.util.Locale.Category;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keydan.chamberoftrivia.Model.Enums.Difficulty;
import com.keydan.chamberoftrivia.Model.Enums.QuestionType;
import com.keydan.chamberoftrivia.Model.QuestionModel;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionModel, Long> {
      List<Question> findByCategory(Category category);

    List<Question> findByQuestionType(QuestionType questionType);

    List<Question> findByDifficulty(Difficulty difficulty);

    boolean existsByQuestionText(String questionText);

    /*
    @Query(value = """
    SELECT *
    FROM questions
    ORDER BY RAND()
    LIMIT :amount
    """, nativeQuery = true)
    List<Question> findRandomQuestions(int amount); */
}
