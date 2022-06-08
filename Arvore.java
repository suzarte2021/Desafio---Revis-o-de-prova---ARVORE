package Arvore;
import java.util.Scanner;
import java.util.Stack;

public class Arvore {
	
/*/Escreva um programa que leia 10 números, armazene-os em uma árvore e,
*  em seguida, liste apenas os números pares.
*  Pode utilizar qualquer caminhamento.	
 /*/
	public static void main(String[] args) {	
		Stack<Integer> pilhaPar = new Stack<Integer>(); //Stack é uma pilha para armazenar
		Scanner scanner = new Scanner(System.in); // Entrada de dados
		boolean exit = true;
		while(exit == true) { // Estrutura de condição

			System.out.println("Digite um número 0 para sair"); // 
			int num = scanner.nextInt();        //Recebe o dado colocado
			if(num == 0) { // Validando o Lop, para sair
				exit = false;
			} else {

				if(num % 2 == 0) { // Se o núemero for par
					System.out.println("");
					pilhaPar.push(num); // Inserção/Inserindo elemento
				
				}
			}
		}
		//Vamos verificar se a pilhaPar esta vazia
		System.out.println("Verificando se a lista da pilha Par esta vazia: " + pilhaPar.empty()); //Verificar se está vazia
		if( pilhaPar.empty()) { //
			System.out.println("A lista pilha Par esta vazia!!!");
		} else {
			System.out.println("A lista pilha Par tem dados!!!");
		}

		//Listando os numeros Pares
		System.out.println("Os números da lista Par são:"+ pilhaPar.size());
		 for (int i = 0; i < pilhaPar.size(); i++) {
				System.out.println(pilhaPar.get(i));
			}
		
			}
	}

	

