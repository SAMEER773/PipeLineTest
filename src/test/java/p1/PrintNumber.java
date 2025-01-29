package p1;

import org.testng.annotations.Test;

public class PrintNumber {
    @Test
    public static void printNumber(){

        for(int i=0; i<10; i++){

            System.out.println(i);
        }
    }
}
