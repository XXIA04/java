//冒泡排序
public class Array06 {
    public static void main(String[] args) {
        int arr[] = {24, 69, 80, 57, 13};
        for(int j = 0;j < arr.length - 1; j++){
         int temp = 0;
         for(int i = 0;i < arr.length - 1 -j; i++){
            if(arr[i] >arr[i + 1]){
                temp = arr[i];
                arr[i] =arr[i + 1];
                arr[i + 1] =temp;
            }
         }
         for(int m = 0;m < arr.length; m++){
            System.out.print(arr[m]+"\t");
            }
            System.out.println();
        }  

    }
    
}
