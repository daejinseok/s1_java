import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertTrue;

/**
 * Created by daejin on 2016-02-14.
 */
public class S1Test {

    @Test
    public void test_randomID(){

        String id = S1.randomID(8);
        //System.out.println(id);
        assertTrue(id.matches("^[0-9a-zA-Z]{8}$"));

        id = S1.randomID(15);
        assertTrue(id.matches("^[0-9a-zA-Z]{15}$"));
    }

    @Test
    public void test_betweenDays(){

        String date1 = "2016.02.01";
        String date2 = "2016.03.01";

        try {
            long ld = S1.betweenDays(date1, date2);
            assertTrue(ld == 29);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        date1 = "2014.01.01";
        date2 = "2016.05.24";

        try {
            long ld = S1.betweenDays(date1, date2);
            assertTrue(ld == 874);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
