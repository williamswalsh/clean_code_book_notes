package threading;

import org.junit.jupiter.api.Test;
import vacations.Country;

import static vacations.CountryCode.IE;

/**
 * @author William Walsh
 * @version 27 Sep 2022
 */
public class LearningTests {

    @Test
    void testObjectFields() throws InterruptedException {
        Country country = new Country("Ireland", IE);
        country.wait();
        System.out.println(country);
    }
}
