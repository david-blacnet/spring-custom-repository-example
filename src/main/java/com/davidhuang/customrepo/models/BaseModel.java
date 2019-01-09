package com.davidhuang.customrepo.models;

public abstract class BaseModel implements Comparable<BaseModel> {
    public abstract Long getId();

    @Override
    public String toString() {
        return String.format("Test[id=%d]", getId());
    }

    @Override
    public int compareTo(BaseModel o) {
        if (o.getId().compareTo(getId()) > 0) {
            return 1;
        } else if (o.getId().compareTo(getId()) == 0) {
            return 0;
        }
        return -1;
    }
}
