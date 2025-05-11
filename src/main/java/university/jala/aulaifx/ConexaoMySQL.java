package university.jala.aulaifx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    public static void main(String[] args) {
        // URL padrão para MySQL local
        String url = "jdbc:mysql://localhost:3306/nome_do_banco";
        String usuario = "root"; // ou outro usuário
        String senha = "sua_senha";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão bem-sucedida com o MySQL!");
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
        }
    }
}
