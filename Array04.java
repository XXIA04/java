//实现数组的倒序
public class Array04 {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55, 66};
        int arr1[] = new int[arr.length];
        for(int i = arr.length - 1;
        i >= 0;i--){
            arr1[(arr.length - 1) - i] = arr[i];
        }
        /*for(int i = 0; i < arr.length; i++){
            arr[i] = arr1[i];
        }*/
        arr =arr1;
        for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] +"\t");
        }
    }
    
}
