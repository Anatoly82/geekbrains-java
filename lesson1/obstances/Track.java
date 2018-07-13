package Java2.lesson1.obstances;

import Java2.lesson1.animals.*;
/**
 * class Track
 *
 * @author Anatoly Yakovlev
 */
public class Track implements Let {
    private int length;

    public Track(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(Animal animal) {
        return animal.run(length);
    }
    public int getLength(){
        return length;
    }
}