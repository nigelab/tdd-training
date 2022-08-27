package com.example.encoder.pos;

/**
 * Created by nigel on 2022/8/25.
 *
 * @author nigel
 */
public class PointOfSales {

  private ProductRepo repo;
  private Display display;

  public PointOfSales(ProductRepo repo, Display display) {
    this.repo = repo;
    this.display = display;
  }

  public void sell(String barcode) {
    if (barcode != null) {
      Product product = repo.getProduct(barcode);
      display.show(product.name(), product.price());
    }
  }
}
