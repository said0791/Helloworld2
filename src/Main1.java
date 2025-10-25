public class Main1 {
    public static void main(String[] args) {
//        System.out.print("Задача 1");
//
//        int a= 25;
//        byte b = 100;
//        short c = 1000;
//        long d = 1000000000L;
//        float e = 99.99f;
//        double f = 3.14159265359;
//        String userName = "Саша";
//
//        System.out.print("Задача 2");

//        double addel = 27.12;
//        long sfings = 987678965549;
//        float sher = 2,786f;
//        char mig = 569;
//        short lof = -159;
//        short dayming = 27897;
//        byte tim = 67;

        System.out.println("Задача 3 ");

        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper/(ludmilaPavlovna+annaSergeevna+ekaterinaAndreevna) +" листов бумаги ");

        System.out.println("Задача 4 ");

        int twentyMinutes = 20;
        int water = 8;
        System.out.println("За 20 дней машина произвела " + (twentyMinutes*water)+" штук бутылок" );

        int day = 1440;
        System.out.println("За сутки машина произвела " + (day*water)+" штук бутылок" );

        int threeВays = 4320;
        System.out.println("За 3 дня машина произвела " + (threeВays*water)+" штук бутылок" );

        int month = 43200;
        System.out.println("За месяц машина произвела " + (month*water)+" штук бутылок" );

        System.out.println("Задача 5 ");

        int paints = 120;
        int white = 2;
        int brown = 4;
        System.out.println(white+brown+ " банок красок");
        System.out.println("В школе " +paints/(white+brown)+ " классов");


        int scool = 20;
        System.out.println(white*scool+ " банок белых красок");
        System.out.println(brown*scool+ " банок коричневых красок");
        System.out.println((white*scool)+((brown*scool))+ " банок красок");

        System.out.println("Задача 6 ");

        int banana = 80;
        int quantity = 5;
        System.out.println("Один банан весит 80гр а пять бананов весит - " +(banana*quantity)+ " гр");

        int milc = 200;
        double milcGrams =  1.05;
        System.out.println("Молоко вести - " +(milcGrams*milc)+ " гр");

        int plombir = 2;
        int plombirGrams = 100;
        System.out.println("Мороженое-пломбир — 2 брикета, весит - " +(plombir*plombirGrams)+ " гр");

        int eggs = 4;
        int eggsGrams = 70;
        System.out.println("Яйца сырые – 4 яйца, весит - " + (eggs*eggsGrams)+ " гр");
        System.out.println((banana*quantity)+(milcGrams*milc)+(plombir*plombirGrams)+(eggs*eggsGrams));
        double itog = 1090.0;
        double kg = 1000.0;
        System.out.println("Итог спортзавтрак " +(itog/kg)+ " кг");

        System.out.println("Задача 7 ");
        double reset = 7;
        double kgGr = 1000;
        System.out.println("Нужно сбросить " +(kgGr*reset)+ " гр");

        int reset1 = 7000;
        int weight = 250;
        System.out.println("За " +(reset1/weight)+ " дней нужно сбросить вес");

        int days = 28;
        double grKg = 1000;
        System.out.println("За 28 дней спорсмен теряет вес на " +((weight*days)/grKg)+ " кг");

        System.out.println("А если спорсмен будет теряет вес на 500гр в день: ");

        int weight1 = 500;
        System.out.println("То спорсмен теряет вес за " +(reset1/weight1)+ " дней");

        System.out.println("Задача 8 ");
        System.out.println(" Миша, зарпалта в месяц 67760 руб");

        double misha = 67760;
        double promotion = 10;
        System.out.println("Увиличения зарплаты на " +(misha/promotion)+ " руб");

        double salary = 6776.0;
        System.out.println("Расчет новой зарплаты повышение на 10% составляет " +(misha+salary)+ " руб");

        double year = 12;
        System.out.println("Расчет годового дохода до повышения " +(misha*year)+ " руб");

        double zp = 74536.0;
        System.out.println("Расчет годового дохода после повышения " + (zp*year)+ " руб");

        System.out.println(" Денис, зарпалта в месяц 83690 руб");

        double denis = 83690.0;
        System.out.println("Увиличения зарплаты на " +(denis/promotion)+ " руб");
        double salary1 = 8369.0;
        System.out.println("Расчет новой зарплаты повышение на 10% составляет " +(denis+salary1)+ " руб");
        double zp1 = 92059.0;
        System.out.println("Расчет годового дохода до повышения " +(denis*year)+ " руб");
        System.out.println("Расчет годового дохода после повышения " + (zp1*year)+ " руб");

        System.out.println(" Крестина, зарпалта в месяц 76230 руб");
        double krestina = 76230;
        System.out.println("Увиличения зарплаты на " +(krestina/promotion)+ " руб");
        double salary2 = 7623.0;
        System.out.println("Расчет новой зарплаты повышение на 10% составляет " +(salary2+krestina)+ " руб");
        double zp2 = 83853.0;
        System.out.println("Расчет годового дохода до повышения " +(krestina*year)+ " руб");
        System.out.println("Расчет годового дохода после повышения " + (zp2*year)+ " руб");
        System.out.println("ИТОГ");
        System.out.println("Маша теперь получает 74536.00 рублей. Годовой доход вырос на 81312.00 рублей");
        System.out.println("Денис теперь получает 92059.00 рублей. Годовой доход вырос на 1104708.00 рублей.");
        System.out.println("Кристина теперь получает 83312.00 рублей. Годовой доход вырос на 1006236.00 рублей");


















    }

}

