package dal;
import java.sql.*;
import javax.swing.*;

public class ModuloConexao {
    public static Connection conector(){
        Connection conexao = null;
        // Chamando Driver do MySQL
        String driver = "com.mysql.cj.jdbc.Driver";
        // Adicionando URL da conexão
        String url = "jdbc:mysql://localhost:3306/agenda";
        
        // Autenticação do Banco de Dados
        String user = "root";
        String password = "";
        
        // Tentando conectar ao banco
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com Banco de Dados!!");
            System.exit(0);
            return null;
        }
    }
}
