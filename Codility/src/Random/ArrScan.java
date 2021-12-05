package Random;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrScan {
    public static void main(String[] args) throws FileNotFoundException {
        List ss = new ArrayList<>();
        List ss2 = new ArrayList<>();
        List<Integer> ss3 = new ArrayList<>();
        File file = new File("C:/Devonlegion/Codility/src/ggg.txt");
        Scanner scn = new Scanner(file);
        Scanner scn1 = new Scanner(file);
        while (scn.hasNext()) {
            ss.add(scn.next());              //every element of raw to Arraylist
        }
        scn.close();
        System.out.println("ss  ---> " + ss);
        while (scn1.hasNext()) {
            ss2.add(scn1.nextLine());            //every raw to Arraylist
        }
        scn1.close();
        System.out.println("ss2 ---> " + ss2);
        System.out.println("Every raw from txt doc:");
        for (Object e : ss2) {
            System.out.println(e);
        }
        System.out.println("Every element of raw from txt doc:");
        for (Object e : ss) {
            System.out.println(e);
        }
        Scanner scn3 = new Scanner(file);
        System.out.println("Integers from txt doc:");
        while (scn3.hasNext()) {                          // Scan doc for Integers and add them to array
            if (scn3.hasNextInt()) {
                ss3.add(scn3.nextInt());
            } else {
                scn3.next();
            }
        }
        scn3.close();
        for (Object e : ss3
        ) {
            System.out.println(e);
        }
    }
}