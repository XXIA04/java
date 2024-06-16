//向数组存入五个学生的成绩,并输出五个人的成绩;2024.6.16
import java.util.Scanner;
public class Array01 {
    public static void main(String[] args) {
        double scores[] = new double[5];
         Scanner myScanner = new Scanner(System.in);
        for(int i = 0; i <
         scores.length; i++){
            System.out.println("请输入第" + (i + 1 )+"个学生的成绩:");
             scores[i] = myScanner.nextDouble();
        }
        for(int i = 0; i < scores.length; i++){
            System.out.println("第" + (i + 1 )+"个学生的成绩:" + scores[i]);
        }
        myScanner.close();
    }
}
