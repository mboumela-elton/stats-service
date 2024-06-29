package enspy.mboumela.statsservice.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import enspy.mboumela.statsservice.dtos.admin.AdminDto1;
import enspy.mboumela.statsservice.dtos.admin.AdminDto2;
import enspy.mboumela.statsservice.dtos.admin.AdminDto3;
import enspy.mboumela.statsservice.dtos.admin.AdminDto4;
import enspy.mboumela.statsservice.dtos.admin.AdminJournalDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminService {

	private final ApiCallService apiCallService;

	// fonctions for data 1
	public double calculRevenu() {
//        String query = "{ passagers { id, profil, voyages { paiement { montant } } } }";
//        String response = apiCallService.callGraphQLApi("https://your-graphql-api.com/graphql", query);
//
//        double sommeTotale = 0;
//
//        // Analyser la réponse GraphQL pour récupérer les montants de paiement de tous les voyages des passagers
//        JsonNode jsonNode;
//		try {
//			jsonNode = new ObjectMapper().readTree(response);
//	        JsonNode passagersNode = jsonNode.path("data").path("passagers");
//
//	        for (JsonNode passagerNode : passagersNode) {
//	            if (passagerNode.path("profil").asText().equals("passager")) {
//	                JsonNode voyagesNode = passagerNode.path("voyages");
//	                for (JsonNode voyageNode : voyagesNode) {
//	                    double montantPaiement = voyageNode.path("paiement").path("montant").asDouble();
//	                    sommeTotale += montantPaiement;
//	                }
//	            }
//	        }
//
//		} catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        return sommeTotale;
		return 250;
	}

	public double calculNombreVoyage() {
//        String query = "{ trajets { id_trajet, statut_trajet, date_trajet } }";
//        String response = apiCallService.callGraphQLApi("https://your-graphql-api.com/graphql", query);
//
//        Map<LocalDate, Integer> nombreVoyagesParDate = new HashMap<>();
//
//        // Analyser la réponse GraphQL pour récupérer les informations sur les trajets
//        JsonNode jsonNode = new ObjectMapper().readTree(response);
//        JsonNode trajetsNode = jsonNode.path("data").path("trajets");
//
//        for (JsonNode trajetNode : trajetsNode) {
//            String statutTrajet = trajetNode.path("statut_trajet").asText();
//            if (statutTrajet.equals("terminé")) {
//                LocalDate dateTrajet = LocalDate.parse(trajetNode.path("date_trajet").asText());
//                nombreVoyagesParDate.merge(dateTrajet, 1, Integer::sum);
//            }
//        }
//
//        return nombreVoyagesParDate;
		return 200;
	}

	public double calculTypeVehicule() {
//		String query = "{ vehicules { type_vehicule } }";
//		String response = apiCallService.callGraphQLApi("https://your-graphql-api.com/graphql", query);
//
//		Map<String, Integer> nombreTypesVehicules = new HashMap<>();
//
//		// Analyser la réponse GraphQL pour récupérer les types de véhicules
//		JsonNode jsonNode;
//		try {
//			jsonNode = new ObjectMapper().readTree(response);
//			JsonNode vehiculesNode = jsonNode.path("data").path("vehicules");
//
//			for (JsonNode vehiculeNode : vehiculesNode) {
//				String typeVehicule = vehiculeNode.path("type_vehicule").asText();
//				nombreTypesVehicules.merge(typeVehicule, 1, Integer::sum);
//			}
//
//		} catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return nombreTypesVehicules;
		return 180;
	}

	public AdminDto1 calculData1() {
		return new AdminDto1(calculRevenu(), calculNombreVoyage(), calculTypeVehicule());
	}

	// fonctions for data 2
	public double calculPassager() {
//		apiCallService.callGetApi("/get-passsagers");
		return 500;
	}

	public double calculProprietaire() {
//		apiCallService.callGetApi("/get-proprietaire");
		return 200;
	}

	public double calculConducteur() {
//		apiCallService.callGetApi("/get-conducteur");
		return 150;
	}

	public AdminDto2 calculData2() {
		return new AdminDto2(calculPassager(), calculProprietaire(), calculConducteur());
	}

	// fonctions for data 3
	public double calculVisiteur() {
//		apiCallService.callGetApi("/get-visiteur");
		return 1000;
	}

	public double calculUtilisateur() {
//		apiCallService.callGetApi("/get-utilisateur");
		return 100;
	}

	public AdminDto3 calculData3() {

		return new AdminDto3(calculVisiteur(), calculUtilisateur());
	}

	// fonction for data 4
	public AdminDto4 calculData4() {
		return new AdminDto4(5);
	}

	// fonction for journal data
	public List<AdminJournalDto> calculJournal() {
		List<AdminJournalDto> adminJournalDtos = new ArrayList<>();
		AdminJournalDto adminJournalDto1 = new AdminJournalDto(1, "Antique Fjord hotel", "3605 Parker Rd.",
				"Kriston Watson", "25/05/2023", "Publish", 4.5);
		AdminJournalDto adminJournalDto2 = new AdminJournalDto(2, "Cozy Retreat Cottage", "123 Main St.",
				"Emma Thompson", "10/06/2023", "Pending", 4.7);
		AdminJournalDto adminJournalDto3 = new AdminJournalDto(3, "Luxury Beach Villa", "987 Ocean Ave.",
				"Michael Johnson", "12/06/2023", "Rejected", 4.3);
		AdminJournalDto adminJournalDto4 = new AdminJournalDto(4, "Rustic Mountain Cabin", "456 Pine Rd.", "Sophia Lee",
				"18/06/2023", "Publish", 4.2);
		AdminJournalDto adminJournalDto5 = new AdminJournalDto(5, "City Center Loft", "789 Broadway St.", "David Brown",
				"20/06/2023", "Pending", 4.8);
		AdminJournalDto adminJournalDto6 = new AdminJournalDto(6, "Seaside Bungalow", "321 Shoreline Dr.",
				"Olivia Garcia", "22/06/2023", "Publish", 4.6);
		AdminJournalDto adminJournalDto7 = new AdminJournalDto(7, "Mountain View Chalet", "555 Summit Ave.",
				"James Wilson", "24/06/2023", "Rejected", 4.1);
		AdminJournalDto adminJournalDto8 = new AdminJournalDto(8, "Urban Studio Apartment", "222 Oak St.",
				"Ava Martinez", "26/06/2023", "Pending", 4.9);
		AdminJournalDto adminJournalDto9 = new AdminJournalDto(9, "Historic Manor House", "777 Elm Rd.", "Liam Davis",
				"28/06/2023", "Publish", 4.7);
		AdminJournalDto adminJournalDto10 = new AdminJournalDto(10, "Lakefront Retreat", "444 Lakeview Dr.",
				"Mia Anderson", "30/06/2023", "Pending", 4.4);
		adminJournalDtos.add(adminJournalDto1);
		adminJournalDtos.add(adminJournalDto2);
		adminJournalDtos.add(adminJournalDto3);
		adminJournalDtos.add(adminJournalDto4);
		adminJournalDtos.add(adminJournalDto5);
		adminJournalDtos.add(adminJournalDto6);
		adminJournalDtos.add(adminJournalDto7);
		adminJournalDtos.add(adminJournalDto8);
		adminJournalDtos.add(adminJournalDto9);
		adminJournalDtos.add(adminJournalDto10);
		return adminJournalDtos;
	}

}
