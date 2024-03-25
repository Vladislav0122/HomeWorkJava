package homeWork1;

public class vl {
    public static void main(String[] args) {

        double R = 5;
        double pi = 3.1416;
        double P = (2 * R * pi);
        System.out.println(P);
        double R1 = 5;
        double pi1 = 3.1416;
        System.out.println(2 * R1 * pi1);


        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
        int n = 10;
        System.out.println((n * (n + 1)) / 2);


        double A = 10.5;
        double B = 45;
        System.out.println(A - (A * 0.05));
        System.out.println(B - (B * 0.15));
        double C = (2 * (A - (A * 0.05)) + 4 * (B - (B * 0.15)));
        double C1 = (A + B);
        System.out.println(C1);
        System.out.println(C);


        int a = 127;
        int a1 = a % 10;
        int a2 = (a / 10) % 10;
        int a3 = (a / 10) / 10;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        int b = (a % 10 * 100 + (a / 10) % 10 * 10 + (a / 10) / 10);
        System.out.println(b);
        boolean results = a == b;
        System.out.println("a==b: " + results);
        results = a != b;
        System.out.println("a!=b: " + results);
        results = a > b;
        System.out.println("a > b " + results);
        results = a < b;
        System.out.println("a < b " + results);


        int f = (1 + 3 + 8 + 9);
        if (f <= 20) {
            System.out.println("true");
        } else System.out.println("false " + "f больше 20");

        switch (f) {
            case 20:
                boolean result = f <= 20;
                System.out.println("true");
                break;
            case 21:
                boolean result3 = f >= 21;
                System.out.println("false f больше 20");

        }
    }
}
