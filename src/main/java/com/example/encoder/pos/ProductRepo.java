package com.example.encoder.pos;

/**
 * Created by nigel on 2022/8/25.
 *
 * @author nigel
 */
public interface ProductRepo {
  Product getProduct(String barcode);
}
