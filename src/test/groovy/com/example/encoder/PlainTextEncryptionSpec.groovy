package com.example.encoder

import spock.lang.Specification
import spock.lang.Subject

/**
 * Created by nigel on 2022/8/26.
 *
 * @author nigel
 */
class PlainTextEncryptionSpec extends Specification {
    @Subject
    Encryption encryption = new PlainTextEncryption()

    def "encrypt return same as input"() {
        given:
        def input = 'abcdefg'
        when:
        def encrypted = encryption.encrypt(input)
        then:
        encrypted == input
    }

    def "encrypt null throws IllegalArgumentException"() {
        when:
        encryption.encrypt(null)
        then:
        thrown(IllegalArgumentException)
    }
}
