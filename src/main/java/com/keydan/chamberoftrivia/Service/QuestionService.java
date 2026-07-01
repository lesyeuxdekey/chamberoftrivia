package com.keydan.chamberoftrivia.Service;

import java.util.List;

import com.keydan.chamberoftrivia.Model.QuestionModel;
import com.keydan.chamberoftrivia.dto.request.QuestionRequest;

public interface QuestionService {

    /*
    CRUD de admin
    lógica de selección de preguntas del juego
    */
     QuestionModel createQuestion(QuestionRequest request);

    QuestionModel updateQuestion(Long id, QuestionRequest request);

    void deleteQuestion(Long id);

    QuestionModel getById(Long id);

    List<QuestionModel> getAll();

    List<QuestionModel> getRandomQuestions(Long categoryId, int amount);
}
