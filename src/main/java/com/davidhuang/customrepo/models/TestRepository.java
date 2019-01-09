package com.davidhuang.customrepo.models;

import com.davidhuang.customrepo.repository.CustomRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<Test, Long>, CustomRepository<Test, Long> {
}
