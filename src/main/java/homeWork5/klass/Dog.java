package homeWork5.klass;

public class Dog extends Animal{

protected Dog(){
    System.out.println("Собака");

}
    @Override
    public void say() {
        super.say();
        System.out.println("Гав");

    }

}
