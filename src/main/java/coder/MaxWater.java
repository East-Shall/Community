package coder;


public class MaxWater {//牛客网接雨水问题
    /**
     * max water
     * @param arr int整型一维数组 the array
     * @return long长整型
     */
    public long maxWater (int[] arr) {
        // write code here
       /*找到当前柱子的左右侧最高柱子中的极小值，这个值若大于当前柱子高度，那么相减即可得到当前的水面高度*/
        /*设置两个指针，从左右两个方向去标记当前的最大值边限，用一个遍历指针去扫描数组当中的柱子值，
        边限的较小值那一侧向反方向进行遍历。*/
        int left=0,right=0;
        int i=-1;
        int j= arr.length;
        long result=0;//用来作为结果输出
        while(i+1!=j){//循环直至所有的柱子的水量均被计算完毕
            if(left<=right){
                ++i;
                if(arr[i]<=left)//有高度差就有水积累
                    result=result+left-arr[i];
                else//高于左侧水平线，此时更新水平线高度
                    left=arr[i];
            }
            else{
                --j;
                if(arr[j]<=right)
                    result=result+right-arr[j];
                else
                    right=arr[j];
            }
        }
        return result;
    }
}
