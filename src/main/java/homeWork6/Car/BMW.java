package homeWork6.Car;

public class BMW extends Cars {
    public BMW(String model, String color){
        this.color=color;
        this.model=model;
        ;
    }
    @Override
    public void fuel() {
        super.fuel();
        System.out.println("дизелем");

    }
}
