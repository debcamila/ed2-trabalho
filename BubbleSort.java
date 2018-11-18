
package trabalhoed2;

public class BubbleSort {
//    pego o 1 par e assim por adiante
//    se nao tiver ordenado, ordeno. Se sim vou para o prox par
    
    public int []sort(int []v){
        int fim = v.length - 2;
        int pos = 0;
        boolean troca = true;
        int chave;
        int i;
        
        while(troca){
            troca = false;
            for(i = 0; i <= fim; i++){
                if(v[i] > v[i+1]){
                    chave = v[i];
                    v[i] = v[i+1];
                    v[i+1] = chave;
                    pos = i;
                    troca = true;
                }
            }
            fim = pos - 1;
        }
        return v;
    }
}
