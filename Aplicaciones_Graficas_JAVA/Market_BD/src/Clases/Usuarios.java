/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Config.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author juanc
 */
public class Usuarios {    
    private String fistname;
    private String lastname;
    private String gender;
    private String city;
    private String email;
    private String mobile;
    private String password;

    public Usuarios(String fistname, String lastname, String gender, String city, String email, String mobile, String password) {
        this.fistname = fistname;
        this.lastname = lastname;
        this.gender = gender;
        this.city = city;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gelder) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public boolean grabar(){
        String cadenaSQL="insert into users (firstname,lastname,gender,mobile,city,email,password) values ('"+this.fistname+"','"+this.lastname+"','"+this.gender+"','"+this.mobile+"','"+this.city+"','"+this.email+"','"+this.password+"')";
        Database conector=new Database();
        Connection conexion=conector.conectar();
        try {
            PreparedStatement sentencia=conexion.prepareStatement(cadenaSQL);
            sentencia.execute();
            conector.desconectar();
            return true; 
        } catch (Exception e) {
            System.out.println("Error al ejecutar "+cadenaSQL+"/n"+e.getMessage());
            conector.desconectar();
            return false;
        }        
    }
    
      public static boolean validar(String email,String clave){
        boolean valido=false;
        Database conector=new Database();
        Connection conexion=conector.conectar();    
        String cadenaSQL="select email from users where email='"+email+"' and password='"+ clave +"';";
        try {
            PreparedStatement sentencia=conexion.prepareStatement(cadenaSQL);
            ResultSet resultado=sentencia.executeQuery();
            if (resultado.next()) {//Mueve el puntero en el siguiente registro,si no hay devuelve false
                valido=true;
            } 
            conector.desconectar();
            return valido;
        } catch (Exception e) {
            System.out.println("Ocurrio un error en: "+cadenaSQL+"\n"+e.getMessage());
            conector.desconectar();
            return valido;
        }
    }  
      
    public static int getCantidadDatos(){
        int cantidad=0;
        String cadenaSQL="select count(id) as cantidad from users";
        Database conector=new Database();
        Connection conexion=conector.conectar();
        try {
            PreparedStatement sentencia=conexion.prepareStatement(cadenaSQL);
            ResultSet resultado=sentencia.executeQuery();
            if (resultado.next()) cantidad=resultado.getInt("cantidad");
            conector.desconectar();
        } catch (Exception e) {
            System.out.println("Error en "+cadenaSQL+"\n"+e.getMessage());
            conector.desconectar();
        }
        return cantidad;
    }
      
    public static String[][] getLista(){
        String [][] datos=new String[getCantidadDatos()][6];
        String cadenaSQL="SELECT * from users;";
        Database conector=new Database();
        Connection conexion=conector.conectar();
        try {
            PreparedStatement sentencia=conexion.prepareStatement(cadenaSQL);
            ResultSet resultado=sentencia.executeQuery();
            int i=0;
            while (resultado.next()) {
                datos[i][0]=resultado.getString("firstname");
                datos[i][1]=resultado.getString("lastname");
                datos[i][2]=resultado.getString("gender");
                datos[i][3]=resultado.getString("mobile");
                datos[i][4]=resultado.getString("city");
                datos[i][5]=resultado.getString("email");
                i++;
            }
            conector.desconectar();
        } catch (Exception e) {
            System.out.println("Error en "+cadenaSQL+"\n"+e.getMessage());
            conector.desconectar();
        }
        return datos;
    }
    
  

    
}
