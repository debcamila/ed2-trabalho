
package trabalhoed2;

public class TrabalhoEd2 {

   public static void main(String[] args) {
        InsertionSort direta = new InsertionSort();
        ArraySort as = new ArraySort();//1
        HeapSort hs = new HeapSort();//2
        QuickSort qs = new QuickSort();//3
        ShellSort ss = new ShellSort();//4
        SelectionSort selection = new SelectionSort();//5
        Merge ms = new Merge();//6
        BubbleSort bs = new BubbleSort();//7
        Randomizador ge = new Randomizador();
        int [] tamanhos = {1000, 5000, 10000, 50000, 100000, 500000, 1000000, 5000000, 10000000, 50000000, 100000000, 500000000, 1000000000};        
        int aux [];

        //Execução ArraySort
        System.out.println("ArraySort Ordenado");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 1);  
            long startTime = System.nanoTime();
            aux = as.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        //Execução ArraySort
        System.out.println("ArraySort Inverso");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 2);   
            long startTime = System.nanoTime();
            aux = as.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        
        System.out.println("ArraySort Aleatorio");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 3);   
            long startTime = System.nanoTime();
            aux = as.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        
        
        //Execução Heap
        System.out.println("Heap Ordenado");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 1);   
            long startTime = System.nanoTime();
            hs.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        //Execução heap
        System.out.println("Heap Inverso");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 2);   
            long startTime = System.nanoTime();
            hs.heapsort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        
        System.out.println("Heap Aleatorio");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 3);   
            long startTime = System.nanoTime();
            hs.heapsort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        
        //Execução Quick
        System.out.println("Quick Ordenado");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 1);
            long startTime = System.nanoTime();
            qs.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        //Execução Quick
        System.out.println("Quick Inverso");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 2);
            long startTime = System.nanoTime();
            qs.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }

        System.out.println("Quick Aleatorio");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 3);
            long startTime = System.nanoTime();
            qs.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        
        //Execução Shell
        System.out.println("Shell Ordenado");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 1);
            long startTime = System.nanoTime();
            ss.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        //Execução Shell
        System.out.println("Shell Inverso");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 2);
            long startTime = System.nanoTime();
            ss.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }

        System.out.println("Shell Aleatorio");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 3);
            long startTime = System.nanoTime();
            ss.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        
        //Execução Selection
        System.out.println("Selection Ordenado");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 1);
            long startTime = System.nanoTime();
            selection.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        //Execução Selection
        System.out.println("Selection Inverso");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 2);
            long startTime = System.nanoTime();
            selection.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }

        System.out.println("Selection Aleatorio");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 3);
            long startTime = System.nanoTime();
            selection.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        
        //Execução Merge
        System.out.println("Merge Ordenado");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 1);
            long startTime = System.nanoTime();
            ms.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }

        //Execução Merge
        System.out.println("Merge Inverso");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 2);
            long startTime = System.nanoTime();
            ms.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
           
        System.out.println("Merge Aleatorio");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 3);
            long startTime = System.nanoTime();
            ms.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        
        //Execução Bubble
        System.out.println("Bubble Ordenado");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 1);
            long startTime = System.nanoTime();
            bs.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        //Execução Bubble
        System.out.println("Bubble Inverso");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 2);
            long startTime = System.nanoTime();
            bs.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }

        //Execução Direta
        System.out.println("Direta Ordenado");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 1);
            long startTime = System.nanoTime();
            direta.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        //Execução Direta
        System.out.println("Direta Inverso");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 2);
            long startTime = System.nanoTime();
            direta.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }

        
        System.out.println("Direta Aleatorio");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 3);
            long startTime = System.nanoTime();
            direta.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
        
        System.out.println("Bubble Aleatorio");
        for(int t : tamanhos){
            int [] vetor = ge.gerarVetor(t, 3);
            long startTime = System.nanoTime();
            bs.sort(vetor);
            long stopTime = System.nanoTime();
            double tempo_em_ms;
            tempo_em_ms = (stopTime - startTime) / Math.pow(10, 6);
            System.out.println("Vetor de tamanho "+t+ "-> Tempo de execuçao em milissegundos: " + tempo_em_ms);
            System.gc();
        }
    }
    
}
