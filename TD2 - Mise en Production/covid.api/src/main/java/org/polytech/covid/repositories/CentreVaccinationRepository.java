package org.polytech.covid.repositories;
        import org.polytech.covid.domain.CentreVaccination;
        import org.springframework.data.repository.CrudRepository;

public interface CentreVaccinationRepository extends CrudRepository<CentreVaccination, Long> {
    CentreVaccination findByNom(String nom);
}
