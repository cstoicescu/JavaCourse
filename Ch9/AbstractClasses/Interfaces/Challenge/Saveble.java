package Ch9.AbstractClasses.Interfaces.Challenge;

import java.util.List;


public interface Saveble {
    List<String> write();
    void readList (List<String> savedValues);
}
