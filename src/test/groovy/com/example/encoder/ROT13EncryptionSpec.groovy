package com.example.encoder

import spock.lang.Specification
import spock.lang.Subject

/**
 * Created by nigel on 2022/8/26.
 *
 * @author nigel
 */
class ROT13EncryptionSpec extends Specification {
    @Subject
    Encryption encryption = new ROT13Encryption()

    def "encrypt null throws IllegalArgumentException"() {
        when:
        encryption.encrypt(null)
        then:
        thrown(IllegalArgumentException)
    }

    def "encrypt 1 letter"() {
        given:
        def input = 'a'
        when:
        def encrypted = encryption.encrypt(input)
        then:
        encrypted == 'n'
    }
}
