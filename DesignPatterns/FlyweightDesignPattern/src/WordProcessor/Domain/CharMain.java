package WordProcessor.Domain;

public class CharMain {
    public static void main(String[] args) {
        /*
            this is the data we want to write into the word processor.

            Total = 58 characters
            t = 7 times
            h = 3 times
            a = 3 times and so on ...
         */

        Character object1 = new Character('t', "Arial", 10, 0, 0);
        Character object2 = new Character('h', "Arial", 10, 0, 1);
        Character object3 = new Character('i', "Arial", 10, 0, 1);
        Character object4 = new Character('s', "Arial", 10, 0,3);
    }
}
