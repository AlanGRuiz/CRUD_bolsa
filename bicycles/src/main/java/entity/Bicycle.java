package entity;

import lombok.AllArgsConstructor;
import lombok.Data; //ya contiene Getters y Setters
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "PRUEBA")
public class Bicycle implements Serializable{

    private static final long serialVersionUID = 1L; //hibernate??

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "BICI")
    private String bici;

    @Column(name = "CREACION")
    private int anho_creacion;

}