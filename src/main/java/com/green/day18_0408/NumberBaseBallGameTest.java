package com.green.day18_0408;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGameTest {
    public static void main(String[] args) {
        NumberBaseBallGame game = new NumberBaseBallGame(4);
       // game.showArr();
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
    //--------------------------------------------------------------------------------------------
    boolean contain(int[] numArr, int input) {
        for (int num: numArr) {
            if(num == input){
                return true;
            };
        }
        return false;
    }
    void startGame() {
        System.out.println("게임을 시작합니다.");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int strike = 0;
            int ball = 0;

            System.out.print("숫자를 입력해주세요: >> ");
            String input = sc.nextLine();
            String[] strArr = input.split(" ");
            int[] answerNumber = new int[strArr.length];

            for (int i = 0; i< strArr.length; i++) {
                int n = Integer.parseInt(strArr[i]);
                answerNumber[i] = n;
            }

            for (int i = 0; i < numArr.length; i++) {
                boolean equals = numArr[i] == answerNumber[i]; // 동일한 인덱스의 값 비교
                if (equals) {
                    strike++;
                } else if (contain(numArr, answerNumber[i])) {    // numArr의 숫자에 input이 포함되는지 비교하는 메소드.
                    ball++;
                }
            }
            int out = numArr.length - (strike + ball);
            System.out.printf("strike: %d ball: %d out: %d\n",strike,ball,out);

            if(strike==numArr.length) {break;}

        }
        System.out.println("축하드립니다!! Strike 를 모두 맞히셨습니다!! 와~ ^_^~!");
        System.out.println("종료!");
        sc.close();
    }
    //--------------------------------------------------------------------------------------------
    void start() {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.printf("%d자리 수 입력 (구분은 스페이스바) >> ", NUMBER_COUNT);
            String strAnswer = scan.nextLine();
            String[] answerStrArr = strAnswer.split("");
            int[] answerArr = new int[NUMBER_COUNT];
            for (int i = 0; i < answerArr.length; i++) {
                answerArr[i] = Integer.parseInt(answerStrArr[i]);
            }
            if (numArr.length != answerArr.length) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
//            System.out.printf("%d자리 수 입력 >> ", NUMBER_COUNT);
//            int num = scan.nextInt();
//            int[] answerArr = new int[NUMBER_COUNT];
//            for (int i = answerArr.length - 1; i >= 0; i--) {
//                answerArr[i] = num % 10;
//                num /= 10;
//            }
            int S = 0, B = 0;
            for (int i = 0; i < NUMBER_COUNT; i++) {
                if (answerArr[i] == numArr[i]) {
                    S++;
                }
                for (int j = 0; j <NUMBER_COUNT; j++) {
                    if(answerArr[i] == numArr[j]) {
                        B++;
                    }
                }
            }
            if (S == NUMBER_COUNT) {
                System.out.println("성공!");
                break;
            }
            B -= S;
            System.out.printf("Strike: %d, Ball: %d, Out: %d\n", S, B, NUMBER_COUNT - B - S);
//            System.out.printf("%d\t%d\t%d",S, B, NUMBER_COUNT - B - S);
//            break;

        }
        scan.close();
    }
}
