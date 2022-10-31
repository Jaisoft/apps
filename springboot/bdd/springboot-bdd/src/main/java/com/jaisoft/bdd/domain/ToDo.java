package com.jaisoft.bdd.domain;

import lombok.*;

@Getter
@Setter
public class ToDo {
 
    private long id;
    private String text;
    private boolean completed;

    public ToDo(long id, String text, boolean completed) {
        this.id = id;
        this.text = text;
        this.completed = completed;
    }

    public ToDo() {
    }

    public ToDo(String text, boolean completed) {
        this.text = text;
        this.completed = completed;
    }

}
