package org.polytech.covid.controllers;

        import org.polytech.covid.domain.CentreVaccination;
        import org.polytech.covid.services.CentreVaccinationInterface;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;
        import java.util.Collection;

@RestController
@RequestMapping("/api/CentreVaccination")
public class CentreVaccinationController {

    @Autowired
    private CentreVaccinationInterface centreVaccinationService;

    // Endpoint pour récupérer tous les centres de vaccination
    @GetMapping("/getAll")
    public Collection<CentreVaccination> getAllCentresVaccination() {
        return centreVaccinationService.getAll_CentreVaccination();
    }

    // Endpoint pour récupérer un centre de vaccination par ID
    @GetMapping("/{id}")
    public CentreVaccination getCentreVaccinationById(@PathVariable Long id) {
        return centreVaccinationService.get_CentreVaccination_ByID(id);
    }

    // Endpoint pour créer un nouveau centre de vaccination
    @PostMapping("/create")
    public CentreVaccination createCentreVaccination(@RequestBody CentreVaccination centre) {
        return centreVaccinationService.create_CentreVaccination(centre);
    }

    // Endpoint pour mettre à jour un centre de vaccination
    @PutMapping("/update")
    public CentreVaccination updateCentreVaccination(@RequestBody CentreVaccination centre) {
        return centreVaccinationService.updatePlace(centre);
    }

    // Endpoint pour supprimer un centre de vaccination par ID
    @DeleteMapping("/delete/{id}")
    public void deleteCentreVaccination(@PathVariable Long id) {
        centreVaccinationService.delete_CentreVaccination(id);
    }
}
