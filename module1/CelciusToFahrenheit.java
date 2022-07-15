import java.util.*;
import java.lang.*;
import java.io.*;

public class CelciusToFahrenheit {
    public static int far(int cel) {
        return (cel * 9 / 5 + 32);
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cel = sc.nextInt();
        System.out.println(far(cel));
    }
}
