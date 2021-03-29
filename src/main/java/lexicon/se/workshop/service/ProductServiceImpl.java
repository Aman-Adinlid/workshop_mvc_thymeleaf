package lexicon.se.workshop.service;

import lexicon.se.workshop.dto.ProductDto;
import lexicon.se.workshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
//DI ( dependency injection)

    ProductRepository productRepository;

    @Autowired

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public ProductDto saveOrUpdate(ProductDto productDto) {
        return null;
    }

    @Override
    public List<ProductDto> getAll() {
        return null;
    }

    @Override
    public ProductDto findById(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<ProductDto> findByName(String name) {
        return null;
    }
}
