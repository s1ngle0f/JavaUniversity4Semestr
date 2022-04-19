package Task6;

public class USAFactory implements WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new M4A4();
    }
}
