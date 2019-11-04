package cn.jmjy.day05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 12, 23, 88, 128, 666 };
        System.out.println(binarySearch(arr, 12));
        System.out.println(binarySearch(arr, 128));
        System.out.println(binarySearch(arr, 100));
    }


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







    public static void compareSort() {
        Random r = new Random();
        int arrLength = 100000;
        int arr[] = new int[arrLength];
        int arr1[] = new int[arrLength];
        int arr2[] = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = r.nextInt(arrLength);
            arr1[i] = arr[i];
            arr2[i] = arr[i];
        }
        //冒泡排序
        long start = System.currentTimeMillis();
        bubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序所花的时间："+(end-start));

        //选择排序
        start = System.currentTimeMillis();
        selectionSort(arr1);
        end=System.currentTimeMillis();
        System.out.println("选择排序所花的时间："+(end-start));
        //系统排序
        start = System.currentTimeMillis();
        Arrays.sort(arr2);
        end=System.currentTimeMillis();
        System.out.println("系统排序所花的时间："+(end-start));
    }

    private static void test10() {
        int [] data={666,8,88,23,12,98};
        System.out.println(Arrays.toString(data));
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
        selectionSort(data);
    }

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


    private static void test9() {
        int [] data={666,8,88,23,12,98};
        System.out.println("交换前：");
        System.out.println(Arrays.toString(data));
        bubbleSort(data);
        System.out.println("交换后：");
        System.out.println(Arrays.toString(data));
    }

    private static void bubbleSort(int[] data) {
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


    private static void test8() {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入学生个数");
        int sNum=input.nextInt();
        System.out.println("请输课程数");
        int cNum=input.nextInt();
        int[][] arr=new int[sNum][cNum];
        for (int i = 0; i < sNum; i++) {
            for (int j = 0; j < cNum; j++) {
                System.out.println("请输入该生的第"+(i+1)+"个学生第"+(j+1)+"门功课成绩");
                arr[i][j]=input.nextInt();
            }
        }
        //总分
        sum(arr);
        //平均分
        avg(arr,cNum);
        //最高分
        max(arr);
        //最低分
        min(arr);

    }

    private static void min(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min=arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<min) {
                    min=arr[i][j];
                }
            }
            System.out.println("您输入的第"+(i+1)+"个学生的最低分min="+min);
        }
    }


    private static void max(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max=arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max) {
                    max=arr[i][j];
                }
            }
            System.out.println("您输入的第"+(i+1)+"个学生的最高分max="+max);
        }
    }

    private static void avg(int[][] arr, int cNum) {
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            int avg=sum/cNum;
            System.out.println("您输入的第"+(i+1)+"个学生的平均分avg="+avg);
        }
    }

    private static void sum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            System.out.println("您输入的第"+(i+1)+"个学生的总分sum="+sum);
        }
    }

    private static void test7() {
        int [][] arr= {{1,2,3,4,5},{1,2,3},{1,2,3,4,5}};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("二维数组的和："+sum);
    }

    private static void test6() {

        int [ ][ ] arr={{1,2,3,4,5},{1,2,3},{1,2,3,4,5}};

        int [ ][ ] arr1=new int [6 ][3];

    }

    private static void test5() {
        int[] scores = new int[3]; //成绩数组
        Scanner input = new Scanner(System.in);
        System.out.println("请输入3位学员的成绩：");
        for(int i = 0; i < scores.length; i++){
            scores[i] = input.nextInt();
        }
        Arrays.sort(scores);
        System.out.print("学员成绩按倒序序排列：");
        for(int i = scores.length-1; i>=0; i--){
            System.out.print(scores[i] + " ");
        }
    }

    private static void test4() {
        int[] scores = new int[6]; //成绩数组
        Scanner input = new Scanner(System.in);
        System.out.println("请输入6位学员的成绩：");
        for(int i = 0; i < scores.length; i++){
            scores[i] = input.nextInt();
        }
        Arrays.sort(scores);
        System.out.print("学员成绩按升序排列：");
        for(int i = 0; i < scores.length; i++){
            System.out.print(scores[i] + " ");
        }
    }

    private static void test3() {
        int a[]= {8,4,2,1,168,188,88};
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("第"+i+"值:"+a[i]+";");
            sum=sum+a[i];
        }
        System.out.println();
        System.out.println("所有数值的和："+sum);
        Scanner input=new Scanner(System.in);
        System.out.print("键盘中任意输入一个数据: ");
        int num=input.nextInt();
        boolean isRight=false;
        for (int i = 0; i < a.length; i++) {
            if(num==a[i]) {//判断数列中是否包含此数
                isRight=true;
                break;
            }
        }
        if(isRight) {
            System.out.println("恭喜你中奖");
        }else {
            System.out.println("没有中奖");
        }

    }

    private static void test2() {
        Scanner input=new Scanner(System.in);
        int scores[]=new int[5];
        int sum=0;// 总结成绩
        for(int i=0;i<scores.length;i++) {
            System.out.print("请输入5门功课中的第"+(i+1)+"门课的成绩：");
            scores[i]=input.nextInt();
            sum=sum+scores[i];
        }
        int avg=sum/scores.length;// 平均分
        System.out.println("小黑结业考试的平均分："+avg);
    }





    public static void test1() {
        int [] a={1,2,3};
        int [] a2=new int [] {1,2,3};

        int [] a1=new int[3];
        a1[0]=1;
        a1[1]=2;
        a1[2]=3;
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }
        System.out.println(a1[3]);


        //数组的声明
        int [] arr=new int[3]; //int 默认值0
        int arr1 []=new int[3];
        byte [] brr=new byte[3];
        long [] lrr=new long[3];
    }
}
