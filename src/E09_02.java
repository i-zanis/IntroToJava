public class E09_02 {
    public static void main(String[] args) {
        Stock[] Oracle = new Stock[1];
        Oracle[0] = new Stock("ORCL", "OracleCorporation");
    }
    static class Stock {
        private String symbol;
        private String name;
        private double previousClosingPrice;
        private double currentPrice;

        Stock(String symbol, String name) {
            this.symbol = symbol;
            this.name = name;
        }

        public double getChangePercent() {
            return (currentPrice - previousClosingPrice)/previousClosingPrice * 100;
        }

    }
}
