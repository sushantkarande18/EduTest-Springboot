package com.sk.edutest.app;

import com.sk.edutest.dto.Paper;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaperRepository extends MongoRepository<Paper, String> {
}
