

package hospital;

import java.util.Scanner;


public class Teste {

   
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        
        String nomeP1, anoNascP1, endP1, cpfP1;
        
        System.out.println("Digite o nome do paciente:");
        nomeP1 = scan.nextLine();
        System.out.println("Digite o ano do nascimento do paciente:");
        anoNascP1 = scan.nextLine();
        System.out.println("Digite o endereco do paciente:");
        endP1 = scan.nextLine();
        System.out.println("Digite o cpf do paciente:");
        cpfP1 = scan.nextLine();
        
        String nomeM1, anoNascM1, endM1, cpfM1;
        
        System.out.println("Digite o nome do médico:");
        nomeM1 = scan.nextLine();
        System.out.println("Digite o ano do nascimento do médico:");
        anoNascM1 = scan.nextLine();
        System.out.println("Digite o endereco do médico:");
        endM1 = scan.nextLine();
        System.out.println("Digite o cpf do médico:");
        cpfM1 = scan.nextLine();
        
        String nomeE1, anoNascE1, endE1, cpfE1;
        
        System.out.println("Digite o nome do enfermeiro:");
        nomeE1 = scan.nextLine();
        System.out.println("Digite o ano do nascimento do enfermeiro:");
        anoNascE1 = scan.nextLine();
        System.out.println("Digite o endereco do enfermeiro:");
        endE1 = scan.nextLine();
        System.out.println("Digite o cpf do enfermeiro:");
        cpfE1 = scan.nextLine();
        
        
        Paciente objPaciente = new Paciente(nomeP1, anoNascP1, endP1, cpfP1);
        Medico objMedico = new Medico(nomeM1, anoNascM1, endM1, cpfM1);
        Enfermeiro objEnfermeiro = new Enfermeiro(nomeE1, anoNascE1, endE1, cpfE1);
        
        Internacao objInternacao = new Internacao("Dengue", "16/04/2000", "Leve", 100, 10, objPaciente, objMedico, objEnfermeiro);
        objInternacao.visualizarInternacao();
        objInternacao.valorTotalInternacao();
       // Internacao objInternacao = new Internacao(objPaciente, objMedico, objEnfermeiro);
        
    }
    
}
