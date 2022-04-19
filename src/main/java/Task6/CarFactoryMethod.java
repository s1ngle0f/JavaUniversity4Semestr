package Task6;

import java.lang.reflect.Type;

public class CarFactoryMethod {
    public Car MakeCar(Class c){
        Car car = null;
        if (Mercedes.class.equals(c)) {
            car = new Mercedes((int) (Math.random() * 899 + 100));
        } else if (BMW.class.equals(c)) {
            car = new BMW((int) (Math.random() * 899 + 100));
        }else if(Audi.class.equals(c)){
            car = new Audi((int) (Math.random() * 899 + 100));
        }
        return car;
    }
}
