package com.sk.edutest.document;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "QuestionBank")
public class QuestionBankData {
    private String paperCategory;
    private String questionId;
    private String content;
    private Map<String, String> options;
    private String answer;
    private String explanation;

    public QuestionBankData() {
    }

    public String getPaperCategory() {
        return paperCategory;
    }

    public void setPaperCategory(String paperCategory) {
        this.paperCategory = paperCategory;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
