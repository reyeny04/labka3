import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataSet dataSet = new DataSet();

        while (true) {
            System.out.print("Введите число (Q для окончания): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                dataSet.addValue(value);
            } catch (NumberFormatException e) {
                System.out.println("Неверный тип данных. (Q для выхода)");
            }
        }

        System.out.println("Average = " + dataSet.getAverage());
        System.out.println("Maximum = " + dataSet.getMax());

    }
}