
package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    public static Connection conector(){
        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String url = "jdbc:mysql://localhost:3306/bancologin";
        String password = "";
        
        try{
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, user, password);  
        return conexao;
    }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Falha na conexão "+ e.getMessage());
            return null;
    }
  }
}

