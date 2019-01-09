package com.davidhuang.customrepo.repository;

import com.davidhuang.customrepo.models.BaseModel;

import java.util.List;

public interface CustomRepository<T extends BaseModel, ID> {

    List<T> findAllAndSort(Class<T> cls);

    void appendWithA(Class<T> cls, ID id);

}
