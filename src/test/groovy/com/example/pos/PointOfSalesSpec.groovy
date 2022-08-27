package com.example.pos

import com.example.encoder.pos.Display
import com.example.encoder.pos.PointOfSales
import com.example.encoder.pos.Product
import com.example.encoder.pos.ProductRepo
import spock.lang.Specification

/**
 * Created by nigel on 2022/8/25.
 *
 * @author nigel
 */
class PointOfSalesSpec extends Specification {
    def "no barcode is scanned"() {
        given:
        ProductRepo repo = Mock(ProductRepo)
        Display display = Mock(Display)
        PointOfSales pos = new PointOfSales(repo, display)

        when:
        pos.sell(null)

        then:
        0 * repo.getProduct(_)
        0 * display.show(_, _)
    }

    def "scan one barcode should display name and price"() {
        given:
        ProductRepo repo = Mock(ProductRepo)
        Display display = Mock(Display)
        PointOfSales pos = new PointOfSales(repo, display)

        when:
        pos.sell("123456")

        then:
        1 * repo.getProduct("123456") >> new Product('CocaCola', '$1.0')
        1 * display.show('CocaCola', '$1.0')
    }
}
