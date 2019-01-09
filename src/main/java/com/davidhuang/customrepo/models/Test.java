package com.davidhuang.customrepo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "TEST")
public class Test implements Comparable<Test> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Test[id=%d, name=%s]", id, name);
    }

    @Override
    public int compareTo(Test o) {
        if (o.id.compareTo(id) > 0) {
            return 1;
        } else if (o.id.compareTo(id) == 0) {
            return 0;
        }
        return -1;
    }
}
