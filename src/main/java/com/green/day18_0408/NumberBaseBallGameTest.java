package com.green.day18_0408;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGameTest {
    public static void main(String[] args) {
        NumberBaseBallGame game = new NumberBaseBallGame(3);
        //game.showArr();
        game.start();
    }
}

class NumberBaseBallGame {
    static final int MIN_NUMBER = 1;
    static final int DEFAULT_NUMBER = 3;
    static final int MAX_NUMBER = 9;

    final int NUMBER_COUNT;
    private int[] numArr;
    NumberBaseBallGame(final int NUMBER_COUNT) {
        if (NUMBER_COUNT < MIN_NUMBER || NUMBER_COUNT > MAX_NUMBER) {
            this.NUMBER_COUNT = DEFAULT_NUMBER;
        } else {
            this.NUMBER_COUNT = NUMBER_COUNT;
        }
        this.init();
    }
    private void init() {
        this.numArr = new int[NUMBER_COUNT];
        // 1 ~ 9 중복되지 않게 각 방에 대입해주세요.
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = getRandomValue();
            for (int j = 0; j < i; j++) {
                if (numArr[i] == numArr[j]) {
                    i--;
                    break;
                }
            }
        }
    }
    private int getRandomValue() {
        return (int)(Math.random() * MAX_NUMBER) + MIN_NUMBER;
    }
    public void showArr() {
        System.out.println(Arrays.toString(this.numArr));
    }
    void start() {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.printf("%d자리 수 입력 >> ", NUMBER_COUNT);
            int num = scan.nextInt();
            int[] arr = new int[NUMBER_COUNT];
            for (int i = arr.length - 1; i >= 0; i--) {
                arr[i] = num % 10;
                num /= 10;
            }
            int S = 0, B = 0, O = 0;
            for (int i = 0; i < NUMBER_COUNT; i++) {
                if (arr[i] == numArr[i]) {
                    S++;
                }
            }
            if (S == NUMBER_COUNT) {
                System.out.println("성공!");
                break;
            }
            for (int i = 0; i < NUMBER_COUNT; i++) {
                for (int j = 0; j <NUMBER_COUNT; j++) {
                    if(arr[i] == numArr[j]) {
                        B++;
                    }
                }
            }
            B -= S;
            O = NUMBER_COUNT - B - S;
            System.out.printf("Strike: %d, Ball: %d, Out: %d\n", S, B, O);
//            System.out.printf("%d\t%d\t%d",S, B, O);
//            break;

        }

    }
}
