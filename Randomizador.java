
package trabalhoed2;

import java.util.Random;

public class Randomizador {
    
    public int []gerarVetor(int tam, int tipo){
        switch(tipo){
            case 1:
                return ordenado(tam);              
            case 2:
                return reverso(tam);
            case 3:
                return random(tam);
            default:
                System.out.println("Invalido.");
                throw new UnsupportedOperationException("Not supported yet.");
        }
    } 
    
    public static int[] random(int tam){
        int array[] = new int[tam];        
        Random r = new Random();
        
        for (int i = 0; i < tam; i++) {
            array[i] = r.nextInt(tam);
        }
        return array;
    }
    
    public static int[] ordenado(int tamanho){
        int array[] = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            array[i] = i;
        }
    return array;
    }
    
     public static int[] reverso(int tamanho){
        int array[] = new int[tamanho];
        
        int j = 0;
        for (int i = tamanho-1; i >= 0; i--) {
            array[j] = i;
            j++;
        }
    return array;
    }
    
    
    
     
}
