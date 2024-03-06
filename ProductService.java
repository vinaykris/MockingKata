package main;

// Service Class
public class ProductService {
    private ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public int getTotalProducts() {
        return productDao.getAllProducts().size();
    }
}
