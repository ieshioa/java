package com.green.day6_0321.ch3;

public class OperatorEx32 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;
        absX = x < 0 ? -x : x;
        absY = y < 0 ? -y : y;
        absZ = z < 0 ? -z : z;

        System.out.printf("x = %d, |x| = %d\ny = %d, |y| = %d\nz = %d, |z| = %d\n", x,absX,y,absY, z,absZ);

        //책이랑 다름
        signX =  x == 0 ? ' '   // x=0이면 빈칸
                        : x < 0 ? '-' : '+';  // x!=이면 + - 붙여줌
        signY =  y == 0 ? ' '
                        : y < 0 ? '-' : '+';
        signZ =  z == 0 ? ' '
                : z < 0 ? '-' : '+';
        System.out.printf("x = %c%d\ny = %c%d\nz = %c%d\n", signX,absX, signY, absY, signZ,absZ);
    }
}
