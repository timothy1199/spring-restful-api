package belajar_spring_restful_api.restful.repository;

import belajar_spring_restful_api.restful.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
