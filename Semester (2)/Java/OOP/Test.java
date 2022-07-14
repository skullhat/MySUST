public class Test {
    public static void main(String[] args) {
        Stock sk = new Stock("ORCL", "Oracle Corporation");
        sk.previousClosingPrice = 34.5;
        sk.currentPrice = 34.35;
        sk.getChangePercent();
    }
}
