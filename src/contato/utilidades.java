package contato;
import telas.contato.telaInserir;

public class utilidades {
    // Método para limpar campos de texto
    public static void limparCampos( ){
        // Limpa os dados inseridos pelo usuário
        telaInserir.txtNome.setText(null);
        telaInserir.txtDDD.setText(null);
        telaInserir.txtNumero.setText(null);
        telaInserir.txtEmail.setText(null);
        telaInserir.txtMesNascimento.setText(null);
        telaInserir.txtCPF.setText(null);
        telaInserir.txtEndereco.setText(null);
        telaInserir.txtCidade.setText(null);
        telaInserir.txtEstado.setText(null);
    }
}
