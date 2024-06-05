package co.cue.edu.practicaSpring.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
/*@Table(name = "users")
@Entity*/
public class User {
    //@Id
    private String id;
    private String name;
    private int age;
    private String email;
    private String cellphone;
}
