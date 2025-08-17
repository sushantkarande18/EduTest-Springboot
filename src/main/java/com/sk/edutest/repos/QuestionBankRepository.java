package com.sk.edutest.repos;

import com.sk.edutest.document.QuestionBankData;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface QuestionBankRepository extends MongoRepository<QuestionBankData, String> {
    List<QuestionBankData> findByPaperCategory(String pageCategory);
}
