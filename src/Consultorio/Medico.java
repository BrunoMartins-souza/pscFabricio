package Consultorio;

import java.util.Scanner;
import java.util.ArrayList;

public class Medico {
	
	  private int idMedico;
	  private String nomeMedico;
	  private String crm;
	  private String especialidade;
	  private String telefone;
	  private String periodoAtendimento;
	  
	  private static ArrayList<Medico> listaMedicos = new ArrayList<Medico>();
	  
	  public Medico(){
	  }
	  
	  public Medico(String nomeMedico, String crm, String especialidade, String telefone, String periodoAtendimento){
	    this.nomeMedico = nomeMedico;
	    this.crm = crm;
	    this.especialidade = especialidade;
	    this.telefone = telefone;
	    this.periodoAtendimento = periodoAtendimento;
	  }
	  
	  public static void cadastrarMedico(){
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Digite o nome do médico: ");
	    String nomeMedico = input.nextLine();
	    System.out.println("Digite o CRM do médico: ");
	    String crm = input.nextLine();
	    System.out.println("Digite especialidade do médico: ");
	    String especialidade = input.nextLine();
	    System.out.println("Digite o telefone do médico: ");
	    String telefone = input.nextLine();
	    System.out.println("Digite o periodo de atendimento do médico: ");
	    String periodoAtendimento = input.nextLine();
	    
	    Medico novoMedico = new Medico(nomeMedico, crm, especialidade, telefone, periodoAtendimento);
	    listaMedicos.add(novoMedico);
	    
	    System.out.println("Médico cadastrado com sucesso!");
	    
	  }
	  
	  public static void mostrarMedico(){
	    
	    System.out.print("\nMÉDICOS CADASTRADOS: ");
	    System.out.print(listaMedicos.size()); 
	    System.out.println();
	    
	    Medico[] cabecalho = {"idMedico", "Nome", "CRM", "Especialidade", "Telefone", "Periodo de Atendimento"};
	    listaMedico.add(cabecalho);
	    for(int i = 0; i < listaMedicos.size(); i++){
	      System.out.println(listaMedicos.get(i).nomeMedico + "\t\t" + listaMedicos.get(i).crm + "\t" + listaMedicos.get(i).especialidade);
	    }
	    
	    System.out.println("\n\n\n");
	    
	    
	  }
}
