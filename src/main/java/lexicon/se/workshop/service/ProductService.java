package lexicon.se.workshop.service;

import lexicon.se.workshop.dto.ProductDto;

import java.util.List;

public interface ProductService {

    ProductDto saveOrUpdate(ProductDto productDto);

    List<ProductDto> getAll();

    ProductDto findById(int id);

    void delete(int id);

    List<ProductDto> findByName(String name);


}
