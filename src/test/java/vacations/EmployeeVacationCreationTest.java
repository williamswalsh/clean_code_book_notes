package vacations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author William Walsh
 * @version 25 Sep 2022
 */
public class EmployeeVacationCreationTest {

    @Test
    public void test() {
        Employee usEmployee = new Employee(0, "us");

        usEmployee.setTotalVacationDays(vacationProvider.provide(usEmployee));

        assertEquals(usEmployee.getTotalVacationDays(), 16);
    }
}
