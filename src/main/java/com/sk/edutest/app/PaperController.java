package com.sk.edutest.app;

import com.sk.edutest.dto.Paper;
import com.sk.edutest.dto.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PaperController {

    @Autowired
    PaperRepository paperRepository;

    @Autowired
    QuestionRepository questionRepository;


    @GetMapping(value = "/questions")
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @GetMapping(value = "/papers")
    public List<Paper> getAllPapers() {
        List<Paper> papers = new ArrayList<>();
        papers = paperRepository.findAll();
        papers.forEach(p -> {
            p.setQuestions(questionRepository.findByPaperId(p.getPaperId()));
        });
        return papers;
    }


    @GetMapping(value = "/hello")
    public String helloWorld() {
        return "Hello World!!!";
    }
}
