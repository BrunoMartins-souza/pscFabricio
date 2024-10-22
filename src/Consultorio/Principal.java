package Consultorio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    
	    int opc;
	    
	    do{
	      System.out.println("MENU DE OPÇÕES:");
	      System.out.println(" 1 - Cadastro de Médico.");
	      System.out.println(" 2 - Cadastro de Paciente.");
	      System.out.println(" 3 - Agendamento.");
	      System.out.println(" 4 - Sair.");
	      System.out.print("Escolha uma opção: ");
	      opc = input.nextInt();
	      
	      switch(opc){
	        case 1:
	          Medico.mostrarMedico();
	          Medico.cadastrarMedico();
	          break;
	        case 2:
	          Paciente.cadastrarPaciente();
	          break;
	        case 3:
	          System.out.println("Realizar um agendamento.");
	          break;
	        case 4:
	          System.out.println("Saindo...");
	          break;
	        default:
	          System.out.println("Opção Inválida!");
	          break;
	      }
	    }while (opc != 4);
	}

}
