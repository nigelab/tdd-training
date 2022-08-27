package com.example.encoder;

/**
 * Created by nigel on 2022/8/26.
 *
 * @author nigel
 */
public class PlainTextEncryption implements Encryption {
  @Override
  public String encrypt(String plainText) {
    if (plainText == null) {
      throw new IllegalArgumentException("Input should not be null");
    }
    return plainText;
  }
}
