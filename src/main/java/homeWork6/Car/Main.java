package homeWork6.Car;

public class Main {
    public static void main(String[] args){

        Jenerik mazda = new Jenerik <>(new Mazda("Mazda CX-50"," red "));
        mazda.print();

        Jenerik bmw = new Jenerik <>(new BMW("BMW 5-series"," black "));
        bmw.print();

        screeninfo("SUV");
        screeninfo("sedan");
    }
    private static <T> void screeninfo(T info) {
        System.out.println(info);
    }
}
