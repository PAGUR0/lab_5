package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int[] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++){
            System.out.printf("Введите %d элемент: ", i + 1);
            array[i] = in.nextInt();
        }
        selectionSort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void selectionSort(int[] sortArr){
        for (int i = 0; i < sortArr.length; i++){
            int min_id = i;
            int min = sortArr[i];
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {
                    min_id = j;
                    min = sortArr[j];
                }
            }
            sortArr[min_id] = sortArr[i];
            sortArr[i] = min;
        }

    }

}
