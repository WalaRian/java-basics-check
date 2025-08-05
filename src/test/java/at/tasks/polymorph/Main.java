package at.tasks.polymorph;

public class Main {
    public static void main(String[] args) {
        System.out.println(pow(args[0], args[1]));
    }

    private static double pow(String foundation, String multiplier) {
        return Math.pow(Integer.parseInt(foundation), Integer.parseInt(multiplier));
    }
}
