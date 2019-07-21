package com.facgg.tdd.basic

import spock.lang.Specification
import spock.lang.Unroll

class CalculatorTest extends Specification {

    void setup() {}

    void setupSpec() {}

    void cleanup() {}

    void cleanupSpec() {}


    def "숫자를 더한다."() {
        given:
            def 계산기 = Calculator.PLUS
        when:
            int 결과값 = 계산기.calculate(7, 5)
        then:
            결과값 == 10
    }

    def "두 개의 값을 입력하면 더한 값이 반환된다. [값1: #value1, 값2: #value2, 결과: #result] "() {
        given:
            def 계산기 = Calculator.PLUS
        expect:
            계산기.calculate(value1, value2) == result
        where:
            value1  |   value2  |   result
            5       |   10      |   15
            7       |   8       |   20
            10      |   -5      |   5
    }

    def "숫자를 나눈다."() {
        given:
            def 계산기 = Calculator.DIVIDE
        when:
            int 결과값 = 계산기.calculate(10, 3)
        then:
            결과값 == 5
            System.out.println("#div")
    }
}
