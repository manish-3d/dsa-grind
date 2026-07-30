class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length-1;
        int i = m-1;
        int j = n-1;
        while(i >=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[len] = nums1[i];
                len--;
                i--;
            }else if(nums2[j]>=nums1[i]){
                nums1[len] = nums2[j];
                len--;
                j--;
            }
        }
        while(j>=0){
            nums1[len] = nums2[j];
            j--;
            len--;
        }
       
    }
}