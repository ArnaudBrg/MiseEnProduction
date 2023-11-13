package org.polytech.covid.controllers;

        import org.polytech.covid.domain.Inscription;
        import org.polytech.covid.services.InscriptionInterface;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;
        import java.util.Collection;

@RestController
@RequestMapping("/api/Inscription")
public class InscriptionController {

    @Autowired
    private InscriptionInterface InscriptionService;

    // Endpoint pour récupérer tous les centres de vaccination
    @GetMapping("/getAll")
    public Collection<Inscription> getAllCentresVaccination() {
        return InscriptionService.getAll_Inscription();
    }

    // Endpoint pour récupérer un centre de vaccination par ID
    @GetMapping("/{id}")
    public Inscription getInscriptionById(@PathVariable Long id) {
        return InscriptionService.get_Inscription_ByID(id);
    }

    // Endpoint pour créer un nouveau centre de vaccination
    @PostMapping("/create")
    public Inscription createInscription(@RequestBody Inscription centre) {
        return InscriptionService.create_Inscription(centre);
    }

    // Endpoint pour mettre à jour un centre de vaccination
    @PutMapping("/update")
    public Inscription updateInscription(@RequestBody Inscription centre) {
        return InscriptionService.updatePlace(centre);
    }

    // Endpoint pour supprimer un centre de vaccination par ID
    @DeleteMapping("/delete/{id}")
    public void deleteInscription(@PathVariable Long id) {
        InscriptionService.delete_Inscription(id);
    }
}
