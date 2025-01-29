package p1;

import org.testng.annotations.Test;

public class PassArgs {

    @Test
    public void passArgs(){

        String abc = System.getProperty("args1");
        String abcd = System.getProperty("args2");

        System.out.println(abc);
        System.out.println(abcd);

    }
}
