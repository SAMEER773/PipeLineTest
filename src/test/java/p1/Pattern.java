package p1;

import org.testng.annotations.Test;

public class Pattern {
    @Test
    public static void trigularPatter(){

        for(int i =0; i<4; i++){

            for(int j=0; j<=i; j++){

                System.out.print("8");
            }
            System.out.println();
        }
    }

}
