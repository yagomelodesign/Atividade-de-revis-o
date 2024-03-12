/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author 12046386671
 */
public class Paciente extends Pessoa {
    
    private int numeroInternacoes;
   
     public Paciente(String nome, String anoNascimento, String endereco, String cpf) {
        super(nome, anoNascimento, endereco, cpf);
    }

    public int getNumeroInternacoes() {
        return numeroInternacoes;
    }

    public void setNumeroInternacoes(int numeroInternacoes) {
        this.numeroInternacoes = numeroInternacoes;
    }


    
}
