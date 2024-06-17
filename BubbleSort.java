public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {24, 69, 80, 57, 13};
        int arrNew = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[i + 1]){
                arrNew = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = arrNew;
            }
            }
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
        }
    }
}
