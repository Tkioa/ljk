package com.itheima;
//二维数组:华容道
public class ArrayDemo4 {
    public static void main(String[] args) {
        test(5,5);
    }
    public static void test(int m,int n){
        int [][] arr = new int[m][n];
        int num = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = num++;
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        //随机打乱
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int x = (int)(Math.random()*5);
                int y = (int)(Math.random()*5);
                int temp = arr[i][j];
                arr[i][j] = arr[x][y];
                arr[x][y] = temp;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
