package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(11, 150, 10.00);
        visitor2 = new Visitor(12, 150, 10.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasChargeForYoungRider(){
        assertEquals(dodgems.defaultPrice() /2, dodgems.priceFor(visitor1),0.01);
        assertEquals(2.25, dodgems.priceFor(visitor1),0.01);
        assertEquals(dodgems.defaultPrice(), dodgems.priceFor(visitor2),0.01);
    }


}
