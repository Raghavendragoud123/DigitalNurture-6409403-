import java.util.Arrays;

public class FinancialForecasting {


    public static void movingAverage(int[] data) {
        System.out.println("3-Month Moving Averages:");
        for (int i = 0; i <= data.length - 3; i++) {
            int sum = data[i] + data[i + 1] + data[i + 2];
            double avg = sum / 3.0;
            System.out.println("Months " + (i+1) + "-" + (i+3) + ": " + avg);
        }
    }

    public static void main(String[] args) {

        int[] revenue = {120, 150, 100, 200, 170, 160, 180, 140, 130};

        System.out.println("Original Revenue Data:");
        System.out.println(Arrays.toString(revenue));


        int[] sortedRevenue = revenue.clone();
        Arrays.sort(sortedRevenue);
        System.out.println("\nSorted Revenue Data (for trend check):");
        System.out.println(Arrays.toString(sortedRevenue));


        System.out.println();
        movingAverage(revenue);
    }
}
