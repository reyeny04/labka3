public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        System.out.println("Разница в цене по сравнению с прошлым месяцем(%): \n" + stock.getChangePercent());
    }
}