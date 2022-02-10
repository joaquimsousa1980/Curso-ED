package PesquisaLinearBinaria;

import java.util.Scanner;

/**
 *
 * @author Utilizador
 */
public class PesquisaLinear {

    public static void main(String[] args) {
        int[] vetor = new int[8];
        //Prenchimento aleatorio 
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);
        }

        System.out.println("Qual o número que pretende procurar?");
        Scanner leitor = new Scanner(System.in);
        int procurado = leitor.nextInt();

        boolean encontrou = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == procurado) {
                encontrou = true;
                break;
            }
        }
        if (encontrou) {
            System.out.println("Encontrou");
        } else {
            System.out.println("Não encontrou");
        }
    }

}
