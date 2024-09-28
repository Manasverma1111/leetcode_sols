package com.manas.leetco;
import java.util.Arrays;

public class AssignCookies{
    public int contentChild(int[] greedFactor, int[] cookiesSize){

        Arrays.sort(greedFactor);
        Arrays.sort(cookiesSize);

        int childIndex = 0;
        int cookiesIndex = 0;

        while(childIndex < greedFactor.length && cookiesIndex < cookiesSize.length){

            if(cookiesSize[cookiesIndex] >= greedFactor[childIndex]){
                childIndex++;
            }

            cookiesIndex++;
        }

        return  childIndex;
    }

    public static void main(String[] args) {
        AssignCookies solution = new AssignCookies();

        int[] greedfactor1 = {1, 2, 3};
        int[] cookieSize1 = {1, 1};
        System.out.println(solution.contentChild(greedfactor1, cookieSize1));

        int[] greedfactor2 = {1, 2};
        int[] cookieSize2 = {1, 2, 3};
        System.out.println(solution.contentChild(greedfactor2, cookieSize2));
    }
}
