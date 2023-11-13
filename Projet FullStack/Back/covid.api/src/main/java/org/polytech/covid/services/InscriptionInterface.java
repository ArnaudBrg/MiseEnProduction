package org.polytech.covid.services;
import org.polytech.covid.domain.Inscription;
import java.util.Collection;
public interface InscriptionInterface {
    Collection<Inscription> getAll_Inscription();
    Inscription get_Inscription_ByID(Long id);
    Inscription create_Inscription(Inscription centre);
    Inscription updatePlace(Inscription centre);
    void delete_Inscription(Long id);
}