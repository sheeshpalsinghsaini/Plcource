package sorting;

public class SelectionSort {
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void selectionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int j=i;
            int k=i;
            for(;j<arr.length;j++){
                if(arr[j]<arr[k])
                    k=j;
            }
            swap(arr,k,i);
        }
    }
    public static void main(String[] args) {
        int []arr = {4,2,3,6,5,8,7,9,1};
        Print.print(arr);
        selectionSort(arr);
        Print.print(arr);

    }
}
