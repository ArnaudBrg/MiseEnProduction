package org.polytech.covid.services;

import org.polytech.covid.domain.CentreVaccination;
import org.polytech.covid.repositories.CentreVaccinationRepository;
import java.util.Collection;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;

@Service(value = "CentreVaccinationService")
public class CentreVaccinationService implements CentreVaccinationInterface {
    @Resource
    private CentreVaccinationRepository centreVaccinationRepository;
    @Override
    public Collection<CentreVaccination> getAll_CentreVaccination() {
        return IteratorUtils.toList(centreVaccinationRepository.findAll().iterator());
    }
    @Override
    public CentreVaccination get_CentreVaccination_ByID(Long id) {
        return centreVaccinationRepository.findById(id).orElse(null);
    }
    @Override
    public CentreVaccination create_CentreVaccination(CentreVaccination centre) {
        return centreVaccinationRepository.save(centre);
    }
    @Override
    public CentreVaccination updatePlace(CentreVaccination centre) {
        if (centreVaccinationRepository.existsById(centre.getId())) {
            return centreVaccinationRepository.save(centre);
        } else {
            throw new IllegalArgumentException("CentreVaccination non trouvé.");
        }
    }
    @Override
    public void delete_CentreVaccination(Long id) {
        centreVaccinationRepository.deleteById(id);
    }
}
