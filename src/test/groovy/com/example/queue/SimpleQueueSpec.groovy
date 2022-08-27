package com.example.queue


import spock.lang.Specification

/**
 * Created by nigel on 2022/8/24.
 *
 * @author nigel
 */
class SimpleQueueSpec extends Specification {
    def "is empty after queue creation"() {
        SimpleQueue queue = new SimpleQueue()

        expect:
        queue.isEmpty()
    }

    def "size is 0 after queue creation"() {
        SimpleQueue queue = new SimpleQueue()

        expect:
        queue.size() == 0
    }

    def "is not empty after add 1 element"() {
        given:
        SimpleQueue queue = new SimpleQueue()
        when:
        queue.add('ele1')
        then:
        !queue.isEmpty()
    }

    def "size is 1 after add 1 element"() {
        given:
        SimpleQueue queue = new SimpleQueue()
        when:
        queue.add('ele1')
        then:
        queue.size() == 1
    }

    def "size is 0 after add and peek"() {
        given:
        SimpleQueue queue = new SimpleQueue()
        queue.add('ele1')
        when:
        queue.peek()
        then:
        queue.size() == 0
    }

    def "return to empty after add and peek"() {
        given:
        SimpleQueue queue = new SimpleQueue()
        queue.add('ele1')
        when:
        queue.peek()
        then:
        queue.isEmpty()
    }

    def "should peek added element"() {
        given:
        SimpleQueue queue = new SimpleQueue()
        queue.add('ele1')
        when:
        def element = queue.peek()
        then:
        element == 'ele1'
    }

    def "size increase after each add"() {
        given:
        SimpleQueue queue = new SimpleQueue()
        queue.add('ele1')
        when:
        queue.add('ele2')
        then:
        queue.size() == 2
    }

    def "size decrease after each peek"() {
        given:
        SimpleQueue queue = new SimpleQueue()
        queue.add('ele1')
        queue.add('ele2')
        when:
        queue.peek()
        then:
        queue.size() == 1
    }

    def "peek return null after queue creation"() {
        given:
        SimpleQueue queue = new SimpleQueue()
        when:
        def element = queue.peek()
        then:
        element == null
    }

    def "add to a full queue"() {
        given:
        SimpleQueue queue = new SimpleQueue()
        for (int i = 0; i < 10; i++) {
            queue.add('ele' + i)
        }
        when:
        queue.add('full')
        then:
        thrown(QueueFullException.class)
    }

    def "peek should return same order as add"() {
        given:
        SimpleQueue queue = new SimpleQueue()
        for (int i = 0; i < 10; i++) {
            queue.add('ele' + i)
        }
        when:
        def result = []
        for (int i = 0; i < 10; i++) {
            result.add(queue.peek())
        }
        then:
        result == ['ele0', 'ele1', 'ele2', 'ele3', 'ele4', 'ele5', 'ele6', 'ele7', 'ele8', 'ele9']
    }

}
