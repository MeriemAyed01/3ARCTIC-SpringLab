package tn.esprit.tic.arctic.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table( name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    private Long idReservation; // Clé primaire
    @Temporal(TemporalType.DATE)
    private Date anneUniversitaire;
    private Boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
// Constructeur et accesseurs (getters) et mutateurs (setters)
}
