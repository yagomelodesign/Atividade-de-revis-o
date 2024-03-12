


package hospital;


public class Internacao {
    
    private String motivoInternacao, dataInternacao, estadoPaciente;
    private double valorDiaInternacao, quantidadeDiasInternacao;
    private int numeroIdentificador=0;
    
   Paciente pa;
   Medico me;
   Enfermeiro enf;

    public Internacao(String motivoInternacao, String dataInternacao, String estadoPaciente, double valorDiaInternacao, double quantidadeDiasInternacao, Paciente pa, Medico me, Enfermeiro enf) {
        this.motivoInternacao = motivoInternacao;
        this.dataInternacao = dataInternacao;
        this.estadoPaciente = estadoPaciente;
        this.valorDiaInternacao = valorDiaInternacao;
        this.quantidadeDiasInternacao = quantidadeDiasInternacao;
        this.pa = pa;
        this.me = me;
        this.enf = enf;
        this.numeroIdentificador++;
    }
   
  
    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    public String getDataInternacao() {
        return dataInternacao;
    }

    public void setDataInternacao(String dataInternacao) {
        this.dataInternacao = dataInternacao;
    }

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public double getValorDiaInternacao() {
        return valorDiaInternacao;
    }

    public void setValorDiaInternacao(double valorDiaInternacao) {
        this.valorDiaInternacao = valorDiaInternacao;
    }

    public double getQuantidadeDiasInternacao() {
        return quantidadeDiasInternacao;
    }

    public void setQuantidadeDiasInternacao(double quantidadeDiasInternacao) {
        this.quantidadeDiasInternacao = quantidadeDiasInternacao;
    }

     public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }
    
    public Paciente getPa() {
        return pa;
    }

    public void setPa(Paciente pa) {
        this.pa = pa;
    }

    public Enfermeiro getEnf() {
        return enf;
    }

    public void setEnf(Enfermeiro enf) {
        this.enf = enf;
    }

    public Medico getMe() {
        return me;
    }

    public void setMe(Medico me) {
        this.me = me;
    }

    
     public void visualizarInternacao(){
        System.out.println("\n------------------------------------------");
        System.out.println("Nome do paciente: "+this.pa.getNome());
        System.out.println("Nome do médico: "+this.me.getNome());
        System.out.println("Nome do enfermeiro: "+this.enf.getNome());
        System.out.println("Número identificador: "+this.getNumeroIdentificador());
        System.out.println("Motivo: "+this.motivoInternacao);
        System.out.println("Valor diário: "+this.valorDiaInternacao);
        System.out.println("Quantidade de dias: "+this.quantidadeDiasInternacao);
        System.out.println("------------------------------------------");
     }
     
     public void valorTotalInternacao(){
        System.out.println("Valor total da internação: "+this.getValorDiaInternacao()*this.getQuantidadeDiasInternacao()+"\n");
    }
     
     
    
}
