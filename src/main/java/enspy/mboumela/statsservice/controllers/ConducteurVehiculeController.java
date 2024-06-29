package enspy.mboumela.statsservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeDto1;
import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeDto2;
import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeDto3;
import enspy.mboumela.statsservice.services.ConducteurVehicleService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ConducteurVehiculeController {
	private final ConducteurVehicleService conducteurVehicleService;
	
    @GetMapping("/get-conducteur-vehicule-data1")
    public ResponseEntity<ConducteurVehiculeDto1> data1() {
		ConducteurVehiculeDto1 conducteurVehiculeDto1 = conducteurVehicleService.calculGain();
    	return new ResponseEntity<>(conducteurVehiculeDto1, HttpStatus.OK);
    }
    
    @GetMapping("/get-conducteur-vehicule-data2")
    public ResponseEntity<ConducteurVehiculeDto2> data2() {
		ConducteurVehiculeDto2 conducteurVehiculeDto2 = conducteurVehicleService.calculNbrVoyagePublie();
    	return new ResponseEntity<>(conducteurVehiculeDto2, HttpStatus.OK);
    }
    
    @GetMapping("/get-conducteur-vehicule-data3")
    public ResponseEntity<ConducteurVehiculeDto3> data3() {
		ConducteurVehiculeDto3 conducteurVehiculeDto3 = conducteurVehicleService.calculAvis();
    	return new ResponseEntity<>(conducteurVehiculeDto3, HttpStatus.OK);
    }
}
