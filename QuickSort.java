
package trabalhoed2;

public class QuickSort {
//    escolho o pivo
//    separo os elementos menores que o pivo para a esquerda
//    separo os elementos maiores que o pivo para a direita
//    recursivamente, fazer isso para os elementos a esquerda e direita do pivo
    
    public static int separar(int[] v, int inicio, int fim) {
        int pivo = v[inicio];
        int i = inicio + 1;
        int f = fim;
        
        while(i<= f){
            if(v[i] <= pivo){
                i++;
            }
            else if(pivo < v[f]){
                f--;
            }
            else{
                int troca = v[i];
                v[i] = v[f];
                v[f] = troca;
                i++;
                f--;
            }
        }
        v[inicio] = v[f];
        v[f] = pivo;
        return f;
    }
    
    public static void quickSort(int []v, int inicio, int fim){
        if(inicio < fim){
            int posicaoPivo = separar(v, inicio, fim);
            quickSort(v, inicio, posicaoPivo - 1);
            quickSort(v, posicaoPivo + 1, fim);
        }
    }
    
    public int[] sort(int[] v) {
        quickSort(v, 0, v.length-1);
        return v;
    }
}
