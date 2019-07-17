class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[]nums3=new int[m+n];
      int cur=0;
      int p=0;
      int q=0;
      while(p<m&&n>q){
        if(nums1[p]>nums2[q]){
          nums3[cur++]=nums2[q++];
        }
        else{
          nums3[cur++]=nums1[p++];
        }
      }
      while(p<m){
        nums3[cur++]=nums1[p++];
      }
       while(q<n){
        nums3[cur++]=nums2[q++];
      }
      cur=0;
      while(cur<m+n){
        nums1[cur]=nums3[cur++];
      }
    }
}