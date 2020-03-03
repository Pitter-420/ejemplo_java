
package ejemplo.matriz;

public class EjemploMatriz {

    
    public static void main(String[] args) {
        // TODO code application logic here
       String [][] autos = new String[3][2];
       autos [0][0] = "toyota";
       autos [0][1] = "honda";
       
       autos [1][0] = "nissan";
       autos [1][1] = "acura";
       
       autos [2][0] = "subara"; 
       autos [2][1] ="zusuki";
       
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 2; j++) {
                System.out.print(autos [i][j]+" ");
            }
        }
        System.out.println();
       
       
       
       int[][] edad={{1,2,3,4,5},
                     {1,55,26,89,78},
                     {78,8,9,5,6},
                     {7,89,96,65,4},
                     {78,98,6,5,2,6}};
        
    for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(edad[i][j]+" ");
            }
        }
        System.out.println();
    
    
    }
    
}
