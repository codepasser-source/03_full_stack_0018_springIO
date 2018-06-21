package com.ellenchia.springio.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
//@Profile(INITIALIZE)
public class DatabaseInitializer {

    @Autowired
    private DataReader dataReader;

    @Autowired
    private DataCreator dataCreator;

    @PostConstruct
    private void initialize() {
    }
}
