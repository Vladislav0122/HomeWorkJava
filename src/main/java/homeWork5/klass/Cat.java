package homeWork5.klass;

public class Cat extends Animal{
    public Cat(){
        System.out.println("Кот");
    }
        @Override
        public void say() {
        super.say();
        System.out.println("Мяу");

        }

}
