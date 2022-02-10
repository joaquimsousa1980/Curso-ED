/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosDeOrdenacaoVetores;

/**
 *
 * @author Utilizador
 */
public class BubbleSort {

    public static void main(String[] args) {
      int [] vetor = new int[10];
      
      for(int i = 0; i < vetor.length; i++){
          vetor[i] = (int) (Math.random() * vetor.length);
          System.out.println(vetor[i]);
      }
    }
    
}
