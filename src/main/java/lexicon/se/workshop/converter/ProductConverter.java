package lexicon.se.workshop.converter;

import lexicon.se.workshop.dto.ProductDto;
import lexicon.se.workshop.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductConverter implements Converter<Product, ProductDto> {
    @Override
    public Product toModel(ProductDto dto) {
        return null;
    }

    @Override
    public ProductDto toDto(Product model) {
        return null;
    }

    @Override
    public List<Product> toModels(List<ProductDto> list) {
        return null;
    }

    @Override
    public List<ProductDto> toDto(List<Product> list) {
        return null;
    }
}
