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
public class NewMain {

    public static void main(String[] args) {
        int vetor[] = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);
        }

        System.out.println("Qual o numero que pretende pesquisar?");
        Scanner leitor = new Scanner(System.in);
        int procurado = leitor.nextInt();
        int i;
        boolean encontrado = false;
        for (i=0; i < vetor.length; i++) {
            if (vetor[i] == procurado) {
                encontrado = true;
                break;
            }
            
        }
        if (encontrado) {
            System.out.println("Encontrou na posição: ["+i+"]");
        }else{
            System.out.println("Não encontrou");
        }
    }

}
