package com.green.day18_0408;

public class ExamTest {
    public static void main(String[] args) {
        int rVal = Exam.getRandomValue(1,101);  //  1~10 랜덤
        rVal =Exam.getRandomValue(5,21);  // 5~20
        Exam.printOddEven(rVal);
        int rVal2 = Exam.getRandomValue(1,101);


        for (int i = 100; i <104 ; i++) {
            System.out.println(200-i);
            /*
            100 -> 100
            101 -> 99
            102 -> 98
            103 -> 97
             */
        }
        System.out.println("----");
        Exam.test(rVal, rVal2);
        /*
          v1 짝수 > v2 짝수 > v2 - v1
                      홀수 > v1
          v1 홀수 > v2 찍수 > v2 - 5
                      홀수 > v2
         */
        System.out.println("---");
        Exam.printNumToNum(4,22);  // 4 ~ 22 세로로 출력
        System.out.println("---");
        int score = Exam.getRandomValue(0,100);
        System.out.println("score: " + score);
        String grade = Exam.getGrade(score);
        System.out.println(grade);
        System.out.println("---");
        int sum = Exam.getSumFromTo(8,20); // 8~20 모두 더한 값
        System.out.println("sum: "+ sum);
    }
}

class Exam {
    static int getSumFromTo (int n1, int n2) {
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        return sum;
    }
    static void test (int n1, int n2) {
        int result;
        result = (n1 % 2 == 0 ?
                n2 % 2 == 0 ? n2 - n1 : n1
                : n2 % 2 == 0 ?  n2 - 5 : n2);
//        if ( n1 % 2 == 0) {
//            if (n2 % 2 == 0){
//                result = n2 - n1;
//            } else {
//                result = n1;
//            }
//        } else{
//            if (n2 % 2 == 0) {
//                result = n2 - 5;
//            } else {
//                result = n2;
//            }
//        }
        System.out.printf("val1: %d, val2: %d\nresult: %d\n", n1,n2,result);
    }
    static int getRandomValue (int n1, int n2) {
        return (int)(Math.random() * (n2-n1)) + n1;
    }
    static void printOddEven (int val){
        String s = (val % 2 == 0) ? "짝" : "홀";
        System.out.printf("%d는(은) %s수입니다.\n", val, s);
    }
    static void printNumToNum (int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
        }
    }
    static String getGrade(int score){
        if ( 0 > score || score > 100) {
            return "점수가 잘못되었습니다.";
        }
        int tenD = score / 10;
        if (tenD == 10) {
            return "A+";
        } else if (tenD < 7) {
            return "F";
        }
        String g = switch (tenD) {
            case 9 -> "A";
            case 8 -> "B";
            default -> "C";
        };
        int oneD = score % 10;
        g += switch (oneD) {
            case 0,1,2 -> "-";
            case 3,4,5,6 -> "0";
            default -> "+";
        };
        return String.format("grade: %s",g);
    }
}
