package enspy.mboumela.statsservice.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import enspy.mboumela.statsservice.dtos.passager.PassagerDto1;
import enspy.mboumela.statsservice.dtos.passager.PassagerDto2;
import enspy.mboumela.statsservice.dtos.passager.PassagerDto3;
import enspy.mboumela.statsservice.dtos.passager.PassagerJournalDto;

@Service
public class PassagerService {
	
	// fonction pour le data 1
	public PassagerDto1 calculVoyages() {
		List<String> cities = new ArrayList<>(Arrays.asList("Bangangte", "Yaounde", "Douala", "Garoua", "Bamenda"));
		List<Long> citiesPopulation = new ArrayList<>(Arrays.asList(5000L, 4000L, 3000L, 2000L, 1000L));
		List<String> cars = new ArrayList<>(Arrays.asList("Voiture", "monospace", "moto", "Bus"));
		List<Long> carsNbr = new ArrayList<>(Arrays.asList(5000L, 3000L, 2000L, 1000L));
		return new PassagerDto1(cities, citiesPopulation, cars, carsNbr);
	}

	// fonction pour le data 2
	public double calculKm() {
		return 256;
	}
	
	public double calculNbrVoyage() {
		return 101;
	}
	
	public PassagerDto2 calculStatistiques() {
		return new PassagerDto2(calculKm(), calculNbrVoyage());
	}
	
	// fonction pour data 3
	public double calculPointFidelite() {
		return 86;
	}
	
	public long calculNbrVehiculeEmprunte() {
		return 21;
	}
	
	public long calculDestinationVisitee() {
		return 15;
	}
	
	public double calculDepense() {
		return 11;
	}
	
	public PassagerDto3 calculPassagerDto3() {
		return new PassagerDto3(calculPointFidelite(), calculNbrVehiculeEmprunte(), calculDestinationVisitee(), calculDepense());
	}
	
	// fonction for journal data
		public List<PassagerJournalDto> calculJournal() {
			List<PassagerJournalDto> passagerJournalDtos = new ArrayList<>();
			PassagerJournalDto passagerJournalDto1 = new PassagerJournalDto(1, "Antique Fjord hotel", "3605 Parker Rd.",
					"Kriston Watson", "25/05/2023", "Accept", 4.5);
			PassagerJournalDto passagerJournalDto2 = new PassagerJournalDto(2, "Cozy Retreat Cottage", "123 Main St.",
					"Emma Thompson", "10/06/2023", "Pending", 4.7);
			PassagerJournalDto passagerJournalDto3 = new PassagerJournalDto(3, "Luxury Beach Villa", "987 Ocean Ave.",
					"Michael Johnson", "12/06/2023", "Rejected", 4.3);
			PassagerJournalDto passagerJournalDto4 = new PassagerJournalDto(4, "Rustic Mountain Cabin", "456 Pine Rd.", "Sophia Lee",
					"18/06/2023", "Accept", 4.2);
			PassagerJournalDto passagerJournalDto5 = new PassagerJournalDto(5, "City Center Loft", "789 Broadway St.", "David Brown",
					"20/06/2023", "Pending", 4.8);
			PassagerJournalDto passagerJournalDto6 = new PassagerJournalDto(6, "Seaside Bungalow", "321 Shoreline Dr.",
					"Olivia Garcia", "22/06/2023", "Accept", 4.6);
			PassagerJournalDto passagerJournalDto7 = new PassagerJournalDto(7, "Mountain View Chalet", "555 Summit Ave.",
					"James Wilson", "24/06/2023", "Rejected", 4.1);
			PassagerJournalDto passagerJournalDto8 = new PassagerJournalDto(8, "Urban Studio Apartment", "222 Oak St.",
					"Ava Martinez", "26/06/2023", "Pending", 4.9);
			PassagerJournalDto passagerJournalDto9 = new PassagerJournalDto(9, "Historic Manor House", "777 Elm Rd.", "Liam Davis",
					"28/06/2023", "Accept", 4.7);
			PassagerJournalDto passagerJournalDto10 = new PassagerJournalDto(10, "Lakefront Retreat", "444 Lakeview Dr.",
					"Mia Anderson", "30/06/2023", "Pending", 4.4);
			passagerJournalDtos.add(passagerJournalDto1);
			passagerJournalDtos.add(passagerJournalDto2);
			passagerJournalDtos.add(passagerJournalDto3);
			passagerJournalDtos.add(passagerJournalDto4);
			passagerJournalDtos.add(passagerJournalDto5);
			passagerJournalDtos.add(passagerJournalDto6);
			passagerJournalDtos.add(passagerJournalDto7);
			passagerJournalDtos.add(passagerJournalDto8);
			passagerJournalDtos.add(passagerJournalDto9);
			passagerJournalDtos.add(passagerJournalDto10);
			return passagerJournalDtos;
		}
}
