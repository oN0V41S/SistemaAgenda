package contato;

import javax.swing.JOptionPane;
import telas.contato.telaInserir;

public class validarCampos {
    
    public boolean CamposVaziosSemId(){
            if( telaInserir.txtNome.getText().length() == 0 || telaInserir.txtNome.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Insira o nome do contato!!");
                return false;
            }else if(telaInserir.txtEmail.getText().length() == 0 || telaInserir.txtEmail.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Insira o Email do contato!!");
                return false;
            }else if(telaInserir.txtCPF.getText().length() == 0 || telaInserir.txtCPF.getText().equals(" ")) {
                JOptionPane.showMessageDialog(null,"Insira o CPF do contato!!");
                return false;
            }else if(telaInserir.txtMesNascimento.getText().length() == 0 || telaInserir.txtMesNascimento.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Insira o Mês de Nascimento do contato!!");
                return false;
            }else if(telaInserir.txtEndereco.getText().length() == 0 || telaInserir.txtEndereco.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Insira o Endereço do contato!!");
                return false;
            }else if(telaInserir.txtEstado.getText().length() == 0 || telaInserir.txtEstado.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Insira o Estado do contato!!");
                return false;
            }else if(telaInserir.txtCidade.getText().length() == 0 || telaInserir.txtCidade.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Insira a Cidade do contato!!");
                return false;
            }else if(telaInserir.txtDDD.getText().length() == 0 || telaInserir.txtDDD.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Insira o DDD do contato!!");
                return false;
            }else if(telaInserir.txtNumero.getText().length() == 0 || telaInserir.txtNumero.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Insira o Número do contato!!");
                return false;
            }else{
                return true;
            }
        }
    public boolean validarEmail(){
            int arroba = telaInserir.txtEmail.getText().indexOf("@");
            if(arroba == -1){
                JOptionPane.showMessageDialog(null, "Insira um Email Válido!!");
                telaInserir.txtCPF.setText("");
                return false;
            }else{
                return true;
            }
        }
    public boolean validarCPF(){
            // Validando campo de CPF
            if(telaInserir.txtCPF.getText().length() != 11  ){
                JOptionPane.showMessageDialog(null, "Insira um CPF Válido!!");
                telaInserir.txtCPF.setText("");
                return false;
            }else{
                return true;
            }
        }
    public boolean validarDDD(){
            // Validando campo ddd
            if(telaInserir.txtDDD.getText().length() != 2){
                JOptionPane.showMessageDialog(null, "Insira um DDD Válido!!");
                telaInserir.txtCPF.setText("");
                return false;
            }else{
                return true;
            }
        }
    public boolean validarNumero(){
            // Validando campo Número
            if(telaInserir.txtNumero.getText().length() != 9){
                JOptionPane.showMessageDialog(null, "Insira um Número Válido!!");
                telaInserir.txtCPF.setText("");
                return false;
            }else{
                return true;
            }
        }
    public boolean validarMesNascimento(){
            //Validando campo de Mês de Nascimento
            if(Integer.parseInt(telaInserir.txtMesNascimento.getText()) > 12){
                JOptionPane.showMessageDialog(null, "Insira um Mês de Nascimento Válido!!");
                telaInserir.txtCPF.setText("");
                return false;
            }else{
                return true;
            }
        }
    
    // Método Principal que valida todos os campos
    public static boolean validarCampos(){
        if(validarEmail() == false){return false;}
        else if(validarMesNascimento() == false){return false;}
        else if(validarCPF() == false){return false;}
        else if(validarDDD() == false){return false;}
        else if(validarNumero() == false){return false;}
        else{return true;}
    }
}
