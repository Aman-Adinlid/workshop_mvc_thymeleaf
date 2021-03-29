package lexicon.se.workshop.converter;

import lexicon.se.workshop.dto.ProductDetailsDto;
import lexicon.se.workshop.dto.ProductDto;
import lexicon.se.workshop.entity.ProductDetails;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDetailsConverter implements Converter<ProductDetails, ProductDetailsDto> {
    @Override
    public ProductDetails toModel(ProductDetailsDto dto) {
        return null;
    }

    @Override
    public ProductDetailsDto toDto(ProductDetails model) {
        return null;
    }

    @Override
    public List<ProductDetails> toModels(List<ProductDetailsDto> list) {
        return null;
    }

    @Override
    public List<ProductDetailsDto> toDto(List<ProductDetails> list) {
        return null;
    }
}
