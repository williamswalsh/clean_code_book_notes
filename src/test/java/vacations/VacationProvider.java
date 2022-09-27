package vacations;

import java.util.Objects;

/**
 * @author William Walsh
 * @version 25 Sep 2022
 */

public class VacationProvider {

    int provide(Employee employee) {
        if (Objects.equals(employee.getRegion(), "us")) {
            return 16;
        }
        if (Objects.equals(employee.getRegion(), "eu")) {
            return 23;
        }
        throw new RuntimeException("Invalid employee region.");
    }
}
