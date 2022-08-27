package com.example.encoder;

/**
 * Created by nigel on 2022/8/26.
 *
 * @author nigel
 */
public class SuperSecretTextEncoder {

  private Encryption encryption;
  private Display display;

  public SuperSecretTextEncoder(Encryption encryption, Display display) {
    this.encryption = encryption;
    this.display = display;
  }

  public void encode(String plainText) {
    if (plainText == null) {
      throw new IllegalArgumentException("Input should not be null");
    }
    display.show(plainText, plainText.trim().isEmpty() ? plainText : encryption.encrypt(plainText));
  }
}
