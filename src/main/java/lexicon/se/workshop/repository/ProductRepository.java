package lexicon.se.workshop.repository;

import lexicon.se.workshop.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

    List<Product> findByProductDetails_Description(String description);


}
