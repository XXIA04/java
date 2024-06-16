//动态给数组添加元数
import java.util.Scanner;
public class Array05 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int arr[] = {1, 2, 3};
        while (true){
        System.out.println("是否添加新的元数:y/n");
        char a = myScanner.next().charAt(0);
        if(a == 'y'){
            int arrNew[] = new int[arr.length + 1];
            for(int i = 0; i < arr.length; i++){
                arrNew[i] = arr[i];
            }
            System.out.println("请输入你要添加的元数:");
            int b = myScanner.nextInt();
            arrNew[arrNew.length - 1] = b;
            arr = arrNew;
            System.out.println();
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + "\t");
            }
        }else{
            break;
        }
        }
        myScanner.close();
    }
    
}
