package enspy.mboumela.statsservice.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import enspy.mboumela.statsservice.dtos.admin.AdminDto1;
import enspy.mboumela.statsservice.dtos.passager.PassagerDto1;
import enspy.mboumela.statsservice.dtos.passager.PassagerDto2;
import enspy.mboumela.statsservice.dtos.passager.PassagerDto3;
import enspy.mboumela.statsservice.dtos.passager.PassagerJournalDto;

@Service
public class PassagerService {

	// fonction pour le data 1
	public PassagerDto1 calculVoyages() {
//		Map<String, Integer> visitorStatistics = new HashMap<>();
//
//		try {
//			// Analyser la réponse JSON de l'API GraphQL
//			JsonNode jsonNode = new ObjectMapper().readTree(graphQLResponse);
//			JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//			// Parcourir les données des personnes
//			for (JsonNode personneNode : personnesNode) {
//				String role = personneNode.path("role").asText();
//				boolean hasVehicle = personneNode.path("a_vehicule").asBoolean();
//
//				// Mettre à jour les statistiques en fonction du rôle et du véhicule
//				if (role.equals("conducteur")) {
//					visitorStatistics.merge("conducteurs", 1, Integer::sum);
//				} else if (role.equals("passager")) {
//					visitorStatistics.merge("passagers", 1, Integer::sum);
//				}
//
//				if (hasVehicle) {
//					visitorStatistics.merge("avec_vehicule", 1, Integer::sum);
//				} else {
//					visitorStatistics.merge("sans_vehicule", 1, Integer::sum);
//				}
//			}
//		} catch (IOException e) {
//			// Gérer les erreurs de lecture du JSON
//			e.printStackTrace();
//		}
//
//		return visitorStatistics;
		List<String> cities = new ArrayList<>(Arrays.asList("Bangangte", "Yaounde", "Douala", "Garoua", "Bamenda"));
		List<Long> citiesPopulation = new ArrayList<>(Arrays.asList(5000L, 4000L, 3000L, 2000L, 1000L));
		List<String> cars = new ArrayList<>(Arrays.asList("Voiture", "monospace", "moto", "Bus"));
		List<Long> carsNbr = new ArrayList<>(Arrays.asList(5000L, 3000L, 2000L, 1000L));
		return new PassagerDto1(cities, citiesPopulation, cars, carsNbr);
	}

	// fonction pour le data 2
	public List<Double> calculKm() {
//		int totalKilometers = 0;
//
//	    try {
//	        // Analyser la réponse JSON de l'API GraphQL
//	        JsonNode jsonNode = new ObjectMapper().readTree(graphQLResponse);
//	        JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//	        // Parcourir les données des personnes
//	        for (JsonNode personneNode : personnesNode) {
//	            int kilometers = personneNode.path("kilometres_parcourus").asInt();
//	            totalKilometers += kilometers;
//	        }
//	    } catch (IOException e) {
//	        // Gérer les erreurs de lecture du JSON
//	        e.printStackTrace();
//	    }
//
//	    return totalKilometers;
		List<Double> revenus = new ArrayList<>(Arrays.asList(100.0, 200.0, 300.0, 400.0, 500.0));
		return revenus;
	}

	public List<Double> calculNbrVoyage() {
//		int totalVoyages = 0;
//
//	    try {
//	        // Analyser la réponse JSON de l'API GraphQL
//	        JsonNode jsonNode = new ObjectMapper().readTree(graphQLResponse);
//	        JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//	        // Parcourir les données des personnes
//	        for (JsonNode personneNode : personnesNode) {
//	            int kilometers = personneNode.path("kilometres_parcourus").asInt();
//	            totalKilometers += kilometers;
//	        }
//	    } catch (IOException e) {
//	        // Gérer les erreurs de lecture du JSON
//	        e.printStackTrace();
//	    }
//
//	    return totalVoyagess;
		List<Double> revenus = new ArrayList<>(Arrays.asList(100.0, 200.0, 300.0, 400.0, 500.0));
		return revenus;
	}

	public List<PassagerDto2> calculStatistiques() {
		List<PassagerDto2> list = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			list.add(new PassagerDto2(calculKm().get(i), calculNbrVoyage().get(i)));
		}
		return list;
	}

	// fonction pour data 3
	public double calculPointFidelite() {
//		Map<String, Integer> loyaltyPoints = new HashMap<>();
//
//	    try {
//	        // Analyser la réponse JSON de l'API GraphQL
//	        JsonNode jsonNode = new ObjectMapper().readTree(graphQLResponse);
//	        JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//	        // Parcourir les données des personnes
//	        for (JsonNode personneNode : personnesNode) {
//	            String role = personneNode.path("role").asText();
//	            int kilometers = personneNode.path("kilometres_parcourus").asInt();
//	            boolean hasVehicle = personneNode.path("a_vehicule").asBoolean();
//
//	            int points = calculatePointsForPerson(role, kilometers, hasVehicle);
//	            loyaltyPoints.merge(role, points, Integer::sum);
//	        }
//	    } catch (IOException e) {
//	        // Gérer les erreurs de lecture du JSON
//	        e.printStackTrace();
//	    }
//
//	    return loyaltyPoints;
		return 86;
	}

	public long calculNbrVehiculeEmprunte() {
//		Set<String> vehiclesUsed = new HashSet<>();
//
//	    try {
//	        // Analyser la réponse JSON de l'API GraphQL
//	        JsonNode jsonNode = new ObjectMapper().readTree(graphQLResponse);
//	        JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//	        // Parcourir les données des personnes
//	        for (JsonNode personneNode : personnesNode) {
//	            boolean hasVehicle = personneNode.path("a_vehicule").asBoolean();
//	            if (hasVehicle) {
//	                String vehicleId = personneNode.path("vehicule_id").asText();
//	                vehiclesUsed.add(vehicleId);
//	            }
//	        }
//	    } catch (IOException e) {
//	        // Gérer les erreurs de lecture du JSON
//	        e.printStackTrace();
//	    }
//
//	    return vehiclesUsed.size();
		return 21;
	}

	public long calculDestinationVisitee() {
//	    Set<String> destinationsVisited = new HashSet<>();
//
//	    try {
//	        // Analyser la réponse JSON de l'API GraphQL
//	        JsonNode jsonNode = new ObjectMapper().readTree(graphQLResponse);
//	        JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//	        // Parcourir les données des personnes
//	        for (JsonNode personneNode : personnesNode) {
//	            String destination = personneNode.path("destination").asText();
//	            destinationsVisited.add(destination);
//	        }
//	    } catch (IOException e) {
//	        // Gérer les erreurs de lecture du JSON
//	        e.printStackTrace();
//	    }
//
//	    return destinationsVisited.size();
		return 15;
	}

	public double calculDepense() {
//	    double totalMoneySpent = 0.0;
//
//	    try {
//	        // Analyser la réponse JSON de l'API GraphQL
//	        JsonNode jsonNode = new ObjectMapper().readTree(graphQLResponse);
//	        JsonNode personnesNode = jsonNode.path("data").path("personnes");
//
//	        // Parcourir les données des personnes
//	        for (JsonNode personneNode : personnesNode) {
//	            double moneySpent = personneNode.path("depenses").asDouble();
//	            totalMoneySpent += moneySpent;
//	        }
//	    } catch (IOException e) {
//	        // Gérer les erreurs de lecture du JSON
//	        e.printStackTrace();
//	    }
//
//	    return totalMoneySpent;
		return 11;
	}

	public PassagerDto3 calculPassagerDto3() {
		return new PassagerDto3(calculPointFidelite(), calculNbrVehiculeEmprunte(), calculDestinationVisitee(),
				calculDepense());
	}

	// fonction for journal data
	public List<PassagerJournalDto> calculJournal() {
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
		List<PassagerJournalDto> passagerJournalDtos = new ArrayList<>();
		PassagerJournalDto passagerJournalDto1 = new PassagerJournalDto(1, "Antique Fjord hotel", "3605 Parker Rd.",
				"Kriston Watson", "25/05/2023", "Accept", 4.5);
		PassagerJournalDto passagerJournalDto2 = new PassagerJournalDto(2, "Cozy Retreat Cottage", "123 Main St.",
				"Emma Thompson", "10/06/2023", "Pending", 4.7);
		PassagerJournalDto passagerJournalDto3 = new PassagerJournalDto(3, "Luxury Beach Villa", "987 Ocean Ave.",
				"Michael Johnson", "12/06/2023", "Rejected", 4.3);
		PassagerJournalDto passagerJournalDto4 = new PassagerJournalDto(4, "Rustic Mountain Cabin", "456 Pine Rd.",
				"Sophia Lee", "18/06/2023", "Accept", 4.2);
		PassagerJournalDto passagerJournalDto5 = new PassagerJournalDto(5, "City Center Loft", "789 Broadway St.",
				"David Brown", "20/06/2023", "Pending", 4.8);
		PassagerJournalDto passagerJournalDto6 = new PassagerJournalDto(6, "Seaside Bungalow", "321 Shoreline Dr.",
				"Olivia Garcia", "22/06/2023", "Accept", 4.6);
		PassagerJournalDto passagerJournalDto7 = new PassagerJournalDto(7, "Mountain View Chalet", "555 Summit Ave.",
				"James Wilson", "24/06/2023", "Rejected", 4.1);
		PassagerJournalDto passagerJournalDto8 = new PassagerJournalDto(8, "Urban Studio Apartment", "222 Oak St.",
				"Ava Martinez", "26/06/2023", "Pending", 4.9);
		PassagerJournalDto passagerJournalDto9 = new PassagerJournalDto(9, "Historic Manor House", "777 Elm Rd.",
				"Liam Davis", "28/06/2023", "Accept", 4.7);
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
