package tn.esprit.tic.arctic.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    private Long idUniversite; // Clé primaire
    private String nomUniversite;
    private String adresse;
// Constructeur et accesseurs (getters) et mutateurs (setters)

    @OneToOne
    private Foyer foyer;
}
