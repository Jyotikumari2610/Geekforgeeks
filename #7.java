//You are familiar with producing output using JAVA In this task, you'll be required to write three messages in three separate lines. Write Geeks for Geeks. But wait a minute!! You need to write each word of it in a separate line.
//In the function printIndividualLine(), output each word of Geeks for Geeks in a separate line.
//Hint: System.out.println() might be useful here!

class Geeks {

    // Function to print each word in single line
    static void printIndividualLine() {

        // Your code here
        System.out.println("Geeks\nfor\nGeeks");
    }
}


//Given a English alphabet c, Write a program to check whether a character is a vowel or not.

// User function Template for Java
class Solution {
    String isVowel(char c) {
        // code here
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return "YES";
        }
        else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
            return "YES";
        }
        else{
            return "NO";
        }
    }
}
