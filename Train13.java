public class Train13 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 9 ; i++){
            for(int j = 1 ; j <= i ; j++){
                int sum = j * i;
                System.out.print(j+"*"+i+"="+sum+"\t");
                if(i==j){
                    System.out.println();
                }
            }
        }
    }
}
