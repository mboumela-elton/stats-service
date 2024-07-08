package enspy.mboumela.statsservice.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeDto1;
import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeDto2;
import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeDto3;
import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeJournalDto;
import enspy.mboumela.statsservice.services.ConducteurVehicleService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ConducteurVehiculeController {
	private final ConducteurVehicleService conducteurVehicleService;
	
	@Operation(summary = "renvoyer le gain sur diverses périodes")
    @GetMapping("/get-conducteur-vehicule-data1")
    public ResponseEntity<List<ConducteurVehiculeDto1>> data1() {
		List<ConducteurVehiculeDto1> conducteurVehiculeDto1 = conducteurVehicleService.calculGain();
    	return new ResponseEntity<>(conducteurVehiculeDto1, HttpStatus.OK);
    }
    
	@Operation(summary = "renvoyer le nombre de voyages publiés")
    @GetMapping("/get-conducteur-vehicule-data2")
    public ResponseEntity<List<ConducteurVehiculeDto2>> data2() {
		List<ConducteurVehiculeDto2> conducteurVehiculeDto2 = conducteurVehicleService.calculNbrVoyagePublie();
    	return new ResponseEntity<>(conducteurVehiculeDto2, HttpStatus.OK);
    }
    
	@Operation(summary = "renvoyer le nombre d'avis")
    @GetMapping("/get-conducteur-vehicule-data3")
    public ResponseEntity<ConducteurVehiculeDto3> data3() {
		ConducteurVehiculeDto3 conducteurVehiculeDto3 = conducteurVehicleService.calculAvis();
    	return new ResponseEntity<>(conducteurVehiculeDto3, HttpStatus.OK);
    }
    
	@Operation(summary = "renvoyer le journal")
	@GetMapping("/get-conducteur-vehicule-journal")
	public ResponseEntity<List<ConducteurVehiculeJournalDto>> journal() {
		List<ConducteurVehiculeJournalDto> list = conducteurVehicleService.calculJournal();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
