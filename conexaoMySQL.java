package conexaoBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	//Criar um m�todo que ir� configurar o objeto conexao
  	//O m�todo ir� retornar o pr�prio objeto conexao, ou seja, ao final de
  	//tudo ser� retornado o estado da conex�o, isto �, conex�o aberta ou n�o
public Connection conectar(){
	    
	    //Criar uma variavel do tipo connection
	    Connection conexao = null;

	 // Configurando a nossa conex�o com um banco de dados//
		 
        String serverName = "127.0.0.1:3306";    //caminho do servidor do BD
 
        String mydatabase ="lojinha";        //nome do seu banco de dados
 
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase+"?useTimezone=true&serverTimezone=UTC";
 
        String username = "root";        //nome de um usu�rio de seu BD      
 
        String password = "xxxxxxxxx";      //sua senha de acesso
       
 
	 
	    try {
	    	//Configura��o do Driver de banco de dados
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	    	//Configura��o do caminho (IP), usu�rio, senha e banco de dados
	  			//O m�todo getConnection() tenta inicar a conex�o com os valores
	  			//passados como par�metro
	         conexao = DriverManager.getConnection(url, username, password);
	     System.out.println("conectado com sucesso");
	    }catch (ClassNotFoundException ex) {
	        
	        System.out.println("N�o foi poss�vel carregar o driver.");
	        ex.printStackTrace();
	    
	    }catch (SQLException ex) {
	        
	        System.out.println("Problema com o SQL");
	        ex.printStackTrace();

	    } // fim do try-catch
	   
		return conexao;

	} // fim de conectar()
}
