package coder;

/*一些自己编写的可重复利用代码*/
public class PersonalUtilizeCode {
    //冒泡排序
    public static void bubbleSort(int []arr) {
        int n = arr.length;
        int temp;
        int flag;
        for (int i = n - 1; i >= 0; --i) {
            flag = 0;
            for (int j = 0; j < i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }
    }


}
