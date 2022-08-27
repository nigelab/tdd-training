package com.example


import spock.lang.Specification

/**
 * Created by nigel on 2022/8/24.
 *
 * @author nigel
 */
class StackSpec extends Specification {
    void setup() {
    }

    void cleanup() {
    }

    def "IsEmpty after creation"() {
        Stack stack = new Stack()

        expect:
        stack.isEmpty()
    }

    def "Size is zero after creation"(){
        Stack stack = new Stack()

        expect:
        stack.size() == 0
    }
}
