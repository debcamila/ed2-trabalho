
package trabalhoed2;

public class SelectionSort {
//    encontro o menor elemento do vetor e troco com a 1 posicao e assim vai
    
    public int[] sort(int []v){
        int i, j, menor;
        int aux;
        int fim = v.length - 1;
        
        for(i = 0; i < fim; i++){
            menor = i;
            for(j = i + 1; j <= fim; j++){//faz a busca pelo menor elemento
                if(v[j] < v[menor])
                    menor = j;//o menor passa a ser o j
            }
            aux = v[i];//troco o i com o menor
            v[i] = v[menor];
            v[menor] = aux;
        }
        return v;
    }
}
