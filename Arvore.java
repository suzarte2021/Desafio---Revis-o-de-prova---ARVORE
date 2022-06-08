package Arvore;
import java.util.Scanner;
import java.util.Stack;

public class Arvore {
	
/*/Escreva um programa que leia 10 n�meros, armazene-os em uma �rvore e,
*  em seguida, liste apenas os n�meros pares.
*  Pode utilizar qualquer caminhamento.	
 /*/
	public static void main(String[] args) {	
		Stack<Integer> pilhaPar = new Stack<Integer>(); //Stack � uma pilha para armazenar
		Scanner scanner = new Scanner(System.in); // Entrada de dados
		boolean exit = true;
		while(exit == true) { // Estrutura de condi��o

			System.out.println("Digite um n�mero 0 para sair"); // 
			int num = scanner.nextInt();        //Recebe o dado colocado
			if(num == 0) { // Validando o Lop, para sair
				exit = false;
			} else {

				if(num % 2 == 0) { // Se o n�emero for par
					System.out.println("Esse n�mero � Par");
					pilhaPar.push(num); // Inser��o/Inserindo elemento
				
				}
			}
		}
		//Vamos verificar se a pilhaPar esta vazia
		System.out.println("Verificando se a lista da pilha Par esta vazia: " + pilhaPar.empty()); //Verificar se est� vazia
		if( pilhaPar.empty()) { //
			System.out.println("A lista pilha Par esta vazia!!!");
		} else {
			System.out.println("A lista pilha Par tem dados!!!");
		}

		//Listando os numeros Pares
		System.out.println("Os n�meros da lista Par s�o:"+ pilhaPar.size());
		 for (int i = 0; i < pilhaPar.size(); i++) {
				System.out.println(pilhaPar.get(i));
			}
		
			}
	}

	

