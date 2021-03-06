/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PesquisaLinearBinaria;

import java.util.Scanner;

/**
 *
 * @author Utilizador
 */
public class PesquisaBinaria {

    public static void main(String[] args) {
        int vetor[] = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            System.out.println(vetor[i]);
        }

        System.out.println("Qual o numero procurado?");
        Scanner leitor = new Scanner(System.in);
        int procurado = leitor.nextInt();

        boolean encontrou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            if (vetor[meio] == procurado) {
                encontrou = true;
                break;
            } else if (vetor[meio] < procurado) {
                inicio = meio + 1;
            }else{//só pode ser maior
                fim = meio - 1;
            }
        }
        if(encontrou){
            System.out.println("Encontrou");
        }else{
            System.out.println("Não encontrou");
        }
    }

}
