package Task6;

import java.util.ArrayList;
import java.util.List;

public class Groups {
    public final List<String> list;
    private Groups(Builder builder){
        list = builder.list;
    }
    public static class Builder{
        public List<String> list = new ArrayList<>();
        public Builder addGroup( String str ){
            list.add(str);
            return this;
        }

        public Groups build(){
            list.sort(((o1, o2) -> o1.compareTo(o2)));
            return new Groups(this);
        }
    }
}
