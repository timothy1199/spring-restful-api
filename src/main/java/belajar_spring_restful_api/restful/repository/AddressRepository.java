package belajar_spring_restful_api.restful.repository;

import belajar_spring_restful_api.restful.entity.Address;
import belajar_spring_restful_api.restful.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, String> {

    Optional<Address> findFirstByContactAndId(Contact contact, String id);

    List<Address> findAllByContact(Contact contact);
}
