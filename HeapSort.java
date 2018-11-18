
package trabalhoed2;

public class HeapSort {
    
    public void heapsort(int []v){
        int n = v.length;
        
        for(int i = n / 2 - 1; i>= 0; i--)
            heapify(v, n, i);
        
        for(int i = n-1; i >= 0; i--){
            int temp = v[0];
            v[0] = v[i];
            v[i] = temp;
            
            heapify(v, i , 0);
        }        
    }
    
    public void heapify(int []v, int n, int i){
        int maior = i; //inicializa o maior como a raiz
        int esq = 2 * i + 1; // esquerda = 2*i+1
        int dir = 2 * i + 2; // direita = 2*i+2
        
        //se o filho da esquerda é maior do que a raiz
        if(esq < n && v[esq] > v[maior]){
            maior = esq;
        }
        
        //se o filho da direita é maior do que o maior
        if(dir < n && v[dir] > v[maior]){
            maior = dir;
        }
        
        //se o maior nao é a raiz
        if(maior != i){
            int swap = v[i];
            v[i] = v[maior];
            v[maior] = swap;
            
            //recursividade heapify a sub-arvore afetada
            heapify(v, n, maior);
        }      
    }
    
    public int []sort(int []v){
        heapsort(v);
        return v;
    }
    
     public String getName() {
        return "Heap Sort";
    }
}
