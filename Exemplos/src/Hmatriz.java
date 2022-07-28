public class Hmatriz {
    public static void main(String[] args) {
        /*
         * Legenda: 
         * XX - Valor Nulo, não pertence a estrutura de dados árvore demonstrada.
         * BP - Branch primária.
         * BS - Branch Secundária.
         * BT - Branch Terciária.
         * LP - Leaf Primário.
         * LS - Leaf Secundária.
         * LT - Leaf Terciária.
        */
        
		//Vetor criado a fim de demonstar como está distribuída a árvore de estrutura de dados
        String[] vetor = {"[XX]", "[BP]", "[XX]", "[XX]", "[LP]", "[XX]", "[BS]", "[XX]", "[XX]", "[LS]", "[BT]", "[LS]", "[XX]", "[LT]", "[XX]", "[LT]"};
		int contador = 0;
		String matriz[][] = new String[4][4];

		for (int col = 0; col < matriz.length; col++) {
			for (int lin = 0; lin < matriz.length; lin++) {
				matriz[lin][col] = vetor[contador];
				contador++;
			}
		}

		//Exibindo Valores do Vetor Demonstração
		for (int col = 0; col < matriz.length; col++) {
			for (int lin = 0; lin < matriz.length; lin++) {
				System.out.print(matriz[lin][col] + "\t");
			}
			System.out.println("");
		}

		System.out.println(" ");

		//Vetor criado para a contenção de dados e chamadas via console
        String[] vetor_informacoes = {"Valor Nulo - Obrserve a disposição da árvore de estrutura de dados e informe uma posição que contenha dados!", 
		"Branch primária: Branch original, primeira da estrutura e possui posição 1", 
		"Valor Nulo - Obrserve a disposição da árvore de estrutura de dados e informe uma posição que contenha dados!", 
		"Valor Nulo - Obrserve a disposição da árvore de estrutura de dados e informe uma posição que contenha dados!", 
		"Leaf primário: primeiro leaf, fruto da branch primária, linha 2 e possui posição 4", 
		"Valor Nulo - Obrserve a disposição da árvore de estrutura de dados e informe uma posição que contenha dados!", 
		"Branch secundária: Branch filha, segunda da estrutura e possui posição 6", 
		"Valor Nulo - Obrserve a disposição da árvore de estrutura de dados e informe uma posição que contenha dados!", 
		"Valor Nulo - Obrserve a disposição da árvore de estrutura de dados e informe uma posição que contenha dados!", 
		"Leaf secundário: segundo leaf, fruto da branch secundária, linha 3 e possui posição 9", 
		"Branch terciária: Branch neta, terceira da estrutura e possui posição 10", 
		"Leaf secundário: segundo leaf, fruto da branch secundária, linha 3 e possui posição 11", 
		"Valor Nulo - Obrserve a disposição da árvore de estrutura de dados e informe uma posição que contenha dados!", 
		"Leaf terciário: terceira leaf, fruto da branch terciária, linha 4 e possui posição 13", 
		"Valor Nulo - Obrserve a disposição da árvore de estrutura de dados e informe uma posição que contenha dados!", 
		"Leaf terciário: terceira leaf, fruto da branch terciária, linha 4 e possui posição 15"};
		int contador2 = 0;
		String matriz2[][] = new String[4][4];

		for (int col2 = 0; col2 < matriz2.length; col2++) {
			for (int lin2 = 0; lin2 < matriz2.length; lin2++) {
				matriz2[lin2][col2] = vetor_informacoes[contador2];
				contador2++;
			}
		}

		System.out.println(vetor_informacoes[7]);
		

		System.out.println(" ");
    }
}

//Matriz em Java se define como uma array, no mínimo, bidimensional. Dito isso, aqui consta um exemplo de uma array bidimensional simples.