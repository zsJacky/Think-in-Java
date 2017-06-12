// Sixteenth.java of chapter9 exercise

import java.util.*;
import java.nio.*;

public class Sixteenth {
    public static void main(String[] args){
        Scanner s = new Scanner(new CharAdapter(10));
        while (s.hasNext()){
            System.out.println(s.next());
        }
    }
}
class MyChar {
    private static Random rand = new Random(1000);
    public char next(){
        return (char) rand.nextInt(50);
    }
}
class CharAdapter extends MyChar implements Readable{
    private int count ;
    public CharAdapter(int i){
        count = i;
    }
    @Override
    public int read(CharBuffer cb) {
        if (count -- == 0){
            return -1;
        }
        cb.append(next());
        return cb.length();
    }
}
