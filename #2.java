//Given a number n, number of apples in a bag. You and your friend are picking one apple turnwise from the bag. It is given that the first attempt is always by you. The person picking the last apple will be the winner. If you will win: print "You" (without quotes) If your friend will win: print "Friend" (without quotes)
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1){
            System.out.println("You");
        }
        else{
            System.out.println("Friend");
        }
    }
}

//Read a value and store it in the appropriate Java Data Type. 
import java.util.*;
class Solution {
    int javaIntType(Scanner sc) {
        // code here
        int n=sc.nextInt();
        return n;
    }

    String javaStringType(Scanner sc) {
        // code here
        sc.nextLine(); 
        String str=sc.nextLine();
        return str;
    }
    
    float javaFloatType(Scanner sc) {
        // code here
        float f=sc.nextFloat();
        return f;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Solution obj=new Solution();
         System.out.println(obj.javaIntType(sc));
         System.out.println(obj.javaStringType(sc));
         System.out.println(obj.javaFloatType(sc));
    }
}

//Given an integer n. Write a program to return the factorial of n.Factorial of a number is the product of all the numbers from 1 till n. Note: 0 factorial is equal to 1.
// User function Template for Java
import java.util.*;
class Solution {
    public static int nFactorial(int n) {
        int ans = 1;
        // Write your code here
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution obj=new Solution();
        obj.nFactorial(n);
    }
}

//Given two numbers a and b. The task is to find out their LCM.
// User function Template for Java
import java.util.*;
class Solution {
    public static int LCM(int a, int b) {

        // write your code here
        int lcm = Math.max(a, b);
        while(lcm % a != 0 || lcm % b != 0){
        lcm++;
        }
        // return LCM of a and b
        return lcm;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Solution obj=new Solution();
        obj.LCM(a,b);
    }
}

//Given an integer n find the sum of the first n natural number.
import java.util.*;
class Solution {
    public static int nSum(int n) {
        // code here
        int ans = 0;
        for(int i=0;i<=n;i++){
            ans+=i;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution obj=new Solution();
        obj.nSum(n);
    }
}


//You are given a string s, you need to print its characters at even indices (index starts at 0).
import java.util.*;
class Solution {
    public void printEvenIndices(String s) {
        // code here
        for(int i=0;i<s.length();i++){
            if(i%2==0)
               System.out.print(s.charAt(i));
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution obj=new Solution();
        obj.printEvenIndices(s);
    }
}

//The cost of stock on each day is given in an array price[]. Each day you may decide to either buy or sell the stock i at price[i], you can even buy and sell the stock on the same day. Find the maximum profit that you can get.Note: A stock can only be sold if it has been bought previously and multiple stocks cannot be held on any given day.

// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int profit=0;
        
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit +=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String args[]){
        int prices[]={345,876,896,342,121,554};
        Solution obj=new Solution();
        obj.maximumProfit(prices);
    }
}

//Given an array arr[] consisting of n integers, the task is to find all the array elements which occurs more than floor(n/3) times.Note: The returned array of majority elements should be sorted.

class Solution {

    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;

        // Initialize two candidates and their counts
        int ele1 = -1, ele2 = -1;
        int cnt1 = 0, cnt2 = 0;

        for (int ele : arr) {

            // Increment count for candidate 1
            if (ele1 == ele) {
                cnt1++;
            }

            // Increment count for candidate 2
            else if (ele2 == ele) {
                cnt2++;
            }

            // New candidate 1 if count is zero
            else if (cnt1 == 0) {
                ele1 = ele;
                cnt1++;
            }

            // New candidate 2 if count is zero
            else if (cnt2 == 0) {
                ele2 = ele;
                cnt2++;
            }

            // Decrease counts if neither candidate
            else {
                cnt1--;
                cnt2--;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;

        // Count the occurrences of candidates
        for (int ele : arr) {
            if (ele1 == ele) cnt1++;
            if (ele2 == ele) cnt2++;
        }

        // Add to result if they are majority elements
        if (cnt1 > n / 3) res.add(ele1);
        if (cnt2 > n / 3 && ele1 != ele2) res.add(ele2);

        // Sort the result if needed
        if (res.size() == 2 && res.get(0) > res.get(1)) {
            int temp = res.get(0);
            res.set(0, res.get(1));
            res.set(1, temp);
        }

        return res;
    }
}
