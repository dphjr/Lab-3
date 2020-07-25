package src;

public class Box {

 

   public static void main(String[] args){
       Box.printBox(5);

   }
   public static void printBox(int size){
       int i;
       
       i = size;
       int j;
       j = size;
       
       for(i = 1; i <= size; i++){
           for(j=1; j<=size; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
}