package enspy.mboumela.statsservice.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;

import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeDto1;
import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeDto2;
import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeDto3;
import enspy.mboumela.statsservice.dtos.conducteurVehicule.ConducteurVehiculeJournalDto;
import enspy.mboumela.statsservice.dtos.passager.PassagerDto2;
import enspy.mboumela.statsservice.dtos.passager.PassagerJournalDto;

@Service
public class ConducteurVehicleService {

	// fonction de data 1
	public List<ConducteurVehiculeDto1> calculGain() {
		List<Double> revenus = new ArrayList<>(Arrays.asList(2100.0, 7200.0, 300.0, 0.0, 0.0));
		List<ConducteurVehiculeDto1> list = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			list.add(new ConducteurVehiculeDto1(revenus.get(i)));
		}
		return list;
	}

	// fonction de data 2
	public List<ConducteurVehiculeDto2> calculNbrVoyagePublie() {
		List<Double> revenus = new ArrayList<>(Arrays.asList(100.0, 52.0, 40.0, 2.0, 0.0));
		List<ConducteurVehiculeDto2> list = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			list.add(new ConducteurVehiculeDto2(revenus.get(i)));
		}
		return list;
	}

	// fonction de data 3
	public ConducteurVehiculeDto3 calculAvis() {
		return new ConducteurVehiculeDto3(11.5);
	}

	// fonction for journal data
	public List<ConducteurVehiculeJournalDto> calculJournal() {
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
		List<ConducteurVehiculeJournalDto> conducteurVehiculeJournalDtos = new ArrayList<>();
		conducteurVehiculeJournalDtos.add(new ConducteurVehiculeJournalDto(1, "Passager 1", 150.0, "2023-05-25", "Antique Fjord hotel", true, "Accept", "12:30", 4.5));
		conducteurVehiculeJournalDtos.add(new ConducteurVehiculeJournalDto(2, "Passager 2", 120.0, "2023-06-10", "Cozy Retreat Cottage", true, "Pending", "15:45", 4.7));
		conducteurVehiculeJournalDtos.add(new ConducteurVehiculeJournalDto(3, "Passager 3", 200.0, "2023-06-12", "Luxury Beach Villa", false, "Rejected", "18:20", 4.3));
		conducteurVehiculeJournalDtos.add(new ConducteurVehiculeJournalDto(4, "Passager 4", 90.0, "2023-06-18", "Rustic Mountain Cabin", true, "Accept", "10:00", 4.2));
		conducteurVehiculeJournalDtos.add(new ConducteurVehiculeJournalDto(5, "Passager 5", 180.0, "2023-06-20", "City Center Loft", true, "Pending", "13:40", 4.8));
		conducteurVehiculeJournalDtos.add(new ConducteurVehiculeJournalDto(6, "Passager 6", 130.0, "2023-06-22", "Seaside Bungalow", true, "Accept", "16:15", 4.6));
		conducteurVehiculeJournalDtos.add(new ConducteurVehiculeJournalDto(7, "Passager 7", 110.0, "2023-06-24", "Mountain View Chalet", false, "Rejected", "19:00", 4.1));
		conducteurVehiculeJournalDtos.add(new ConducteurVehiculeJournalDto(8, "Passager 8", 220.0, "2023-06-26", "Urban Studio Apartment", true, "Pending", "11:25", 4.9));
		conducteurVehiculeJournalDtos.add(new ConducteurVehiculeJournalDto(9, "Passager 9", 160.0, "2023-06-28", "Historic Manor House", true, "Accept", "14:50", 4.7));
		conducteurVehiculeJournalDtos.add(new ConducteurVehiculeJournalDto(10, "Passager 10", 100.0, "2023-06-30", "Lakefront Retreat", true, "Pending", "17:30", 4.4));
		return conducteurVehiculeJournalDtos;
	}

}
