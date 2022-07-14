import javax.print.DocFlavor.STRING;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock() {

    }

    public Stock(String sy, String na) {
        symbol = sy;
        name = na;
    }

    public void getChangePercent() {
        System.out.println(previousClosingPrice / currentPrice);
    }
}
