public class ForEach {
    public static void main(String[] args) {
     /*   int[] list={1,2,3,4};
        int sum=0;
        for (int i:list){
            sum+=i;

        }
       System.out.println(sum);

      */
      /*  String[] cars = {"bmv", "mercedes", "audi"};
        for (String i:cars){
            System.out.println(i);

        }

       */
        int[][] list = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        for (int i=0; i< list.length; i++){
            for (int k=0; k< list[i].length; k++){
                //System.out.println(list[i][k]);
            }
        }
        for (int[] row: list){
            for (int col: row){
                System.out.println(col);
            }
        }


    }
}
