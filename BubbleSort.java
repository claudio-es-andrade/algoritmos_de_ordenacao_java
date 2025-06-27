/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

public class BubbleSort {
  
    public static void main(String[] args) {
        int[] vetor = new int[20];
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }
        
        System.out.println("Lista Desordenada");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        
        // Bubble Sort
        bubbleSort(vetor);
        
        System.out.println("\n\nLista Ordenada com Bubble Sort");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
    
    private static void bubbleSort(int[] vetor){
    
        for(int i = 0 ; i < (vetor.length - 1); i++){
            for(int j = i + 1 ; j < vetor.length ; j++){
                if (vetor[i] > vetor[j] ){
                    int aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;    
                }
            }
        }
        
    }
}
