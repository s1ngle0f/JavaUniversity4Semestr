package Task6;

public class Main {
    public static void main(String[] args) {
        // Фабричный метод
        CarFactoryMethod carFactoryMethod = new CarFactoryMethod();
        Car merc = carFactoryMethod.MakeCar(Mercedes.class);
        Car bmw = carFactoryMethod.MakeCar(BMW.class);
        Car audi = carFactoryMethod.MakeCar(Audi.class);
        merc.MakeBrrrBrrr();
        bmw.MakeBrrrBrrr();
        audi.MakeBrrrBrrr();

        // Абстрактная фабрика
        USSRFactory ussrFactory = new USSRFactory();
        Weapon ak47 = ussrFactory.createWeapon();
        ak47.shoot();
        ak47.reload();
        USAFactory usaFactory = new USAFactory();
        Weapon m4a4 = usaFactory.createWeapon();
        m4a4.shoot();
        m4a4.reload();

        // Строитель
        Groups groups = new Groups.Builder().addGroup("ikbo-30-20")
                .addGroup("ikbo-01-20")
                .addGroup("ikbo-02-20")
                .addGroup("ikbo-03-20")
                .addGroup("ikbo-04-20").build();
        System.out.println(groups.list);

        // Прототип
        Store appleStore0 = new AppleStore(10, 1);
        Store appleStore1 = appleStore0.copy();
        System.out.println(appleStore0);
        System.out.println(appleStore1);
    }
}
