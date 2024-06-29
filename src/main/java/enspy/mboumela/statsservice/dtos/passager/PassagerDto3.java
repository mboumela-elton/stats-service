package enspy.mboumela.statsservice.dtos.passager;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PassagerDto3 {
	private double pointFidelite;
	private long vehiculeEmprunte;
	private long destinationVisitee;
	private double depense;
}
