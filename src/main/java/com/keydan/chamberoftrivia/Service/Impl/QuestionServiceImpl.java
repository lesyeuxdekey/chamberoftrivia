package com.keydan.chamberoftrivia.Service.Impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.keydan.chamberoftrivia.Model.CategoryModel;
import com.keydan.chamberoftrivia.Model.QuestionModel;
import com.keydan.chamberoftrivia.Repository.CategoryRepository;
import com.keydan.chamberoftrivia.Repository.QuestionRepository;
import com.keydan.chamberoftrivia.Service.QuestionService;
import com.keydan.chamberoftrivia.dto.request.QuestionRequest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;
    private final CategoryRepository categoryRepository;

    
    @Override
    public QuestionModel createQuestion(QuestionRequest request) {

        log.info("Creating question: {}", request.getQuestionText());

        validateQuestion(request);

        CategoryModel category = categoryRepository.findById(request.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        QuestionModel question = new QuestionModel();

        question.setQuestionText(request.getQuestionText());
        question.setDifficulty(request.getDifficulty());
        question.setPoints(request.getPoints());
        question.setQuestionType(request.getQuestionType());
        question.setCategory(category);
        question.setAnswerOptions(request.getAnswerOptions());
        question.setCorrectAnswerIndex(request.getCorrectAnswerIndex());

        return questionRepository.save(question);
    }

  @Override
    public QuestionModel updateQuestion(Long id, QuestionRequest request) {

        validateId(id);
        validateQuestion(request);

        QuestionModel question = questionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Question not found"));

        question.setQuestionText(request.getQuestionText());
        question.setDifficulty(request.getDifficulty());
        question.setPoints(request.getPoints());
        question.setQuestionType(request.getQuestionType());
        question.setAnswerOptions(request.getAnswerOptions());
        question.setCorrectAnswerIndex(request.getCorrectAnswerIndex());

        if (!question.getCategory().getId().equals(request.getCategoryId())) {

            CategoryModel category = categoryRepository.findById(request.getCategoryId())
                    .orElseThrow(() -> new RuntimeException("Category not found"));

            question.setCategory(category);
        }

        return questionRepository.save(question);
    }

    @Override
    public void deleteQuestion(Long id) {
        log.info("Deleting question id: {}", id);
    
        validateId(id);

        if (!questionRepository.existsById(id)) {
            throw new RuntimeException("Question not found");
        }

        questionRepository.deleteById(id);

        log.info("Question deleted successfully");
    }

    @Override
    public QuestionModel getById(Long id) {

        validateId(id);

        return questionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Question not found"));    
    }

    @Override
    public List<QuestionModel> getAll() {
        return questionRepository.findAll();
    }

    @Override
    public List<QuestionModel> getRandomQuestions(Long categoryId, int amount) {

        List<QuestionModel> all = questionRepository.findAll();

        List<QuestionModel> filtered = new ArrayList<>();

        for (QuestionModel q : all) {
            if (q.getCategory().getId().equals(categoryId)) {
                filtered.add(q);
            }
        }

        Collections.shuffle(filtered);

        return filtered.size() > amount
                ? filtered.subList(0, amount)
                : filtered;
    }


    /*PRIVATE */

    private void validateId(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Id must be positive");
        }
    }

    private void validateQuestion(QuestionRequest request) {

        if (request == null) {
            throw new IllegalArgumentException("Request cannot be null");
        }

        if (request.getQuestionText() == null || request.getQuestionText().isBlank()) {
            throw new IllegalArgumentException("Question text cannot be empty");
        }

        if (request.getAnswerOptions() == null || request.getAnswerOptions().isEmpty()) {
            throw new IllegalArgumentException("Answer options cannot be empty");
        }

        if (request.getCorrectAnswerIndex() == null) {
            throw new IllegalArgumentException("Correct answer index is required");
        }

        if (request.getCorrectAnswerIndex() < 0 ||
            request.getCorrectAnswerIndex() >= request.getAnswerOptions().size()) {

            throw new IllegalArgumentException("Correct answer index is invalid");
        }
    }  
}