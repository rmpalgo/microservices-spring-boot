package com.microservicesbook.socialmultiplication.service;

import com.microservicesbook.socialmultiplication.domain.Multiplication;

public interface MultiplicationService {

    /**
     * Creates a Multiplication object with random-generated factors
     * between 11 and 99.
     *
     * @return a Multiplication object with random factors
     */

    Multiplication createRandomMultiplication();

}
