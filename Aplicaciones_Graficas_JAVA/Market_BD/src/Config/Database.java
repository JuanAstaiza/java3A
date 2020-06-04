/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author juanc
 */
public class Database {
    private String servidor;
    private String puerto;
    private String usuario;
    private String clave;
    private String bd;
    private Connection conexion;
    
    public Database() {
        servidor="localhost";
        puerto="3306";
        usuario="root";
        clave="";
        bd="mymarket";
    }
    
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection("jdbc:mysql://"+servidor+":"+puerto+"/"+bd,usuario,clave);
            System.out.println("Conectado a la base de datos "+bd);
            return conexion;
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos "+bd+"\n"+e.getMessage());
            return null;
        }
    }
    
    public void desconectar(){
        try {
            conexion.close();
            System.out.println("Desconectado de la base de datos "+bd);
        }catch (Exception e) {
            System.out.println("Error al desconectar de la base de datos "+bd+"\n"+e.getMessage());
        }
    }

    public static void main(String[] args) {
        Database conector=new Database();
        conector.conectar();
        conector.desconectar();
    }
    

}
