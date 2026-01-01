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
//You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.
class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<=0||arr[i]>n){
                arr[i]=n+1;
            }
        }
        for(int i=0;i<n;i++){
            int val=Math.abs(arr[i]);
            if(val>=1 && val<=n){
                if(arr[val-1]>0){
                    arr[val-1]=-arr[val-1];
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
    public static void main(String args[]){
        int arr[]={4,7,5,2,1,3,8,9};
        Solution obj=new Solution();
        obj.missingNumber(arr);
    }
}

//You are given a circular array arr[] of integers, find the maximum possible sum of a non-empty subarray. In a circular array, the subarray can start at the end and wrap around to the beginning. Return the maximum non-empty subarray sum, considering both non-wrapping and wrapping cases.
class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int n=arr.length;
        int sum=0;
        int maxEnd=arr[0], maxFar=arr[0];
        int minEnd=arr[0], minFar=arr[0];
        for(int i=0;i<n;i++){
            sum += arr[i];
             
             if(i>0){
                 maxEnd=Math.max(arr[i], maxEnd+arr[i]);
                 maxFar=Math.max(maxFar, maxEnd);
                 
                 minEnd=Math.min(arr[i],minEnd+arr[i]);
                 minFar=Math.min(minFar, minEnd);
             }
        }
        if(maxFar<0){
            return maxFar;
        }
        return Math.max(maxFar,sum-minFar);
    }
    public static void main(String args[]){
        int arr[]={56,87,32,15,89,65,81};
        Solution obj=new Solution();
        obj.maxCircularSum(arr);
    }
}

//Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.
class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int m=a.length;
        int n=b.length;
        int c[]=new int[m+n];
        int idx=0;
        for(int i=0;i<m;i++){
            c[idx++]=a[i];
        }
        for(int i=0;i<n;i++){
            c[idx++]=b[i];
        }
      Arrays.sort(c);
      return c[k-1];
    }
    public static void main(String args[]){
        int a[]={1,7,9,5,4,2};
        int b[]={8,3,6,0};
        int k=3;
        Solution obj=new Solution();
        obj.kthElement(a,b,k);
        
    }
}
//Given an array arr[] of distinct elements, which was initially sorted in ascending order but then rotated at some unknown pivot, the task is to find the index of a target key.  If the key is not present in the array, return -1.
class Solution {
    int search(int[] arr, int key) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
            return i;
        }}
      return -1;
    }
    public static void main(String args[]){
        int arr[]={7,9,5,3,1,8,6,4,2};
        int key=3;
        Solution obj=new Solution();
        obj.search(arr,key);
    }
}

//You are given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist).

class Solution {
    public int peakElement(int[] arr) {
        // code here
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String args[]){
        int arr[]={3,5,7,8,4,9};
        Solution obj=new Solution();
        obj.peakElement(arr);
    }
}
