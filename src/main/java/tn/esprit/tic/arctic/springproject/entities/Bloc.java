package tn.esprit.tic.arctic.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table( name = "Bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    private Long idBloc; // Clé primaire
    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany(mappedBy="bloc")
    private Set<Chambre> chambres;


// Constructeur et accesseurs (getters) et mutateurs (setters)
}
