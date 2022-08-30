public class Main {
    public static void main(String[] args) {
     // Задание 1
        int dog = 7;
        byte cat = 1;
        short mouse = 3;
        long elephant = 110L;
        double sugarWeignt = 4.5;
        float saltWeight = 1.5f;
        boolean dogIsAdult = dog > 10;
        char bar = 35;
        System.out.println (bar);
        System.out.println (dogIsAdult);
        System.out.println (cat);
        System.out.println (mouse);
        System.out.println (elephant);
        System.out.println (sugarWeignt);
        System.out.println (saltWeight);



        // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("общий вес баксеров " + weightOfAllBoxers + " кг");
        System.out.println("Разница веса баксеров " + weightDifference + " кг");

        // Задание 3
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        short weightOfTheSportsBreakfast = (short) (bananas + milk + iceCream + eggs);
        System.out.println("вес спорт-завтрака " + weightOfTheSportsBreakfast + " грамм" );
        float gram = weightOfTheSportsBreakfast / 1000f;
        System.out.println("вес в Килограммах " + gram);


        // Задание 4
        int needRoReset = 7;
        short weightLossPerDay1 = 250;
        short weightLossPerDay2 = 500;
        float weightInGrams = needRoReset * 1000f;
        float numberOfDays = weightInGrams / weightLossPerDay1;
        float numberOfDays1 = weightInGrams / weightLossPerDay2;
        System.out.println("количество дней при изминенни 250 грам " + numberOfDays + " дней");
        System.out.println("количество дней при изминенни 500 грам " + numberOfDays1 + " дней");

        // Задание 5
        int worker1 = 67760;
        int worker2 = 83690;
        int worker3 = 76230;
        double raising = 0.10;
        double newSalary1 = worker1 * raising + worker1;
        double newSalary2 = worker2 * raising + worker2;
        double newSalary3 = worker3 * raising + worker3;
        double annualIncome1 = newSalary1 - worker1;
        double annualIncome2 = newSalary2 - worker2;
        double annualIncome3 = newSalary3 - worker3;
        System.out.println("Маша получает теперь " + newSalary1 + " руб" );
        System.out.println("Годовой доход вырос на " + annualIncome1 + " руб" );
        System.out.println("Денис получает теперь " + newSalary2 + " руб" );
        System.out.println("Годовой доход вырос на " + annualIncome2 + " руб" );
        System.out.println("Кристина получает теперь " + newSalary3 + " руб" );
        System.out.println("Годовой доход вырос на " + annualIncome3 + " руб" );

    }
}