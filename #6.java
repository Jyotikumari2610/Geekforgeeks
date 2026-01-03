//A sorted array of distinct elements arr[] is rotated at some unknown point, the task is to find the minimum element in it. 

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int n=arr.length;
        Arrays.sort(arr);
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]==min)
            min=arr[i];
        }
      return min;
    }
    public static void main(String args[]){
        int arr[]={2,8,5,6,4,3,1};
        Solution obj=new Solution();
        obj.findMin(arr);
    }
}

//Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(target==arr[i])
            count++;
        }
       return count; 
    }
    public static void main(String args[]){
      int arr[]={2,5,4,3,7,6,8,2};
      int target=2;
      Solution obj=new Solution();
      obj.countFreq(arr,target);
    }
}

//Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. If there is no non-repeating character, return '$'.
class Solution {
    public char nonRepeatingChar(String s) {
        // code he(re
       int n=s.length();
        for(int i=0;i<n;i++){
          char ch=s.charAt(i);
          if(s.indexOf(ch)==s.lastIndexOf(ch)){
              return ch;
          }
        }
     return '$';
    }
    public static void main(String args[]){
        String s="JyotiJKS";
        Solution obj=new Solution();
        obj.nonRepeatingChar(s);
    }
}

//Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
//Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length())
        return false;
        int freq[]=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s1="Jyoti";
        String s2="Iotyj";
        Solution obj=new Solution();
        obj.areAnagrams(s1,s2);
    }
}
