package com.davidhuang.customrepo.repository;

import com.davidhuang.customrepo.models.Test;

import java.util.List;

public interface CustomRepository<T extends Test, ID> {

    List<T> findAllAndSort(Class<T> cls);

}
