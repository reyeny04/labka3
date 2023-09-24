import java.lang.ref.SoftReference;

public class Stock {
    String Symbol;
    String Name;
    double previousClosingPrice = 34.5;
    double currentPrice = 34.35;

    Stock(String symbol, String name){
        Name = name;
        Symbol = symbol;
    }

    public String getChangePercent(){
        return ((previousClosingPrice - currentPrice)/currentPrice * 100) + "%";
    }
}
