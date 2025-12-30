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
