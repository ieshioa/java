package com.green.day8_0325.ch4;

public class FlowEx19 {
    public static void main(String[] args) {
        /*
                <조건>
                이렇게 출력해라
                111
                112
                113
                121
                122
                123
                131
                132
                133
                211
                ...
                333
         */
        for (int i = 1; i<4; i++){
            for (int j = 1; j < 4; j++){
                for (int k = 1; k < 4; k++){
                    System.out.printf("%d%d%d\n", i,j,k);
                }
            }
            System.out.println("-----");
        }
    }
}
