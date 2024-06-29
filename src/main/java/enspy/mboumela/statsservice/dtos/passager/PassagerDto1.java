package enspy.mboumela.statsservice.dtos.passager;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PassagerDto1 {

	List<String> villes;
	List<Long> villeNbr;
	List<String> vehicules;
	List<Long> vehiculeNbr;
}
