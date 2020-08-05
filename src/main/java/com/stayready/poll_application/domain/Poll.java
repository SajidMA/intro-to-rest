package com.stayready.poll_application.domain;

import javax.persistence.*;

@Entity
public class Poll<string, set> {

    @Id
    @GeneratedValue
    @Column(name = "POLL_ID")
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "QUESTION")
    private string question;

    public string getQuestion() {
        return question;
    }

    public void setQuestion(string question) {
        this.question = question;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLL_ID")
    @OrderBy
    private set option;

    public set getOption() {
        return option;
    }

    public void setOption(set option) {
        this.option = option;
    }

}