
package trabalhoed2;

public class InsertionSort {
    
    public int[] sort(int []v){
        int i, j;
        int chave;
        int fim = v.length - 1;
        
        for(i = 1; i <= fim; i++){
            chave = v[i];
            j = i - 1;
            
            while(j >= 0 && v[j] > chave){
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = chave;
        }
        return v;
    }
}
