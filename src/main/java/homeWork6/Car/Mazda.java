package homeWork6.Car;

public class Mazda extends Cars {
    public Mazda(String model, String color){
        this.color=color;
        this.model=model;

    }
    @Override
    public  void fuel() {
        super.fuel();
        System.out.println("бензином");

    }
}
