package javaalgorithm.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSum {
    public static void main(String[] args) throws IOException {
        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));
        String aa = brf.readLine();
        String[] bb = brf.readLine().split("");

        int dd = 0;
        for (int i = 0; i < Integer.parseInt(aa); i++) {
            dd += Integer.parseInt(bb[i]);
        }
        System.out.println(dd);
    }
}
