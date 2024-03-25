package homeWork5.klass;

public class Main {
    public static void main(String[] args){

        Cat cat = new Cat();
        cat.info("Барсик", 4,11,"серый");
        System.out.println(cat.toString());
        cat.say();

        Dog dog = new Dog();
        dog.info("Зевс",12,14, "черный");
        System.out.println(dog.toString());
        dog.say();

        Duck duck = new Duck();
        duck.info("Дональд",1,9,"белый");
        System.out.println(duck.toString());
        duck.fly();
        duck.say();

    }

}
