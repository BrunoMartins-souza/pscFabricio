package Consultorio;

import java.util.Scanner;
import java.util.ArrayList;

public class Paciente {
	
	//variaveis da class criadas de modo privado.
	  private int idPaciente;
	  private String nomePaciente;
	  private String dataNascimento;
	  private String contato;
	  private String endereco;
	  
	  private static ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();
	  
	  //construtor padrão java
	  public Paciente(){
	  }
	  
	  //construtor criado
	  public Paciente(String nomePaciente, String dataNascimento, String contato, String endereco){
	    
	    this.nomePaciente = nomePaciente;
	    this.dataNascimento = dataNascimento;
	    this.contato = contato;
	    this.endereco = endereco;
	  }
	  
	  //bloco de cadastramento de paciente
	  public static void cadastrarPaciente(){
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Digite o nome do paciente: ");
	    String nomePaciente = input.nextLine(); 
	    System.out.print("Digite a data de nascimento do paciente: ");
	    String dataNascimento = input.nextLine();
	    System.out.print("Digite o telefone de contato do paciente: ");
	    String contato = input.nextLine();
	    System.out.print("Digite o endereço do paciente: ");
	    String endereco = input.nextLine();
	    
	    Paciente novoPaciente = new Paciente(nomePaciente, dataNascimento, contato, endereco); //adicionando os dados ao construtor criado
	    listaPacientes.add(novoPaciente);
	    
	    System.out.println("Paciente cadastrado com sucesso!");
	    
	    System.out.println(listaPacientes);
	    
	  }
}
