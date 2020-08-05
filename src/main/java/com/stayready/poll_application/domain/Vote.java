package com.stayready.poll_application.domain;

import javax.persistence.*;

@Entity
public class Vote<option> {

    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private option option;

    public option getOption() {
        return option;
    }

    public void setOption(option option) {
        this.option = option;
    }

}