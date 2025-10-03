package belajar_spring_restful_api.restful.repository;

import belajar_spring_restful_api.restful.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
