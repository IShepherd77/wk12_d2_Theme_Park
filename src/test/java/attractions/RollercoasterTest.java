package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;
    Visitor visitor5;
    Visitor visitor6;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(12, 145, 10.00);
        visitor2 = new Visitor(12, 146, 10.00);
        visitor3 = new Visitor(13, 145, 10.00);
        visitor4 = new Visitor(13, 146, 10.00);
        visitor5 = new Visitor(13, 200, 10.00);
        visitor6 = new Visitor(13, 201, 10.00);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasMinAgeAndMinHeight(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
        assertEquals(true, rollerCoaster.isAllowedTo(visitor4));
    }

    @Test
    public void hasChargeForTallerRider(){
        assertEquals(rollerCoaster.defaultPrice(), rollerCoaster.priceFor(visitor5),0.01);
        assertEquals(rollerCoaster.defaultPrice() *2, rollerCoaster.priceFor(visitor6),0.01);
    }
}
