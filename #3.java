//Given three integers a, d and n. Where a is the first term, d is the common difference of an A.P.  Calculate the nth term of A.P.  The nth term is given by an = a + (n-1)d
import java.util.*;
class Solution {
    public int nthTerm(int a, int d, int n) {
        // code here
        int an = a + (n - 1) * d;
        return an;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        Solution obj=new Solution();
        obj.nthTerm(a,d,n);
    }
}

//Given an integer s. Write a program to print the Right angle triangle wall. The length of perpendicular and base is s.  Note: Print exactly single " " after "*". Print a new line after printing the triangle
// User function Template for Java
import java.util.*;
class Solution {
    public static void triangleWall(int s) {
        // Write your code here
        for(int i=1;i<=s;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        Solution obj=new Solution();
        obj.triangleWall(s);
    }
}

//Given two strings S1 and S2 . Return "1" if both strings are anagrams otherwise return "0" .
// User function template for Java
import java.util.*;
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
        char a[]= S1.toCharArray();
        char b[]=S2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String S1=sc.nextLine();
        String S2=sc.nextLine();
        Solution obj=new Solution();
        
    }
}

//You'll be given two strings a and b, a separator symbol, and you need to print a and b such that a and b are separated by the separator symbol followed by a new line.
import java.util.*;
public class Solution {
    public static void utility(Scanner scn) {
        String a = scn.nextLine();
        String b = scn.nextLine();
        String separator = scn.nextLine();
        // print with seperator
        System.out.println(a+"" +separator+ ""+b);
    }
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        Solution obj=new Solution();
        obj.utility(scn);
        
    }
}


//You are given a number n, you need to print its multiplication table in a single line.
import java.util.*;
class Solution {
    public static void utility(int n) {
        // code here
        for(int i=1;i<=10;i++){
            int x=n*i;
            System.out.print(x+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution obj=new Solution();
        obj.utility(n);
    }
}

//You are given two integer variables x and y. You need to perform the following operations: p = x + y : Addition q = x - y : Subtraction r = x * y :Multiplication s = x / y : Division t = x % y : Modulo
// User function Template for Java
import java.util.*;
class Solution {

    public static void operations(int x, int y) {
        // Perform addition x+y below
        int p =x+y;
            // Perform subtraction x-y below
            int q =x-y;
                // Perform multiplication x*y below
            int r =x*y;
                // Perform division x/y below
            int s =x/y;
                // Perform modulo operation x%y below
            int t =x%y;

                // The below code prints the output. Don't change it!
            System.out.println(p + " " + q + " " + r + " " + s + " " + t);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Solution obj=new Solution();
        obj.operations(x,y);
    }
}

//Given two numbers a and b. The task is to find the GCD of  a and b. The GCD of two numbers is the largest number that can divide both a and b perfectly.
import java.util.*;
class Solution {
    public int computeGCD(int a, int b) {
        // code here
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Solution obj=new Solution();
        obj.computeGCD(a,b);
    }
}
class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;
        if(smallest>largest){
            int temp=smallest;
            smallest=largest;
            largest=temp;
        }
        for(int i=1;i<n-1;i++){
            int minVal=Math.min(smallest,arr[i]-k);
            int maxVal=Math.max(largest,arr[i]+k);
            if (minVal<0)
            continue;
            
            ans=Math.min(ans,maxVal-minVal);
        }
          /*  int subtract=arr[i]-k;
            int add=arr[i]+k;
            
            if(subtract>=smallest || add<=largest)
            continue;
            
            if(largest-subtract<=add-smallest){
                smallest=subtract;
            }
            else{
                largest=add;
            }
        }
        return Math.min(ans, largest-smallest);
        */
        return ans;
    }
    public static void main(String args[]){
        int k=2;
        int arr[]={3,9,7,5,8,10};
        Solution obj=new Solution();
        obj.getMinDiff(arr,k);
    }
}

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
