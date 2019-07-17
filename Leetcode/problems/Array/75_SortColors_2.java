class Solution {
    public void sortColors(int[] nums) {
        quickSort7(nums,0,nums.length-1);
    }
  void quickSort7(int[]nums,int low,int high){
    //快排
    if(low<high){
      int part=partion1(nums,low,high);
      quickSort7(nums,low,part-1);
      quickSort7(nums,part+1,high);
    }
  }
  int partion1(int[] nums,int low,int high){
    int tem=nums[low];//基准
    while(low<high){
      //从后往前找小于tem的数
      while(low<high&&nums[high]>=tem)
        high--;
      if(low<high){
        nums[low]=nums[high];
        low++;
      }
      while(low<high&&nums[low]<=tem)
        low++;
      if(low<high){
        nums[high]=nums[low];
        high--;
      }
    }
       nums[low]=tem;
    return low;
  }
  void sort6(int[]nums){
    //希尔排序-小增量插入排序
    int d=nums.length;
    while(true){
      d=d/2;
      for(int x=0;x<d;x++){//组的个数
        for(int i=x+d;i<nums.length;i+=d){
          int tem=nums[i];
          int j=i-d;
          for(;j>=0&&nums[j]>tem;j-=d){
            nums[j+d]=nums[j];
          }
          nums[j+d]=tem;
        }
      }
      if(d==1)
        break;
    }
  }
    void sort5(int[] nums){
      //折半插入排序
      int len=nums.length;
      for(int i=1;i<len;i++){
        int left=0,right=i-1,mid=0,tem=nums[i];
        while(left<=right){
          mid=(left+right)/2;
          if(nums[mid]>nums[i]){
            right=mid-1;
          }else{
            left=mid+1;
          }       
        }
        for(int j=i-1;j>=right+1;j--){
          nums[j+1]=nums[j];
        }
        nums[right+1]=tem;
        }
    }
    void sort4(int []nums){
      //直接插入排序
      for(int i=1;i<nums.length;i++){
        int tem=nums[i];
        int j=i-1;
        for(;j>=0&&nums[j]>tem;j--){         
            nums[j+1]=nums[j];
        }
            nums[j+1]=tem;      
        }
      }
    
    void sort3(int[]nums){
      //堆排序
      int len=nums.length;
      buildHeap(nums,len);
      for(int i=len-1;i>0;i--){
        swap(nums,0,i);
        heapAdjust(nums,0,i);
      }
    }
    void buildHeap(int[]nums,int len){
      for(int i=(len-1)/2;i>=0;i--){
        heapAdjust(nums,i,len);
      }
    } 
    void heapAdjust(int []nums,int root,int len){
      int tem=nums[root];
      int child=2*root+1;
      while(child<len){
        //选出子节点较大的孩子节点
        if(child+1<len&&nums[child]<nums[child+1]){
          ++child;
        }
        //判断最大的孩子节点是否大于root节点
        if(nums[child]>nums[root]){
          nums[root]=nums[child];
          root=child;//根节点下移
          child=2*root+1;       
        }else{
          break;
        }
        nums[root]=tem;//根节点的值下移到孩子节点
         }
      
    } 
    void swap(int[]nums,int start,int last){
      int tem=nums[start];
      nums[start]=nums[last];
      nums[last]=tem;
    }
    void sort2(int[]nums){
      //简单选择排序
      for(int i=0;i<nums.length;i++){
        int tem=nums[i];
        int pos=i;//最小数所在的位置
        for(int j=i+1;j<nums.length;j++){
          if(nums[j]<tem){
            tem=nums[j];
            pos=j;
          }
        }
        nums[pos]=nums[i];
        nums[i]=tem;
      }
    }
    void sort1(int[]nums){
      //冒泡排序
      boolean flag=false;
      for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length-i-1;j++){
          if(nums[j]>nums[j+1]){
            int tem=nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=tem;
            flag=true;
          }
        }
        if(flag==false){
          break;
        }
      }
    }
}