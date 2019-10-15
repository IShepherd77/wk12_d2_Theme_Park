package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }


    public double defaultPrice() {
        return 4.50;
    }

    public double priceFor(Visitor vistor) {
        if(vistor.getAge() < 12){
            return defaultPrice() /2.0;
        }
        return defaultPrice();
    }
}
