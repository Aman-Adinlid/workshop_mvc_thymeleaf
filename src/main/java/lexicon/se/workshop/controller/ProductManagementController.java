package lexicon.se.workshop.controller;

import lexicon.se.workshop.dto.ProductDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.List;

@RequestMapping("/admin/product")

public class ProductManagementController {
    private List<ProductDto> productDtoList;

    @PostConstruct
    public void init() {
        // instantiate array list
        // instantiate ProductDto object
        // add ProductDto to array list
    }

    @GetMapping("/")
    public String getAllProducts(Model model) {
        model.addAttribute("productDtoList", productDtoList);
        return "productManagement";
    }


}
