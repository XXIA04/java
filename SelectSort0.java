public class SelectSort0 {
    public static void main(String[] args) {
        int[] arr = {63, 4, 24, 1, 3, 15};
        int[] arrNew = new int[arr.length];
        int max = 0;
        int maxIndex = 0;
        for(int n = 0,j = arrNew.length - 1;n < arr.length;n++){
            for(int i = 0;i < arr.length;i++){
                if(arr[i] > max){
                    max =arr[i]; 
                    maxIndex = i;          
                }
            }
            arr[maxIndex] = 0;
            arrNew[j] = max;
            j--;
            max = 0;
        }
        arr = arrNew;
        for(int j = 0;j < arrNew.length;j++){
            System.out.print(arrNew[j] + " ");
        }
        System.out.println();
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //检查max是否重新置0 System.out.println(max);
        //检查最小值的位置System.out.println(maxIndex);
        
    }
}
