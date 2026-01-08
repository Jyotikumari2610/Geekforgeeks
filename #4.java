//Given a number a, you have to use if, else if, else conditional statements according to the following: if number is greater than 100: Print "Big" (without quotes) else if number is smaller than 10: Print "Small" (without quotes)  else: Print "Number" (without quotes)
import java.util.*;

public class Solution {
    public static void solve() {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         if(a>100){
             System.out.println("Big");
         }
         else if(a<10){
             System.out.println("Small");
         }
         else {
             System.out.println("Number");
         }
    }
    public static void  main(String args[]){
        Solution obj=new Solution();
        obj.solve();
    }
}

//Given two positive integers a and b. Your task is to perform right shift bitwise operation on it as given i.e. a>>b.
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Perform operation and print
        int c=a>>b;
        System.out.println(c);
    }
}

//Given a natural number n. You have to find the number of digits in it and return it.
//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            n=n/10;
            n++;
        }
        System.out.println(n);
    }
}


//Given an integer array arr[]. The task is to find the sum of the array using streams.
import java.util.*;
class Solution {
    public static int sumUsingStreams(int[] arr) {
        // code here
        return Arrays.stream(arr)
                     .sum();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println(Solution.sumUsingStreams(arr));
    }
}

//You are given an array of integers arr[]. You have to reverse the given array.Note: Modify the array in place.
import java.util.*;
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int rev=0;
        for(int i=arr.length-1;i>=0;i--){
            rev=arr[i];
        }
        System.out.print(rev);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        obj.reverseArray(arr);
    }
}
