

package main;

import model.Cliente;
import model.ClienteFisico;
import model.ClienteJuridico;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        int quantClientes = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes você deseja cadastrar?"));
        
        Cliente[] clientes = new Cliente[quantClientes];
        
        for (int i = 0; i < quantClientes; i++){
            String resposta = JOptionPane.showInputDialog("Qual tipo de cliente você gostaria de cadastrar \n ");
            if(resposta.equalsIgnoreCase("Jurídico")){
                ClienteJuridico cj = new ClienteJuridico();
                cj.CadastrarCliente();
                clientes[i] = cj;
            } else if (resposta.equalsIgnoreCase("Físico")){
                ClienteFisico cf = new ClienteFisico();
                cf.CadastrarCliente();
                clientes[i] = cf;
            }
        }
    }
}
