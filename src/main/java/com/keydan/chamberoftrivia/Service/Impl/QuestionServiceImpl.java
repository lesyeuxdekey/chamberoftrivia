package com.keydan.chamberoftrivia.Service.Impl;

import com.keydan.chamberoftrivia.Model.QuestionModel;
import com.keydan.chamberoftrivia.Repository.QuestionRepository;
import com.keydan.chamberoftrivia.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public List<QuestionModel> getRandomQuestions() {
        return List.of();
    }

    @Override
    public Map<String, Object> validateAnswer(Long questionId, int selectedIndex) {
        return Map.of();
    }
}
/*
I want to create a quiz game, technologies I want to use: java/spring, react, h2 database,
- The game or quiz is gonna be single player (for now, maybe later it's gonna change)
- I want validations for my service (business logic validation) and my controller(networok validation), i want loggers in any function.
- the service will be an interface and then it will me implemented
- i want crud for admin (me) and extra services if needed.
-- Give me the logic of the game i should use, i'm thinking:
    - three question models(type text, type true or false, type option abcd)
    - i need a score to be saved for every "session"
    - maybe a login will be needed, bc the user will have a max score ?
    - for now its gonna be about an specific topic(harry potter)
    - in the session it will be random questions of different types of question
    - at the end it is gonna be a score and tell if the gamer won the quiz or not
*/