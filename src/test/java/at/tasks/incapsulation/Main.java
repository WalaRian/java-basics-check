package at.tasks.incapsulation;





//Практика ООП. Инкапсуляция #1. Дробь
public class Main {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(5,6);
        Fraction f2 = new Fraction(-7,3);
        Fraction f3= new Fraction(3,1);
        Fraction f4= new Fraction(500,3);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        System.out.println( f1.sum(f2).sum(f3).minus(5));
        System.out.println( f1.sum(f2).sum(f3).sum(5).minus(5).minus(f4));

    }
}
