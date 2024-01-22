package tn.esprit.tic.arctic.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

import java.util.*;

@Entity
@Table( name = "Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    private Long idFoyer; // Clé primaire
    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    private Set<Bloc> blocs;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}
