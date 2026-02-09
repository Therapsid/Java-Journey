package arrays;

import java.util.Arrays;

public class StringArray {
    static void main() {
        String s = "ABC";


        char[] ch = new char[3];
        ch[0] = 'A';
        ch[1] = 'B';
        ch[2] = 'C';

        //char[] ch = s.toCharArray()


        for (char c : ch) {
            System.out.print(c);
        }


    }
}
