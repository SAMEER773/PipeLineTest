package p1;

import org.testng.annotations.Test;

public class FirstPgm {

    @Test
    public static void firstPgm() {

        String val = System.getProperty("propertyName");

        System.out.println(val);

        String val2 = System.getProperty("myValue");
        System.out.println(val2);
    }
}
