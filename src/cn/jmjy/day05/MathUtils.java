package cn.jmjy.day05;

/**
 * @author Ciaohi
 * @date 2019/11/6 上午9:21
 */
public class MathUtils {
    //冒泡
    public static void bubbleSort(int[] data) {
        for(int x=0;x<data.length-1;x++) {
            for (int i = 0; i < data.length-1-x; i++) {
                if(data[i]>data[i+1]) {
                    int temp=data[i];
                    data[i]=data[i+1];
                    data[i+1]=temp;
                }
            }
        }
    }
    //选择
    private static void selectionSort(int[] data) {
        for (int x = 0; x < data.length-1; x++) {
            int min=x;
            for (int i = min+1; i < data.length; i++) {
                if(data[i]<data[min]) {
                    min=i;
                }
            }
            int temp=data[x];
            data[x]=data[min];
            data[min]=temp;
        }
    }
    //二分查找
    public static int binarySearch(int[] arr, int key) {
        int from = 0;
        int to = arr.length-1;
        int mid = (to-from) / 2;
        while (from <= to) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                to = mid-1;
                mid = (from + to) / 2;
            } else {
                from = mid + 1;
                mid = (from + to) / 2;
            }
        }
        return-1;
    }
}
