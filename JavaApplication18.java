
package javaapplication18;

/**
 *
 * @author yazid kareem
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            int pk[][]=new int[3][8]; 


        
        pk[0][0]=88;
        pk[0][1]=90;
        pk[0][2]=98;
        pk[0][3]=94;
        pk[0][4]=98;
        pk[0][5]=90;
        pk[0][6]=90;
        pk[0][7]=96;
        
        pk[1][0]=80;
        pk[1][1]=90;
        pk[1][2]=70;
        pk[1][3]=90;
        pk[1][4]=95;
        pk[1][5]=85;
        pk[1][6]=88;
        pk[1][7]=93;
        
         pk[2][0]=80;
        pk[2][1]=90;
        pk[2][2]=95;
        pk[2][3]=90;
        pk[2][4]=95;
        pk[2][5]=85;
        pk[2][6]=88;
        pk[2][7]=93;
       int x = 0; 
        for( int a=0  ; a<pk[0].length   ; a++   ){
            
           x= x+pk[0][a]; 
            
        }System.out.println("معدل الطالب الأول  :"+x/pk[0].length);
        
        int y =0;
            for( int b=0  ; b<pk[1].length   ; b++   ){
            
           y= y+pk[1][b]; 
            
        }System.out.println("معدل الطالب الثاني  :"+y/pk[1].length);
        
         int z =0;
            for( int c=0  ; c<pk[2].length   ; c++   ){
            
           z= z+pk[2][c]; 
            
        }System.out.println("معدل الطالب الثالث  :"+z/pk[2].length);
        }
   
    }
    

