package conexaoBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	//Criar um método que irá configurar o objeto conexao
  	//O método irá retornar o próprio objeto conexao, ou seja, ao final de
  	//tudo será retornado o estado da conexão, isto é, conexão aberta ou não
public Connection conectar(){
	    
	    //Criar uma variavel do tipo connection
	    Connection conexao = null;

	 // Configurando a nossa conexão com um banco de dados//
		 
        String serverName = "127.0.0.1:3306";    //caminho do servidor do BD
 
        String mydatabase ="lojinha";        //nome do seu banco de dados
 
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase+"?useTimezone=true&serverTimezone=UTC";
 
        String username = "root";        //nome de um usuário de seu BD      
 
        String password = "xxxxxxxxx";      //sua senha de acesso
       
 
	 
	    try {
	    	//Configuração do Driver de banco de dados
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	    	//Configuração do caminho (IP), usuário, senha e banco de dados
	  			//O método getConnection() tenta inicar a conexão com os valores
	  			//passados como parâmetro
	         conexao = DriverManager.getConnection(url, username, password);
	     System.out.println("conectado com sucesso");
	    }catch (ClassNotFoundException ex) {
	        
	        System.out.println("Não foi possível carregar o driver.");
	        ex.printStackTrace();
	    
	    }catch (SQLException ex) {
	        
	        System.out.println("Problema com o SQL");
	        ex.printStackTrace();

	    } // fim do try-catch
	   
		return conexao;

	} // fim de conectar()
}
