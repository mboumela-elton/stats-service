package enspy.mboumela.statsservice.dtos.conducteur;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConducteurJournalDto {
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
