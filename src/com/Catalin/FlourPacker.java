package com.Catalin;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(2, 2, 12));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        bigCount *= 5;
        if ((bigCount + smallCount) >= goal) {
            return (goal % 5) <= smallCount;
        }
        return (goal - bigCount) <= smallCount;
    }
}
