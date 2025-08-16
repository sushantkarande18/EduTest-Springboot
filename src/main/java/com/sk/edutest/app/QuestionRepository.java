package com.sk.edutest.app;

import com.sk.edutest.dto.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface QuestionRepository extends MongoRepository<Question, String> {
    List<Question> findByPaperId(String paperId);
}
