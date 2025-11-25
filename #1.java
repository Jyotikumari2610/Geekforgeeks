//Logical operators AND, OR, NOT are used in condition checking. Like a AND b checks if both a and b are true. a OR b checks if either of a or b is true. !a complements the boolean value of a.
//In this question you basically need to do
//a && b
//a || b
//!a
import java.util.*;
class Solution {
    public String booleanOperations(boolean a, boolean b) {
        // Code here
        boolean k=a&&b;
        boolean l=a||b;
        boolean m=!a;
        
        return k+" "+l+" "+m;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean a=sc.nextBoolean();
        boolean b=sc.nextBoolean();
        Solution obj=new Solution();
        obj.booleanOperations(a,b);
    }
}

//2.Given four inputs that are stored in variables a, b, c, and d. You need to write an expression to evaluate the following formula. Use integer division. The expression should be a single statement.
 import java.util.*;
class Solution {
    public int calculate(int a, int b, int c, int d) {
        // code here
        int k=(a+b)/c+d;
        return k;
    }
    public static void main(String s){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        Solution obj=new Solution();
        int ans=obj.calculate(a,b,c,d);
        System.out.println(ans);
    }
}
//3.Given a floating number, you need to input it. The floating number will then be print it after multiplying it by 10.
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) {
        // Take a Float input and Print
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        f=f*10;
        System.out.println(f);
    }
}
//4.You are given two string variables a and b, and you have to print a and b with a space between them. However, you must prevent the print statement from providing a new line as the new line will be given by the main driver code.
import java.util.*;
class Solution {
    public void utility(Scanner sc) {
        // code here
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(a+" "+b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Solution obj=new Solution();
         obj.utility(sc);
    }
}
//5.Given a string s, and a pattern p. You need to find if p exists in s or not and return the starting index of p in s. If p does not exist in s then -1 will be returned.
//Here p and s both are case-sensitive.
import java.util.*;
class Solution {
    public static int findPattern(String s, String p) {
        // code here
        for(int i=0;i<s.length();i++){
            int idx=0;
            if(s.contains(p)){
               idx=s.indexOf(p);
              return idx;
            }
             else 
                 return -1;
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p=sc.nextLine();
        Solution obj=new Solution();
        obj.findPattern(s,p);
    }
}
