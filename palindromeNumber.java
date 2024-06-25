import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number to check
        System.out.print("Enter the number to check if it is a palindrome: ");
        int number = scanner.nextInt();

        // Check if the number is a palindrome and print the result
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    static boolean isPalindrome(int x) {
        int orgNumber = x;
        int revNumber = 0;

        while (x > 0) {
            int digit = x % 10;
            revNumber = revNumber * 10 + digit;
            x /= 10;
        }
        return revNumber == orgNumber;
    }
}


//for LEETCODE

//public class Solution{
//    public static void main(String [] args){
//        System.out.println(isPalindrome(121));
//    }
//    static boolean isPalindrome(int x){
//        int orgNumber=x;
//        int revNumber=0;
//
//        while(x>0){
//            int digit= x%10;
//            revNumber= revNumber*10+digit;
//            x/=10;
//        }
//        if(revNumber == orgNumber){
//            return true;
//        }else{
//            return false;
//        }
//    }
//}