package belajar_spring_restful_api.restful.service;

import belajar_spring_restful_api.restful.entity.Product;
import belajar_spring_restful_api.restful.model.ProductRequestDTO;
import belajar_spring_restful_api.restful.model.ProductResponseDTO;
import belajar_spring_restful_api.restful.repository.ProductRepository;
import belajar_spring_restful_api.restful.util.ConvertNumberToString;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ValidationService validationService;

    public ProductResponseDTO saveUpdate(ProductRequestDTO request){
        validationService.validate(request);
        Product entityToSave = Optional.ofNullable(request.getId())
                .flatMap(productRepository::findById)
                .map(entity -> constructEntity(entity, request))
                .orElseGet(() -> constructEntity(null, request));
        productRepository.save(entityToSave);

        return constructResponseDTO(entityToSave);
    }

    private Product constructEntity(Product entityExist, ProductRequestDTO request){
        if (request == null) return null;
        return Product.builder()
                .id(entityExist != null ? entityExist.getId() : null)
                .productName(request.getProductName())
                .price(request.getPrice())
                .build();
    }

    private ProductResponseDTO constructResponseDTO(Product entity){
        if (entity == null) return null;

        return ProductResponseDTO.builder()
                .id(entity.getId())
                .productName(entity.getProductName())
                .price(ConvertNumberToString.convertToRupiah(entity.getPrice()))
                .build();
    }


}
