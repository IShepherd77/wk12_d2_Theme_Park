

import attractions.Attraction;
import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.Stall;


import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themepark;
    Visitor visitor1;
    Stall stall;
    Attraction attraction1;
    Attraction attraction2;


    @Before
    public void setUp() throws Exception {
        themepark = new ThemePark();
        visitor1 = new Visitor(17, 150, 10.00);
        stall = new IceCreamStall("Mr Whippy's", "Dave", ParkingSpot.A2);
        attraction1 = new RollerCoaster("Nemesis", 9);
        attraction2 = new Dodgems("DodgeBalls", 8);
        themepark.addStall(stall);
        themepark.addAttraction(attraction1);
        themepark.addAttraction(attraction2);
    }

    @Test
    public void hasReviewedObjects() {
        assertEquals(3, themepark.getAllReviewed().size());
    }

    @Test
    public void hasVisitableAttraction(){
        assertEquals(0, attraction1.getVisitCount());
        themepark.visit(visitor1, attraction1);
        assertEquals(1, visitor1.visitedAtrractionCount());
        assertEquals(1, attraction1.getVisitCount());
    }

}
