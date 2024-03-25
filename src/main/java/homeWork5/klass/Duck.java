package homeWork5.klass;

public class Duck extends Animal implements IFlying {
        protected Duck() {
            System.out.println("Утка");
        }
    @Override
    public void say() {
        super.say();
        System.out.println("Кря");

    }
    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}
