package tn.esprit.tic.arctic.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table( name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private Long idChambre; // Clé primaire
    private Long numeroChambre;
    private TypeChambre typeC;

    @ManyToOne
    Bloc bloc;

    @OneToMany
    private Set<Reservation> reservations;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}

