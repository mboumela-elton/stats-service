package enspy.mboumela.statsservice.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import enspy.mboumela.statsservice.dtos.admin.AdminDto1;
import enspy.mboumela.statsservice.dtos.admin.AdminDto2;
import enspy.mboumela.statsservice.dtos.admin.AdminDto3;
import enspy.mboumela.statsservice.dtos.admin.AdminDto4;
import enspy.mboumela.statsservice.dtos.admin.AdminJournalDto;
import enspy.mboumela.statsservice.services.AdminService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AdminController {
	
	private final AdminService adminService; 
	
	@Operation(summary = "renvoyer le revenu, le nombre de voyage et le nombre de type de véhicule")
    @GetMapping("/get-admin-data1")
    public ResponseEntity<List<AdminDto1>> data1() {
		List<AdminDto1> adminDto1 = adminService.calculData1();
    	return new ResponseEntity<>(adminDto1, HttpStatus.OK);
    }
    
	@Operation(summary = "renvoyer le nombre de passagers, de conducteurs avec et sans chauffeur")
    @GetMapping("/get-admin-data2")
    public ResponseEntity<AdminDto2> data2() {
		AdminDto2 adminDto2 = adminService.calculData2();
    	return new ResponseEntity<>(adminDto2, HttpStatus.OK);
    }
    
	@Operation(summary = "renvoyer le nombre de visiteurs et d'utilisateurs")
    @GetMapping("/get-admin-data3")
    public ResponseEntity<AdminDto3> data3() {
    	AdminDto3 adminDto3 = adminService.calculData3();
    	return new ResponseEntity<>(adminDto3, HttpStatus.OK);
    }
    
	@Operation(summary = "renvoyer le taux de satisfaction des utilisateurs")
    @GetMapping("/get-admin-data4")
    public ResponseEntity<AdminDto4> data4() {
		AdminDto4 adminDto4 = adminService.calculData4();
    	return new ResponseEntity<>(adminDto4, HttpStatus.OK);
    }
    
	@Operation(summary = "renvoyer le journal")
    @GetMapping("/get-admin-journal")
    public ResponseEntity<List<AdminJournalDto>> journal() {
    	List<AdminJournalDto> list = adminService.calculJournal();
    	return new ResponseEntity<>(list, HttpStatus.OK);
    }
    
}
