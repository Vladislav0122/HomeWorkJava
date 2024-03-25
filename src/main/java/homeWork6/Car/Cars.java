package homeWork6.Car;

public class Cars implements Icar {
    protected String model;
    protected String color;
    public void print(){
        System.out.print(model);
        System.out.print(color);
    }

    public void fuel(){
        System.out.print("Я заправляюсь ");
    }



}
