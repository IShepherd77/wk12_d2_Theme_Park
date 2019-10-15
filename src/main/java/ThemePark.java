import attractions.Attraction;
import behaviours.IReviewed;
import org.w3c.dom.Attr;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;

    public ThemePark(){
        stalls = new ArrayList<Stall>();
        attractions = new ArrayList<Attraction>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> returnValue = new ArrayList<IReviewed>();
        for(Stall stall : stalls){
            returnValue.add(stall);
        }
        for(Attraction attraction : attractions){
            returnValue.add(attraction);
        }
        return returnValue;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.setVisitCount(attraction.getVisitCount() +1);
        visitor.addAttraction(attraction);
    }

    public void addStall(Stall stall) {
        stalls.add(stall);
    }

    public void addAttraction(Attraction attraction){
        attractions.add(attraction);
    }
}
