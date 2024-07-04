package enspy.mboumela.statsservice.services;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
	public List<Double> calculRevenu() {
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
		List<Double> revenus = new ArrayList<>(Arrays.asList(12000.0, 2010.0, 310.0, 10.0, 0.0));
		return revenus;
	}

	public List<Double> calculNombreVoyage() {
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
		List<Double> nbrVoyages = new ArrayList<>(Arrays.asList(2100.0, 800.0, 100.0, 50.0, 0.0));
		return nbrVoyages;
	}

	public List<Double> calculTypeVehicule() {
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
		List<Double> revenus = new ArrayList<>(Arrays.asList(90.0, 20.0, 10.0, 2.0, 10.0));
		return revenus;
	}

	public List<AdminDto1> calculData1() {
		List<AdminDto1> list = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			list.add(new AdminDto1(calculRevenu().get(i), calculNombreVoyage().get(i), calculTypeVehicule().get(i)));
		}
		return list;
	}

	// fonctions for data 2
	public double calculPassager() {
//      String query = "{ personnes { role, a_vehicule } }";
//      String response = apiCallService.callGraphQLApi("https://your-graphql-api.com/graphql", query);
//
//      Map<String, Integer> nombrePersonnesParRole = new HashMap<>();
//
//      // Analyser la réponse GraphQL pour récupérer les informations sur les personnes
//      JsonNode jsonNode = new ObjectMapper().readTree(response);
//      JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//      for (JsonNode personneNode : personnesNode) {
//          String role = personneNode.path("role").asText();
//          boolean aVehicule = personneNode.path("a_vehicule").asBoolean();
//
//          nombrePersonnesParRole.merge("passagers", role.equals("passager") ? 1 : 0, Integer::sum);
//      }
//
//      return nombrePersonnesParRole;
		return 500;
	}

	public double calculProprietaire() {
//      String query = "{ personnes { role, a_vehicule } }";
//      String response = apiCallService.callGraphQLApi("https://your-graphql-api.com/graphql", query);
//
//      Map<String, Integer> nombrePersonnesParRole = new HashMap<>();
//
//      // Analyser la réponse GraphQL pour récupérer les informations sur les personnes
//      JsonNode jsonNode = new ObjectMapper().readTree(response);
//      JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//      for (JsonNode personneNode : personnesNode) {
//          String role = personneNode.path("role").asText();
//          boolean aVehicule = personneNode.path("a_vehicule").asBoolean();
//
//          nombrePersonnesParRole.merge("conducteurs_avec_vehicule", role.equals("conducteur") && aVehicule ? 1 : 0, Integer::sum);
//      }
//
//      return nombrePersonnesParRole;
		return 200;
	}

	public double calculConducteur() {
//      String query = "{ personnes { role, a_vehicule } }";
//      String response = apiCallService.callGraphQLApi("https://your-graphql-api.com/graphql", query);
//
//      Map<String, Integer> nombrePersonnesParRole = new HashMap<>();
//
//      // Analyser la réponse GraphQL pour récupérer les informations sur les personnes
//      JsonNode jsonNode = new ObjectMapper().readTree(response);
//      JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//      for (JsonNode personneNode : personnesNode) {
//          String role = personneNode.path("role").asText();
//          boolean aVehicule = personneNode.path("a_vehicule").asBoolean();
//
//          nombrePersonnesParRole.merge("conducteurs", role.equals("conducteur") ? 1 : 0, Integer::sum);
//      }
//
//      return nombrePersonnesParRole;
		return 76;
	}

	public AdminDto2 calculData2() {
		return new AdminDto2(calculPassager(), calculProprietaire(), calculConducteur());
	}

	// fonctions for data 3
	public double calculVisiteur() {
//      String query = "{ personnes { role, a_vehicule } }";
//      String response = apiCallService.callGraphQLApi("https://your-graphql-api.com/graphql", query);
//
//      Map<String, Integer> nombrePersonnesParRole = new HashMap<>();
//
//      // Analyser la réponse GraphQL pour récupérer les informations sur les personnes
//      JsonNode jsonNode = new ObjectMapper().readTree(response);
//      JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//      for (JsonNode personneNode : personnesNode) {
//          String role = personneNode.path("role").asText();
//          boolean aVehicule = personneNode.path("a_vehicule").asBoolean();
//
//          nombrePersonnesParRole.merge("conducteurs", role.equals("conducteur") ? 1 : 0, Integer::sum);
//      }
//
//      return nombrePersonnesParRole;
		return 800;
	}

	public double calculUtilisateur() {
//      String query = "{ personnes { role, a_vehicule } }";
//      String response = apiCallService.callGraphQLApi("https://your-graphql-api.com/graphql", query);
//
//      Map<String, Integer> nombrePersonnesParRole = new HashMap<>();
//
//      // Analyser la réponse GraphQL pour récupérer les informations sur les personnes
//      JsonNode jsonNode = new ObjectMapper().readTree(response);
//      JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//      for (JsonNode personneNode : personnesNode) {
//          String role = personneNode.path("role").asText();
//          boolean aVehicule = personneNode.path("a_vehicule").asBoolean();
//
//          nombrePersonnesParRole.merge("conducteurs", role.equals("conducteur") ? 1 : 0, Integer::sum);
//      }
//
//      return nombrePersonnesParRole;
		return 100;
	}

	public AdminDto3 calculData3() {
		return new AdminDto3(calculVisiteur(), calculUtilisateur());
	}

	// fonction for data 4
	public AdminDto4 calculData4() {
//      String query = "{ personnes { role, a_vehicule } }";
//      String response = apiCallService.callGraphQLApi("https://your-graphql-api.com/graphql", query);
//
//      Map<String, Integer> nombrePersonnesParRole = new HashMap<>();
//
//      // Analyser la réponse GraphQL pour récupérer les informations sur les personnes
//      JsonNode jsonNode = new ObjectMapper().readTree(response);
//      JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//      for (JsonNode personneNode : personnesNode) {
//          String role = personneNode.path("role").asText();
//          boolean aVehicule = personneNode.path("a_vehicule").asBoolean();
//
//          nombrePersonnesParRole.merge("conducteurs", role.equals("conducteur") ? 1 : 0, Integer::sum);
//      }
//
//      return nombrePersonnesParRole;
		return new AdminDto4(4);
	}

	// fonction for journal data
	public List<AdminJournalDto> calculJournal() {
//		 try {
//		        // Analyser la réponse JSON de l'API GraphQL
//		        JsonNode jsonNode = new ObjectMapper().readTree(graphQLResponse);
//		        JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//		        // Initialiser le journal d'activité
//		        StringBuilder activityLog = new StringBuilder();
//		        activityLog.append("Journal d'activité des clients :\n\n");
//
//		        // Parcourir les données des personnes
//		        for (JsonNode personneNode : personnesNode) {
//		            boolean hasVehicle = personneNode.path("a_vehicule").asBoolean();
//		            if (hasVehicle) {
//		                String nom = personneNode.path("nom").asText();
//		                String prenom = personneNode.path("prenom").asText();
//		                String destination = personneNode.path("destination").asText();
//		                double moneySpent = personneNode.path("depenses").asDouble();
//		                String vehicleId = personneNode.path("vehicule_id").asText();
//
//		                activityLog.append("Nom : ").append(nom).append(" ").append(prenom).append("\n");
//		                activityLog.append("Destination : ").append(destination).append("\n");
//		                activityLog.append("Dépenses : ").append(moneySpent).append(" €").append("\n");
//		                activityLog.append("Véhicule utilisé : ").append(vehicleId).append("\n");
//		                activityLog.append("\n");
//		            }
//		        }
//
//		        // Afficher le journal d'activité
//		        System.out.println(activityLog.toString());
//		    } catch (IOException e) {
//		        // Gérer les erreurs de lecture du JSON
//		        e.printStackTrace();
//		    }
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
				"Ava Martinez", "26/06/2023", "Pending", 3.9);
		AdminJournalDto adminJournalDto9 = new AdminJournalDto(9, "Historic Manor House", "777 Elm Rd.", "Liam Davis",
				"28/06/2023", "Publish", 4.7);
		AdminJournalDto adminJournalDto10 = new AdminJournalDto(10, "Lakefront Retreat", "444 Lakeview Dr.",
				"Mia Anderson", "30/06/2023", "Pending", 2.4);
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
