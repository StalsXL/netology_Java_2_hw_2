public class Main {
    public static void main(String[] args) {
        int initialScore = 100;
        int amountOfMoney = 1300;
        //int amount = amountOfMoney + initialScore;
        int bonus = amountOfMoney >= 1000 ? amountOfMoney / 100 : 0;
        int finalScore = bonus + initialScore + amountOfMoney;
        System.out.println(finalScore);
    }
}