public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        int totalEggs = 100;
        double dailyAverage;
        double monthlyAverage;
        double monthlyProfit;
        totalEggs += 121;
        totalEggs += 117;

        dailyAverage = totalEggs / 3.0;
        monthlyAverage = totalEggs * 30/3.0;
        monthlyProfit = totalEggs * 1.8;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
