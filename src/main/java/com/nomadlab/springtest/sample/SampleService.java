package com.nomadlab.springtest.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@ToString
@Log4j2
@Service
@RequiredArgsConstructor
public class SampleService {

    @Qualifier("nomal")
    private final SampleDAO sampleDAO;
}
