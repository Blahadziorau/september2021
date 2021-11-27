import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        /*TriUpsideDown g = new TriUpsideDown();
        g.foo();*/
        List ss = new ArrayList<>();
        List ss2 = new ArrayList<>();
        File file = new File("C:/Devonlegion/Codility/src/ggg.txt");
        Scanner scn = new Scanner(file);
        Scanner scn1 = new Scanner(file);
        while (scn.hasNext()) {
            ss.add(scn.next());              //every element of raw to Arraylist

        }

        scn.close();

        System.out.println("ss  ---> "+ ss);

/*
        System.out.println(ss.get(0));
        System.out.println(ss.get(1));
        System.out.println(ss.get(2));
*/

        while (scn1.hasNext()) {
            ss2.add(scn1.nextLine());            //every raw to Arraylist

        }

        scn1.close();
        System.out.println("ss2 ---> "+ ss2);

    }
}
