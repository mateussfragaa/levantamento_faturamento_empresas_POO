
package model;

import javax.swing.JOptionPane;

public class Cliente {
    public String Nome;
    public String Endereco;
    public String Telefone;

    
    public Cliente(){
        this("", "", "");
    }
    
    public Cliente(String Nome, String Endereco, String Telefone) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public void CadastrarCliente(){
        setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));
        setEndereco(JOptionPane.showInputDialog("Digite o endereco do cliente: "));
        setTelefone(JOptionPane.showInputDialog("Digite o telefone do cliente: "));
    }
}
