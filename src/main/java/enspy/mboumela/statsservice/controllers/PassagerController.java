package enspy.mboumela.statsservice.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import enspy.mboumela.statsservice.dtos.admin.AdminDto1;
import enspy.mboumela.statsservice.dtos.admin.AdminJournalDto;
import enspy.mboumela.statsservice.dtos.passager.PassagerDto1;
import enspy.mboumela.statsservice.dtos.passager.PassagerDto2;
import enspy.mboumela.statsservice.dtos.passager.PassagerDto3;
import enspy.mboumela.statsservice.dtos.passager.PassagerJournalDto;
import enspy.mboumela.statsservice.services.PassagerService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PassagerController {

	private final PassagerService passagerService;

	@GetMapping("/get-passager-data1")
	public ResponseEntity<PassagerDto1> data1() {
		PassagerDto1 passagerDto1 = passagerService.calculVoyages();
		return new ResponseEntity<>(passagerDto1, HttpStatus.OK);
	}

	@GetMapping("/get-passager-data2")
	public ResponseEntity<PassagerDto2> data2() {
		PassagerDto2 passagerDto2 = passagerService.calculStatistiques();
		return new ResponseEntity<>(passagerDto2, HttpStatus.OK);
	}

	@GetMapping("/get-passager-data3")
	public ResponseEntity<PassagerDto3> data3() {
		PassagerDto3 passagerDto3 = passagerService.calculPassagerDto3();
		return new ResponseEntity<>(passagerDto3, HttpStatus.OK);
	}

	@GetMapping("/get-passager-journal")
	public ResponseEntity<List<PassagerJournalDto>> journal() {
		List<PassagerJournalDto> list = passagerService.calculJournal();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
