package BT_051223;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Fibonacci_Array(10);
    }
    public static void Max_matrix(int[][] arr,int m,int n){
        int max = arr[0][0];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (arr[i][j]>max) {
                    max = arr[i][j];
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (arr[i][j]==max) {
                    System.out.println(i+ "" +j);;
                }
            }
        }
    }

    public static void symmetry_Matrix(int[][] arr,int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == arr[j][i]){
                    count++;
                }
            }
        }
        if(count == n){
            System.out.println("symmetry matrix");

        } else {
            System.out.println("not symmetry matrix");
        }
    }

    public static void Fibonacci_Array(int n){
        int count = 2;
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        while (count<n) {
           arr[count] = arr[count-1] + arr[count-2]; 
           count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
