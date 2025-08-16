package com.sk.edutest.app;

import com.sk.edutest.dto.Paper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaperController {

    @Autowired
    PaperRepository paperRepository;

    @GetMapping(value = "/papers")
    public List<Paper> getAllPapers() {
        return paperRepository.findAll();
    }

    @GetMapping(value = "/hello")
    public String helloWorld() {
        return "Hello World!!!";
    }
}
