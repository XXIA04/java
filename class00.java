public class class00 {
   public static void main(String[] args) {
    int [][] map ={{1, 5, 6, 9},{8, 1, 9}, {4, 9, 1, 10}};
    Preson p = new Preson();
    //启用两数求和
    int returnsum = p.getsum(20,30);
    System.out.println(returnsum);
    //启用二维数组的遍历
    p.printarr(map);
   } 
}

    class Preson{//两个数求和调用方法
    public int getsum(int num1,int num2){
        int sum = num1 + num2;
        return sum;
        }//二维数组遍历方法
        public void printarr(int [][] map){
            for(int i = 0;i < map.length;i++){
                for(int j = 0;j < map[i].length;j++){
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }
    }