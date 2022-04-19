package Task6;

public class Car {
    private int number;

    public Car(int number) {
        this.number = number;
    }

    public void MakeBrrrBrrr(){
        System.out.println(this.getClass().getTypeName() + ": " + number + " made brrr brrr");
    }
}
