package com.sk.edutest.repos;

import com.sk.edutest.document.QuestionBankData;
import com.sk.edutest.dto.Paper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PaperController {

    @Autowired
    PaperRepository paperRepository;

    @Autowired
    QuestionBankRepository questionBankRepository;

    @GetMapping(value = "/papers")
    public List<Paper> getAllPapers() {
        List<Paper> papers = new ArrayList<>();
        papers = paperRepository.findAll();
        return papers;
    }

    @GetMapping(value = "/paper/{pageId}")
    public List<QuestionBankData> getAllQuestions(@PathVariable String pageId) {
        return questionBankRepository.findByPaperCategory(pageId);
    }

    @GetMapping(value = "/paper/{pageCategory}/question/{id}")
    public QuestionBankData getAllQuestions(@PathVariable String pageCategory, @PathVariable String id) {
        return questionBankRepository.findByPaperCategory(pageCategory).stream()
                .filter(q -> q.getQuestionId().equals(id))
                .findAny().orElse(null);
    }

    @GetMapping(value = "/hello")
    public String helloWorld() {
        return "Hello World!!!";
    }

}
