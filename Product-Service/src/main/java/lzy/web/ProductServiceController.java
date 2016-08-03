package lzy.web;

import com.google.common.collect.Lists;
import lzy.vo.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

/**
 * Created by lvzhouyang on 16/8/3.
 */
@RestController
public class ProductServiceController {

    @RequestMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") Long id) {

        sleep();
        return new Product(id, 1L, "T001");
    }


    @RequestMapping("/product")
    public List<Product> getProductsByCompanyId(@RequestParam("companyId") Long companyId) {
        List<Product> products = Lists.newArrayList();

        products.add(new Product(1L, companyId, "T001"));
        products.add(new Product(2L, companyId, "T002"));
        products.add(new Product(3L, companyId, "T003"));
        return products;
    }


    private void sleep() {
        Random rand = new Random();
        int time = rand.nextInt(30);

        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
