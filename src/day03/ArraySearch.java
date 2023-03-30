package day03;

public class ArraySearch {
       static String[] foods = {"삼겹살", "족발", "피자", "햄버거"};

       public static int indeOf(String target){
           int index = -1;
//           String target = "햄버거";
           for (int i = 0; i < foods.length; i++) {
               if (target.equals(foods[i])) {
                   index = i;
                   break;
               }
           }
                return  index;
       }
    public static void main(String[] args) {


//        foods[0] = foods[1];

        foods[2] = "치킨";

        // 인덱스 탐색 알고리즘

        int index = indeOf("족발");
        System.out.println("찾은 인덱스 : " + index);




    }
}
