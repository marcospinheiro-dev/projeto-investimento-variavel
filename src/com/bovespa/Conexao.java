package com.bovespa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    Connection con = null;

    public Connection conexaoBD() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bovespa?user=root&password=";
            con = DriverManager.getConnection(url);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro na conexão: " + e.getMessage());
        }
        return con;
    }

}