
package trabalhoed2;

public class Merge {
//divido o vetor ao meio
//recursivamente ordeno a 1 metade do vetor
//recursivamente ordeno a 2 metado do vetor
//intercalo os dois sub-vetores para gerar um vetor ordenado
    
    
    public static int[] mergeSort(int []v, int inicio, int fim){
        int meio;
        
        if(inicio == fim){//tam = 1
            return v;
        }else{
            //encontra o meio
            meio = (inicio + fim) / 2;
            //ordena a primeira metade
            mergeSort(v, inicio, meio);
            mergeSort(v, meio+1, fim);
            //intercala
            merge(v, inicio, meio, fim);
        }
        return v;
    }
    
    public static void merge(int []v, int inicio, int meio, int fim){ 
        int primeiro = inicio; 
        int segundo = meio + 1; 
        int i = inicio; 

        int[]aux = new int[fim+1];

        while((primeiro <= meio) && (segundo <= fim)){
            //insere elemento do primeiro
            if(v[primeiro] <= v[segundo]){
                aux[i] = v[primeiro];
                primeiro++;
            }else{
                aux[i] = v[segundo];
                segundo++;
            }
            i++;
        }
        
        //sobrou elementos do segundo
        if(primeiro > meio){
            while(segundo <= fim){
                aux[i] = v[segundo];
                segundo++;
                i++;
            }
            //sobrou elementos do segundo
            if(primeiro > meio){
                while(segundo <= fim){
                    aux[i] = v[segundo];
                    segundo++;
                    i++;
                }
            //sobrou elementos do primeiro
            }else{
                while(primeiro <= meio){
                    aux[i] = v[primeiro];
                    primeiro++;
                    i++;
                }
            }
            //copia o vetor auxiliar no vetor principal
            for(i = inicio; i<= fim; i++){
                v[i] = aux[i];
            }
        }
    } 
  

    public int[] sort(int []v) { 
        return mergeSort(v, 0, v.length-1);
    }
    
    public String getName(){
        return "Merge sort";
    }
}
