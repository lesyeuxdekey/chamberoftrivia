package com.keydan.chamberoftrivia.Service;

import java.util.List;

import com.keydan.chamberoftrivia.dto.request.QuestionRequest;
import com.keydan.chamberoftrivia.dto.response.QuestionResponse;
import com.keydan.chamberoftrivia.dto.response.QuizQuestionResponse;

public interface QuestionService {

    /*
    LO QUE LOGRO:
    CRUD de admin
    lógica de selección de preguntas del juego
    */
    QuestionResponse createQuestion(QuestionRequest request);

    QuestionResponse updateQuestion(Long id, QuestionRequest request);

    void deleteQuestion(Long id);

    QuestionResponse getQuestionById(Long id);

    List<QuestionResponse> getAllQuestions();

    List<QuizQuestionResponse> getRandomQuestions(int amount, Long categoryId);
}
