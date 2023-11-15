package org.polytech.covid.repositories;
        import org.polytech.covid.domain.Inscription;
        import org.springframework.data.repository.CrudRepository;

public interface InscriptionRepository extends CrudRepository<Inscription, Long> {
    Inscription findByNom(String nom);
}
