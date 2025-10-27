//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var minus = 4.5;
        System.out.println(dog - minus);
        var minus1 = 2;
        System.out.println(cat - minus1);
        var minus2 = 756150;
        System.out.println(paper - minus2);

        System.out.println("Задание 4");
        var friend = 19;
        var plus = 2;
        var del = 7;
        System.out.println(friend);
        System.out.println(friend + plus);
        System.out.println((friend + plus) / del);

        System.out.println("Задание 5");

        var frog = 3.5;
        System.out.println(frog);
        var um = 10;
        System.out.println(frog * um);
        var razdelit = 3.5;
        System.out.println((frog * um) / razdelit);
        var plus4 = 4;
        System.out.println((frog * um) / (razdelit + plus4));

        System.out.println("Задание 6 ");

        var habib = 78.2 % 82.7;
        System.out.println(habib);

        System.out.println("Задание 7 ");
        var ost = 82.7 % 78.2;
        System.out.println(ost);

        System.out.println("Задание 8.1 ");

        var chasi = 640;
        var sotrudnik = 8;
        var otvet = chasi / sotrudnik;
        System.out.println("Всего работников в компании " + otvet + " человек");

        System.out.println("Задание 8.2 ");

        var lyudi = 94 + otvet;
        var bolshe = chasi / lyudi;
        System.out.println("Если в компании работает " + lyudi + " человек, то всего " + bolshe + " часов работы может быть поделено между сотрудниками");
    }
}