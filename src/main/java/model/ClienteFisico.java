
package model;

import javax.swing.JOptionPane;

public class ClienteFisico extends Cliente {
    private String CPF;
    private String RG;
    private float Salario;
    
    public ClienteFisico(){
        this("","","","","", 0.0f);
    }

    public ClienteFisico(
            String Nome, String Endereco, 
            String Telefone, String CPF, 
            String RG, float Salario
    ) {
        super(Nome, Endereco, Telefone);
        this.CPF = CPF;
        this.RG = RG;
        this.Salario = Salario;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }
    
    @Override
    public void CadastrarCliente(){
        super.CadastrarCliente();
        setCPF(JOptionPane.showInputDialog("Digite o CPF do cliente: "));
        setRG(JOptionPane.showInputDialog("Digite o RG do cliente: "));
        setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do cliente: ")));
    }
    
    
}
