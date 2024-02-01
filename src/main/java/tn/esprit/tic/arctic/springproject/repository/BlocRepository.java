package tn.esprit.tic.arctic.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tic.arctic.springproject.entities.Bloc;

import java.util.*;

public interface BlocRepository  extends CrudRepository<Bloc,Long> {

    List<Bloc> findByFoyerUniversiteIdUniversite(Long idUniversite);
}
