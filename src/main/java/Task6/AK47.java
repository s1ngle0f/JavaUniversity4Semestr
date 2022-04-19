package Task6;

public class AK47 implements Weapon{
    @Override
    public void shoot() {
        System.out.println("AK47 shooted");
    }

    @Override
    public void reload() {
        System.out.println("AK47 reloaded");
    }
}
