package web.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="roles")
@Data

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Role() {
    }
}