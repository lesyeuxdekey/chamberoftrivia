package com.keydan.chamberoftrivia.Service;

import com.keydan.chamberoftrivia.Model.QuestionModel;

import java.util.List;
import java.util.Map;

public interface QuestionService {

    List<QuestionModel> getRandomQuestions();

    Map<String, Object> validateAnswer(Long questionId, int selectedIndex);

}
