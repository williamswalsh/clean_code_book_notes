package vacations;

import lombok.Getter;
import lombok.Setter;

/**
 * @author William Walsh
 * @version 25 Sep 2022
 */
@Getter
@Setter
public class Employee {
    private int totalVacationDays;
    private String region;

    private Employee(String region, int totalVacationDays) {
        this.region = region;
        this.totalVacationDays = totalVacationDays;
    }
}
