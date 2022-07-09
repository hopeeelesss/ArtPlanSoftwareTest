package web.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pets", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
@Data
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String type;

    private Date birthdate;

    private char gender;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Pet(String type, Date birthdate, char gender, String name) {
        this.type = type;
        this.birthdate = birthdate;
        this.gender = gender;
        this.name = name;
    }

    public Pet(){

    }
}
