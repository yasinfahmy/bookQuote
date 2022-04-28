package nl.utwente.di.bookQuote;

import java.util.HashMap;

public class Quoter {
    public double getBookPrice(String isbn){
        HashMap<String, Double> price = new HashMap<>();
        price.put("1",10.0);
        price.put("2",45.0);
        price.put("3",20.0);
        price.put("4",35.0);
        price.put("5",50.0);
        price.put("others",0.0);
        return price.get(isbn);
    }
}
