package homeWork5.klass;

public class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected String color;
    public void info(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public void say() {
        System.out.print("Я говорю - ");
    }
    public void go() {
        System.out.println("Я иду");
    }
    public void drink() {
        System.out.println("Я пью");
    }
    public void eat() {
        System.out.println("Я ем");
    }
    @Override
    public String toString() {

        if (age == 1) {
            return "Привет! меня зовут " + name + ", мне " + age + " год, я вешу " + weight + "кг, мой цвет - " + color;
        } else if (age >= 2 && age <= 4) {
            return "Привет! меня зовут " + name + ", мне " + age + " года, я вешу " + weight + "кг, мой цвет - " + color;
        } else {
            return "Привет! меня зовут " + name + ", мне " + age + " лет, я вешу " + weight + "кг, мой цвет - " + color;
        }
    }
}
