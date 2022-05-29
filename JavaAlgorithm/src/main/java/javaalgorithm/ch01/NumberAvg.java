package javaalgorithm.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberAvg {
    public static void main(String[] args) throws IOException  {
        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));
        String cnt = brf.readLine();
        String[] score = brf.readLine().split(" ");

        float maxScore = 0;
        float totalScore = 0;
        float avgScore = 0;
        for (int i = 0; i < Integer.parseInt(cnt); i++) {
            if (maxScore < Integer.parseInt(score[i])) {
                maxScore = Integer.parseInt(score[i]);
            }
            totalScore += Integer.parseInt(score[i]);
        }
        avgScore = (totalScore / maxScore * 100) / Long.parseLong(cnt);
        System.out.println(avgScore);
    }
}
