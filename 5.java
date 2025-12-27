//Given a matrix mat[][] of size n*n, where each row and column is sorted in non-decreasing order. Find the kth smallest element in the matrix.
import java.util.*;
class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int arr[]=new int[n*m];
        int smallest=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                arr[smallest++]=mat[i][j];
            }
        }
        Arrays.sort(arr);
       return arr[k-1];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int k=sc.nextInt();
        Solution obj=new Solution();
        obj.kthSmallest(mat,k);
    }
}

//You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxEnding=arr[0];
        int maxFar=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(arr[i], maxEnding+arr[i]);
            maxFar=Math.max(maxFar,maxEnding);
        }
        return maxFar;
    }
    public static void main(String args[]){
        int arr[]={4,7,6,2,-4,2-8,6,9};
        Solution obj=new Solution();
        obj.maxSubarraySum(arr);
    }
}


//Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[]
class Solution {
    int maxProduct(int[] arr) {
        // code here
        int maxEnd=arr[0];
        int minEnd=arr[0];
        int maxFar=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
            int temp=maxEnd;
            maxEnd=minEnd;
            minEnd=temp;
           }
        maxEnd=Math.max(arr[i],maxEnd*arr[i]);
        minEnd=Math.min(arr[i],minEnd*arr[i]);
        maxFar=Math.max(maxFar,maxEnd);
        }
        return maxFar;
    }
    public static void main(String args[]){
        int arr[]={5,8,5,2,6,4,9,7};
        Solution obj=new Solution();
        obj.maxProduct(arr);
    }
}
