//创建char类型的数组,存入A-Z,并输出;
public class Array02 {
    public static void main(String[] args) {
        char i[] = new char[26];
        
        for(int j = 0; j < i.length; j++){
            i[j] = (char)('A' + j);
        }
        for(int m = 0; m < i.length; m++){
            System.out.print(i[m] + " ");
        }
    }
    
}
