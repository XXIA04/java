//要求:升序数组插入一个数后依旧是升序
import java.util.Scanner;
public class Array07 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int arr[] = {10, 12, 45, 90};
        int arrNew[] =  new int[arr.length + 1];
        System.out.println("输入需要添加的数:");
        //将输入的值,置的0位
        int number = myScanner.nextInt();
        arrNew[0] = number;
        //将原数组排入新数组
         for(int i = 0;i < arr.length;i++){
            arrNew[i+1] = arr[i];
         }
         //套用冒泡排序内层循环
        int temp = 0;
         for(int i = 0;i < arrNew.length - 1; i++){
            if(arrNew[i] > arrNew[i + 1]){
                temp = arrNew[i];
                arrNew[i] = arrNew[i + 1];
                arrNew[i + 1] = temp;           
            }
        }
        //输出
        for(int j = 0;j < arrNew.length;j++){
            System.out.print(arrNew[j] +"\t");
         }
         myScanner.close();
    }
}
