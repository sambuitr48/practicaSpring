package co.cue.edu.practicaSpring.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users") //esta es la tabla a la que se le hará la asociación
@Entity //se define una entidad para que JPA pueda hacer el mapeo objeto-relacional
public class User {
    @Id //Define la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Id autoincremental, estrategia ce generación identity
    private Long id; //Debemos trabajar con LONG O INTEGER, ya que cuando estamos trabajando con id´s y queremos que estos sean autoincrementados
    private String name;
    private int age;
    private String email;
    private String cellphone;
}
