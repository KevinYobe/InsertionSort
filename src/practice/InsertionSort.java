package practice;

public class InsertionSort {
    public void sort(int[] A){
        for (int i=1;i<A.length;i++){
           int temp = A[i];
           int j = i-1;
           while (j>=0 && A[j]>temp){
                A[j+1]=A[j];
                j=j-1;
                A[j+1]=temp;
           }
        }
    }
}
