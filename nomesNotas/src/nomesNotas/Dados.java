package nomesNotas;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Dados {
	
	
	int qntPessoas;
	int qntProvas;
	
	String[] nomesAlunos;
	String[][] nomesNotasAlunos;
	
	

	void QuantidadeProvas(int qnt) {
		
		this.qntProvas = qnt;
		
	}
   
	
	
	void PassarQuantidaN(int qnt) {
		
		this.qntPessoas = qnt;
		
	}
	

	
	
	
	void Apresentacao() {
		
		
		 String numeroPessoas = JOptionPane.showInputDialog("Digite o numero de pessoas: ");
		 int numeroP = Integer.parseInt(numeroPessoas);
		 PassarQuantidaN(numeroP);
		 
		 String quantidadeNotas = JOptionPane.showInputDialog("Digite a quantidade de provas realizadas: ");
		 int quantidadeN = Integer.parseInt(quantidadeNotas);
		 QuantidadeProvas(quantidadeN);
		 
		 
		 
	}
	
/*	void Teste() {
	
		this.nomesAlunos = new String[this.qntPessoas];
		
	    System.out.println(nomesAlunos.length);
		
    }*/
	
	
	
	void Organizacao() {
		
		this.nomesAlunos = new String[this.qntPessoas];
		this.nomesNotasAlunos = new String [this.qntPessoas][this.qntProvas];
		
		for(int a = 0; a < nomesNotasAlunos.length; a++) {
			
			String nomes = JOptionPane.showInputDialog("Nome do " + (a+1) + "° aluno(a): " );
			
			nomesAlunos[a] = nomes;
			
			for(int n = 0; n < nomesNotasAlunos[a].length; n++) {
				
				String notas = JOptionPane.showInputDialog("Informe a " + (n+1) + "° nota da prova do aluno " +
                        nomesAlunos[a]);
				
				nomesNotasAlunos[a][n] = notas;
			}
	    }
		
	}
	
	
	
	

	void Resultados() {
		

    	for(int x=0; x < nomesNotasAlunos.length; x++) {
    		
    		System.out.println("\nAluno " + nomesAlunos[x]);
    		
    	
    	
       
    	for(int n=0; n < nomesNotasAlunos[x].length; n++) {
    		
    		System.out.println(nomesNotasAlunos[x][n]);
    		
    	}
    
    	}
	}
	
	
	
	
	

}
