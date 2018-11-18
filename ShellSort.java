
package trabalhoed2;

public class ShellSort {
    
    public int[] sort ( int [] v ){  
         int i , j , h = 1, value ;
         do {
            h = 3 * h + 1;//calula o valor do h
         } while ( h < v.length );
         do {
            h = h / 3;
            for ( i = h; i < v.length; i++) {
               value = v [ i ];
               j = i - h;
               while (j >= 0 && value < v [ j ]) {
                  v [ j + h ] = v [ j ];
                  j = j - h;
               }
               v [ j + h ] = value;
            }
        } while ( h > 1 );
        return v;
    }
}
