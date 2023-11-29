package homework1.onlineStore.storage;

import homework1.onlineStore.model.Product;
import homework1.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class ProductStorage implements Serializable {

    private Set<Product> products = new HashSet<>();

    public void add(Product product) {
        products.add(product);
        StorageSerializeUtil.serializeProductStorage(this);
    }

    public Product getById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public void print() {
        for (Product product : products) {
            System.out.println(products);
        }
    }

    public void delete(String productId){
        for (Product product : products) {
            if (product.getId().equals(productId)){
                products.add(product);
            }
        }
    }
}
