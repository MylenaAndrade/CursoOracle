public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int eggsPerChicken = 5;
        int chickenCount = 3;
        int totalEggs;
        totalEggs = eggsPerChicken * chickenCount;
        chickenCount++;
        totalEggs += eggsPerChicken * chickenCount;
        chickenCount/=2;
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println(totalEggs);

        eggsPerChicken = 4;
        chickenCount = 8;
        totalEggs = eggsPerChicken * chickenCount;
        chickenCount++;
        totalEggs += eggsPerChicken * chickenCount;
        chickenCount/=2;
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println(totalEggs);
    }   
}
