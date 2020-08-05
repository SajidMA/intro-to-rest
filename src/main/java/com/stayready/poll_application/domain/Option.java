package com.stayready.poll_application.domain;

import org.springframework.data.annotation.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Option<string> {

    @Id
    @GeneratedValue
    @Column(name = "OPTION_ID")
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "OPTION_VALUE")
    private string value;

    public string getValue() {
        return value;
    }

    public void setValue(string value) {
        this.value = value;
    }

}