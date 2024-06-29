package enspy.mboumela.statsservice.dtos.passager;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PassagerJournalDto {
	    private int id;
	    private String name;
	    private String location;
	    private String agent;
	    private String date;
	    private String status;
	    private double review;
}
