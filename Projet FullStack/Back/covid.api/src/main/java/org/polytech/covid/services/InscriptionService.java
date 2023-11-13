package org.polytech.covid.services;
import org.polytech.covid.domain.Inscription;
import org.polytech.covid.repositories.InscriptionRepository;
import java.util.Collection;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;

@Service(value = "InscriptionService")
public class InscriptionService implements InscriptionInterface {
    @Resource
    private InscriptionRepository InscriptionRepository;
    @Override
    public Collection<Inscription> getAll_Inscription() {
        return IteratorUtils.toList(InscriptionRepository.findAll().iterator());
    }
    @Override
    public Inscription get_Inscription_ByID(Long id) {
        return InscriptionRepository.findById(id).orElse(null);
    }
    @Override
    public Inscription create_Inscription(Inscription centre) {
        return InscriptionRepository.save(centre);
    }
    @Override
    public Inscription updatePlace(Inscription centre) {
        if (InscriptionRepository.existsById(centre.getId())) {
            return InscriptionRepository.save(centre);
        } else {
            throw new IllegalArgumentException("Inscription non trouvé.");
        }
    }
    @Override
    public void delete_Inscription(Long id) {
        InscriptionRepository.deleteById(id);
    }
}
