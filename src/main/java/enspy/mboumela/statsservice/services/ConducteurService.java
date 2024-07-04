package enspy.mboumela.statsservice.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;

import enspy.mboumela.statsservice.dtos.conducteur.ConducteurDto1;
import enspy.mboumela.statsservice.dtos.conducteur.ConducteurDto2;
import enspy.mboumela.statsservice.dtos.conducteur.ConducteurDto3;
import enspy.mboumela.statsservice.dtos.conducteur.ConducteurJournalDto;

@Service
public class ConducteurService {

	// fonction de data 1
	public List<ConducteurDto1> calculNbrVoyageEffectue() {
		List<Double> revenus = new ArrayList<>(Arrays.asList(512.0, 250.0, 113.0, 90.0, 10.0));
		List<ConducteurDto1> list = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			list.add(new ConducteurDto1(revenus.get(i)));
		}
		return list;
	}

	// fonction de data 2
	public List<ConducteurDto2> calculAvis() {
		List<Double> revenus = new ArrayList<>(Arrays.asList(11.0, 2.0, 0.0, 0.0, 0.0));
		List<ConducteurDto2> list = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			list.add(new ConducteurDto2(revenus.get(i)));
		}
		return list;
	}

	// fonction de data 3
	public List<ConducteurDto3> calculNbrKm() {
		List<Double> revenus = new ArrayList<>(Arrays.asList(50000.0, 22200.0, 10300.0, 1400.0, 500.0));
		List<ConducteurDto3> list = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			list.add(new ConducteurDto3(revenus.get(i)));
		}
		return list;
	}

	// fonction for journal data
	public List<ConducteurJournalDto> calculJournal() {
//		try {
//			// Analyser la réponse JSON de l'API GraphQL
//			JsonNode jsonNode = new ObjectMapper().readTree(graphQLResponse);
//			JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//			// Initialiser le journal d'activité
//			StringBuilder activityLog = new StringBuilder();
//			activityLog.append("Journal d'activité des clients :\n\n");
//
//			// Parcourir les données des personnes
//			for (JsonNode personneNode : personnesNode) {
//				boolean hasVehicle = personneNode.path("a_vehicule").asBoolean();
//				if (hasVehicle) {
//					String nom = personneNode.path("nom").asText();
//					String prenom = personneNode.path("prenom").asText();
//					String destination = personneNode.path("destination").asText();
//					double moneySpent = personneNode.path("depenses").asDouble();
//					String vehicleId = personneNode.path("vehicule_id").asText();
//
//					activityLog.append("Nom : ").append(nom).append(" ").append(prenom).append("\n");
//					activityLog.append("Destination : ").append(destination).append("\n");
//					activityLog.append("Dépenses : ").append(moneySpent).append(" €").append("\n");
//					activityLog.append("Véhicule utilisé : ").append(vehicleId).append("\n");
//					activityLog.append("\n");
//				}
//			}
//
//			// Afficher le journal d'activité
//			System.out.println(activityLog.toString());
//		} catch (IOException e) {
//			// Gérer les erreurs de lecture du JSON
//			e.printStackTrace();
//		}
		List<ConducteurJournalDto> ConducteurJournalDtos = new ArrayList<>();
		ConducteurJournalDtos.add(new ConducteurJournalDto(1, "Passager 1", 150.0, "2023-05-25", "Antique Fjord hotel", true, "Accept", "12:30", 4.5));
		ConducteurJournalDtos.add(new ConducteurJournalDto(2, "Passager 2", 120.0, "2023-06-10", "Cozy Retreat Cottage", true, "Pending", "15:45", 4.7));
		ConducteurJournalDtos.add(new ConducteurJournalDto(3, "Passager 3", 200.0, "2023-06-12", "Luxury Beach Villa", false, "Rejected", "18:20", 4.3));
		ConducteurJournalDtos.add(new ConducteurJournalDto(4, "Passager 4", 90.0, "2023-06-18", "Rustic Mountain Cabin", true, "Accept", "10:00", 4.2));
		ConducteurJournalDtos.add(new ConducteurJournalDto(5, "Passager 5", 180.0, "2023-06-20", "City Center Loft", true, "Pending", "13:40", 4.8));
		ConducteurJournalDtos.add(new ConducteurJournalDto(6, "Passager 6", 130.0, "2023-06-22", "Seaside Bungalow", true, "Accept", "16:15", 4.6));
		ConducteurJournalDtos.add(new ConducteurJournalDto(7, "Passager 7", 110.0, "2023-06-24", "Mountain View Chalet", false, "Rejected", "19:00", 4.1));
		ConducteurJournalDtos.add(new ConducteurJournalDto(8, "Passager 8", 220.0, "2023-06-26", "Urban Studio Apartment", true, "Pending", "11:25", 4.9));
		ConducteurJournalDtos.add(new ConducteurJournalDto(9, "Passager 9", 160.0, "2023-06-28", "Historic Manor House", true, "Accept", "14:50", 4.7));
		ConducteurJournalDtos.add(new ConducteurJournalDto(10, "Passager 10", 100.0, "2023-06-30", "Lakefront Retreat", true, "Pending", "17:30", 4.4));
		return ConducteurJournalDtos;
	}

}
