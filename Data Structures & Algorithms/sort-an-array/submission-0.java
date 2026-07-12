class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    private void mergeSort(int[] arr,int left,int right){
        int mid=left+(right-left)/2;
       if(left<right){
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
        }
    }

    private void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int n=right-left+1;
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i]=arr[left+i];
        }
        for(int i=0;i<n2;i++){
            arr2[i]=arr[mid+i+1];
        }

        //merge
        int i=0,j=0,k=left;
       while(i<n1 && j<n2){
        if(arr1[i]<arr2[j]){
            arr[k]=arr1[i];
            i++;
        }
        else{
            arr[k]=arr2[j];
            j++;
        }
        k++;
       }

       while(i<n1){
        arr[k]=arr1[i];
        k++;
        i++;
       }
         while(j<n2){
        arr[k]=arr2[j];
        k++;
        j++;
       }
    }
}