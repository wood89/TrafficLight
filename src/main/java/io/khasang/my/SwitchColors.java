package io.khasang.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * class SwitchColors v.001
 * Required for work of traffic light
 * Created by Khomov Alexander 01.06.2016
 */
public class SwitchColors extends NamesColorsAndLengthsColors {

    private static long DEFAULTTIME = 0;

    // проверка на равенство 0
    private void inspectionNullNumber(long number) {
        if (number == 0) System.out.println("Your color is " + getNAMEREDCOLOR());
    }

    // проверка на красный цвет
    private void inspectionRedColor(long number) {
        for (long valuesBust = 0 + DEFAULTTIME; valuesBust < getLENGTHREDCOLOR() + DEFAULTTIME; valuesBust++) {
            if (valuesBust == number) {
                System.out.println("Your color is " + getNAMEREDCOLOR());
                break;
            }
        }
    }

    // проверка на желтый цвет
    private void inspectionYellowColor(long number) {
        for (long valuesBust = getLENGTHREDCOLOR() + DEFAULTTIME;
             valuesBust < getLENGTHYELLOWCOLOR() + getLENGTHREDCOLOR() + DEFAULTTIME; valuesBust++) {
            if (valuesBust == number) {
                System.out.println("Your color is " + getNAMEYELLOWCOLOR());
                break;
            }
        }
    }

    // проверка на зеленый цвет
    private void inspectionGreenColor(long number) {
        for (long valuesBust = getLENGTHYELLOWCOLOR() + getLENGTHREDCOLOR() + DEFAULTTIME;
             valuesBust < sumAllColors() + DEFAULTTIME; valuesBust++) {
            if (valuesBust == number) {
                System.out.println("Your color is " + getNAMEGREENCOLOR());
                break;
            }
        }
    }

    // увеличение
    private long increaseDefaultTime() {
        DEFAULTTIME = DEFAULTTIME + sumAllColors();
        return DEFAULTTIME;
    }

    // проверка на отрицательные числа
    private void negativeNumber(long number) {
        if (number < 0) {
            System.out.println("Your input a negative number");
        }
    }

    // проверка и вывод нужного цвета светофора
    private void checkValues(long number) {
        inspectionNullNumber(number);
        for (int valuesBust = 0; valuesBust < number; valuesBust++) {
            inspectionRedColor(number);
            inspectionYellowColor(number);
            inspectionGreenColor(number);
            increaseDefaultTime();
        }
        negativeNumber(number);
    }

    // занесение пользователем минуты и вывод значения
    public void computingColor() {
        System.out.println("Please, input your minute");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            long number = Long.parseLong(reader.readLine());
            checkValues(number);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}