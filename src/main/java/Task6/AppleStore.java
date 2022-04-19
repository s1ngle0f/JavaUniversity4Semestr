package Task6;

public class AppleStore extends Store{
    public int countOfSmartphones;
    public int numberOfStore;

    public AppleStore(int countOfSmartphones, int numberOfStore) {
        this.countOfSmartphones = countOfSmartphones;
        this.numberOfStore = numberOfStore;
    }

    @Override
    public Store copy() {
        return new AppleStore(this.countOfSmartphones, this.numberOfStore);
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode()) + " AppleStore{" +
                "countOfSmartphones=" + countOfSmartphones +
                ", numberOfStore=" + numberOfStore +
                '}';
    }
}
