package web.dto;

import lombok.Data;
import web.model.User;

import java.sql.Date;

@Data
public class PetDTO {
    private String type;

    private Date birthdate;

    private char gender;

    private String name;
}
