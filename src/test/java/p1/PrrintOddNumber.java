package p1;

import org.testng.annotations.Test;

public class PrrintOddNumber {

    @Test
    public void printOddNumber(){

        for(int i=0; i<10; i++){

            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
