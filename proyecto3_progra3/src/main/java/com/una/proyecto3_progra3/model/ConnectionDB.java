package com.una.proyecto3_progra3.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

        
public class ConnectionDB {
    private final String driver="com.mysql.cj.jdbc.Driver";
    private final String connString=
            "jdbc:mysql://localhost/proyecto_1?user=root&password=";
    private static Connection con=null;
    
    public ConnectionDB() throws SQLException{
        this.con=DriverManager.getConnection(connString);
    }
    /**
     * METODO PARA CONSULTA A LA BASE DE DATOS
     */
    protected synchronized ResultSet query(String strSQL) throws Exception{
        try{
            Class.forName(driver);
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery(strSQL);
            return rs;
        }catch(ClassNotFoundException|SQLException ex){
            throw ex;
        }
    }
    /**
     * METODO PARA MODIFICACIÓN/MANIPULACIÓN DE LOS REGISTROS DE LA BASE DE DATOS
     */
    protected synchronized boolean update(String strSQL) throws Exception{
        boolean response=false;
        try{
            Class.forName(driver);
            Statement stm=con.createStatement();
            if(stm.executeUpdate(strSQL)!=0){
                response=true;
            }
            return response;
        }catch(ClassNotFoundException|SQLException ex){
            throw ex;
        }
    }
}