package com.example.encoder

import spock.lang.Specification
import spock.lang.Subject

/**
 * Created by nigel on 2022/8/26.
 *
 * @author nigel
 */
class SuperSecretTextEncoderSpec extends Specification {
    def display = Mock(Display)
    def encryption = Mock(Encryption)
    @Subject
    def encoder = new SuperSecretTextEncoder(encryption, display)

    def "encode 0 char"() {
        when:
        encoder.encode('')
        then:
        0 * encryption.encrypt('')
        1 * display.show('', '')
    }

    def "encode a string"() {
        when:
        encoder.encode('abc')
        then:
        1 * encryption.encrypt('abc') >> 'efg'
        1 * display.show('abc', 'efg')
    }

    def "encode empty string"() {
        when:
        encoder.encode('     ')
        then:
        0 * encryption.encrypt(_)
        1 * display.show(_, _)
    }

    def "encode null throws IllegalArgumentException"() {
        when:
        encoder.encode(null)
        then:
        def e = thrown(IllegalArgumentException)
        e.message == 'Input should not be null'
        0 * encryption.encrypt(_)
        0 * display.show(_, _)
    }
}
