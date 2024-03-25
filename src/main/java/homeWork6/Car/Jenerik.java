package homeWork6.Car;

public class Jenerik<T extends Cars & Icar>  {
    T klass;
    public Jenerik(T klass){
        this.klass=klass;
    }

    public void print(){
    klass.print();
    klass.fuel();

    }


}
