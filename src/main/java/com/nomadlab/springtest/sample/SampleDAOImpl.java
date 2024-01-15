package com.nomadlab.springtest.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("nomal")
public class SampleDAOImpl implements SampleDAO{
}
