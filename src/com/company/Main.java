package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] weather = {6.8, -1.8, 33.6, -8.9, 7.9, 9.8, -3, 12.8, -4, 18.8, 1.6, -4, 6.6, 2.2, -6};
        int ntjl = 0;
        double awia = 0.0;
        for (int i = 0; i < weather.length; i++) {
            if (weather[i] < 0) {
                ntjl = i;
                break;
            }
        }
        for (int i = ntjl; i < weather.length; i++) {
            if (weather[i] > 0) {
                awia += weather[i];
            }
        }
        double sas = awia / weather.length;
        System.out.println("Среднее арифметическое:" + sas);
        for (int i = 0; i < weather.length; i++) {
            int a = i;
            double minI = weather[i];
            for (int j = i + 1; j < weather.length; j++) {
                if (weather[j] < minI) {
                    minI = weather[j];
                    a = j;
                }
            }
            if (i != a) {
                double min = weather[i];
                weather[i] = weather[a];
                weather[a] = min;
            }
            System.out.println(Arrays.toString(weather));
        }
    }
}