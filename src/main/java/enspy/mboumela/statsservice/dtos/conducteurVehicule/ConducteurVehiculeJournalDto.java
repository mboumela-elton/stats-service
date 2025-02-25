package enspy.mboumela.statsservice.dtos.conducteurVehicule;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConducteurVehiculeJournalDto {
    private int id;
    private String nomPassager;
    private double amount;
    private String date;
    private String item;
    private boolean paid;
    private String status;
    private String time;
    private double review;
}
