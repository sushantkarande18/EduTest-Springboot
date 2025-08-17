package com.sk.edutest.repos;

import com.sk.edutest.dto.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface QuestionRepository extends MongoRepository<Question, String> {
    List<Question> findByPaperCategory(String paperCategory);
}
