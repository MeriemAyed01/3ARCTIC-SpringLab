package tn.esprit.tic.arctic.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tic.arctic.springproject.entities.Bloc;
import tn.esprit.tic.arctic.springproject.entities.Chambre;
import tn.esprit.tic.arctic.springproject.entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends CrudRepository<Chambre,Long> {
    List<Chambre> findByBlocIdBlocAndTypeC(Long idBloc, TypeChambre typeC);

    List<Chambre> findByReservationsEstValide(boolean estValide);

    List<Chambre> findByBlocIdBlocAndBlocCapaciteBlocGreaterThen(Long idBloc,Long capaciteBloc);
}
