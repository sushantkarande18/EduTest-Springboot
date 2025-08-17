package com.sk.edutest.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Paper")
public class PaperData {
    private String paperId;
    private String paperName;

    public PaperData() {
    }

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

}
