package Task6;

public class USSRFactory implements WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new AK47();
    }
}
