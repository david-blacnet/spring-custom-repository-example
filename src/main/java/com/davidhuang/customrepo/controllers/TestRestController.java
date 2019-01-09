package com.davidhuang.customrepo.controllers;

import com.davidhuang.customrepo.CustomRepoExampleBoot;
import com.davidhuang.customrepo.models.Test;
import com.davidhuang.customrepo.models.TestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestRestController {

    private static final Logger log = LoggerFactory.getLogger(CustomRepoExampleBoot.class);

    @Autowired
    private TestRepository testRepository;

    @GetMapping()
    public List<Test> get() {
        log.info("Entering Get Method.");
        Iterable<Test> iterable = testRepository.findAll();
        List<Test> list = new ArrayList<>();
        iterable.forEach(list::add);

        return list;
    }

    @GetMapping("/sort/desc")
    public List<Test> getAndSort() {
        log.info("Entering Get Method With Descending Sort.");
        return testRepository.findAllAndSort(Test.class);
    }

}
