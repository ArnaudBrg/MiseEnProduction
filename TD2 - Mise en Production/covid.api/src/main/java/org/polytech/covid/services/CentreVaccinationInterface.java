package org.polytech.covid.services;
import org.polytech.covid.domain.CentreVaccination;
import java.util.Collection;
public interface CentreVaccinationInterface {
    Collection<CentreVaccination> getAll_CentreVaccination();
    CentreVaccination get_CentreVaccination_ByID(Long id);
    CentreVaccination create_CentreVaccination(CentreVaccination centre);
    CentreVaccination updatePlace(CentreVaccination centre);
    void delete_CentreVaccination(Long id);
}