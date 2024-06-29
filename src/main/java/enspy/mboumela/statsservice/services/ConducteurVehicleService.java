package enspy.mboumela.statsservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeDto1;
import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeDto2;
import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeDto3;
import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeJournalDto;

@Service
public class ConducteurVehicleService {

	// fonction de data 1
	public ConducteurVehiculeDto1 calculGain() {
		return new ConducteurVehiculeDto1(100.2);
	}
	
	// fonction de data 2
	public ConducteurVehiculeDto2 calculNbrVoyagePublie() {
		return new ConducteurVehiculeDto2(12);
	}
	
	// fonction de data 3
	public ConducteurVehiculeDto3 calculAvis() {
		return new ConducteurVehiculeDto3(26);
	}
	
	// fonction for journal data
		public List<ConducteurVehiculeJournalDto> calculJournal() {
			List<ConducteurVehiculeJournalDto> ConducteurVehiculeJournalDtos = new ArrayList<>();
			ConducteurVehiculeJournalDto ConducteurVehiculeJournalDto1 = new ConducteurVehiculeJournalDto(1, "Antique Fjord hotel", "3605 Parker Rd.",
					"Kriston Watson", "25/05/2023", "Publish", 4.5);
			ConducteurVehiculeJournalDto ConducteurVehiculeJournalDto2 = new ConducteurVehiculeJournalDto(2, "Cozy Retreat Cottage", "123 Main St.",
					"Emma Thompson", "10/06/2023", "Pending", 4.7);
			ConducteurVehiculeJournalDto ConducteurVehiculeJournalDto3 = new ConducteurVehiculeJournalDto(3, "Luxury Beach Villa", "987 Ocean Ave.",
					"Michael Johnson", "12/06/2023", "Rejected", 4.3);
			ConducteurVehiculeJournalDto ConducteurVehiculeJournalDto4 = new ConducteurVehiculeJournalDto(4, "Rustic Mountain Cabin", "456 Pine Rd.", "Sophia Lee",
					"18/06/2023", "Publish", 4.2);
			ConducteurVehiculeJournalDto ConducteurVehiculeJournalDto5 = new ConducteurVehiculeJournalDto(5, "City Center Loft", "789 Broadway St.", "David Brown",
					"20/06/2023", "Pending", 4.8);
			ConducteurVehiculeJournalDto ConducteurVehiculeJournalDto6 = new ConducteurVehiculeJournalDto(6, "Seaside Bungalow", "321 Shoreline Dr.",
					"Olivia Garcia", "22/06/2023", "Publish", 4.6);
			ConducteurVehiculeJournalDto ConducteurVehiculeJournalDto7 = new ConducteurVehiculeJournalDto(7, "Mountain View Chalet", "555 Summit Ave.",
					"James Wilson", "24/06/2023", "Rejected", 4.1);
			ConducteurVehiculeJournalDto ConducteurVehiculeJournalDto8 = new ConducteurVehiculeJournalDto(8, "Urban Studio Apartment", "222 Oak St.",
					"Ava Martinez", "26/06/2023", "Pending", 4.9);
			ConducteurVehiculeJournalDto ConducteurVehiculeJournalDto9 = new ConducteurVehiculeJournalDto(9, "Historic Manor House", "777 Elm Rd.", "Liam Davis",
					"28/06/2023", "Publish", 4.7);
			ConducteurVehiculeJournalDto ConducteurVehiculeJournalDto10 = new ConducteurVehiculeJournalDto(10, "Lakefront Retreat", "444 Lakeview Dr.",
					"Mia Anderson", "30/06/2023", "Pending", 4.4);
			ConducteurVehiculeJournalDtos.add(ConducteurVehiculeJournalDto1);
			ConducteurVehiculeJournalDtos.add(ConducteurVehiculeJournalDto2);
			ConducteurVehiculeJournalDtos.add(ConducteurVehiculeJournalDto3);
			ConducteurVehiculeJournalDtos.add(ConducteurVehiculeJournalDto4);
			ConducteurVehiculeJournalDtos.add(ConducteurVehiculeJournalDto5);
			ConducteurVehiculeJournalDtos.add(ConducteurVehiculeJournalDto6);
			ConducteurVehiculeJournalDtos.add(ConducteurVehiculeJournalDto7);
			ConducteurVehiculeJournalDtos.add(ConducteurVehiculeJournalDto8);
			ConducteurVehiculeJournalDtos.add(ConducteurVehiculeJournalDto9);
			ConducteurVehiculeJournalDtos.add(ConducteurVehiculeJournalDto10);
			return ConducteurVehiculeJournalDtos;
		}

}
