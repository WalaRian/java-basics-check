package at.tasks.classes;

public class Task10 {
    public static void main(String[] args) {
        int res = 5;
        res = lastNumSum(res, 11);
        res = lastNumSum(res, 123);
        res = lastNumSum(res, 14);
        res = lastNumSum(res, 1);

        System.out.println("Итог: " + res);
    }
    public static int lastNumSum(int a, int b){

        return (a%10)+(b%10);

    }
}
