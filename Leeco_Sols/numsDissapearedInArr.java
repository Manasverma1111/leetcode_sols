package com.manas.leetco;
import java.util.ArrayList;
import java.util.List;
public class numsDissapearedInArr {
    public List<Integer> findDissapearednum(int[] numsArr){

        for(int i =0; i < numsArr.length; i++){
            int index = Math.abs(numsArr[i]) -1;

            if(numsArr[index] > 0){
                numsArr[index] = -numsArr[index];
            }
        }

        List<Integer> resList = new ArrayList<>();

        for(int i = 0; i < numsArr.length; i++){
            if(numsArr[i] > 0){
                resList.add(i + 1);
            }
        }

        return resList;
    }

    public static void main(String[] args) {
        numsDissapearedInArr solution = new numsDissapearedInArr();

        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution.findDissapearednum(nums1));

        int[] nums2 = {1, 1};
        System.out.print(solution.findDissapearednum(nums2));
    }

}
