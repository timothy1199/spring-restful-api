package belajar_spring_restful_api.restful.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {

    @Id
    private Long id;

    @Column(name = "role")
    private String name;

    @Column(name = "role_description")
    private String description;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();
}
