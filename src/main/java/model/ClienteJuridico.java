
package model;

import javax.swing.JOptionPane;

public class ClienteJuridico extends Cliente {
    private String CNPJ;
    private String IE;
    private float Faturamento;

    public ClienteJuridico(){
        this("","","","","", 0.0f);
    }
    
    public ClienteJuridico(String Nome, String Endereco, String Telefone, 
            String CNPJ, String IE, float Faturamento) {
        super(Nome, Endereco, Telefone);
        this.CNPJ = CNPJ;
        this.IE = IE;
        this.Faturamento = Faturamento;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public float getFaturamento() {
        return Faturamento;
    }

    public void setFaturamento(float Faturamento) {
        this.Faturamento = Faturamento;
    }
    
    

    @Override
    public void CadastrarCliente(){
        super.CadastrarCliente();
        setCNPJ(JOptionPane.showInputDialog("Qual o cnpj do cliente? "));
        setIE(JOptionPane.showInputDialog("Qual o IE do cliente? "));
        setFaturamento(Float.parseFloat(JOptionPane.showInputDialog("Qual o faturamento do cliente ")));
    }

    
    
}
