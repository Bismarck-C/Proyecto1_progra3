package com.una.proyecto3_progra3.controller.departamento;

import com.una.proyecto3_progra3.model.departamento.Departamento;
import com.una.proyecto3_progra3.model.departamento.DepartamentoDAO;
import com.una.proyecto3_progra3.model.encargado.Encargado;
import com.una.proyecto3_progra3.model.encargado.EncargadoDAO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Dylan M
 */
public class DepartamentoController implements DepartamentoInterface{
    
    public DepartamentoController (){
    
    }
    
    @Override
    public boolean addDepartamento(String[] data, Encargado encargado) {
        try{
            EncargadoDAO eDAO = new EncargadoDAO();
            if(eDAO.store(encargado)){
                DepartamentoDAO dDAO = new DepartamentoDAO();
                Departamento departamento = new Departamento(data);
                departamento.setEncargado(encargado);
                if(dDAO.store(departamento)){
                    return true;
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateDepartamento(String id_departamento, Encargado encargado, String[] data) {
        try{
            String id = "";
            EncargadoDAO eDAO = new EncargadoDAO();
            if(eDAO.store(encargado)){
                Departamento dept = this.getDepartamento(id_departamento);
                id = dept.getEncargado().getId();
                dept.setNombre(data[0]);
                dept.setUbicacion(data[1]);
                dept.setTelefono(data[2]);
                dept.setEmail(data[3]);
                dept.setEncargado(encargado);
                DepartamentoDAO dDAO = new DepartamentoDAO();
                if(dDAO.update(dept)){
                    return eDAO.delete(id);
                }
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    
    
    @Override
    public Encargado getEncargado(String id) {
       try{
           EncargadoDAO dao = new EncargadoDAO();
           String[] data = new String[5];
           ResultSet rs = dao.verifyExist(id);
           if(rs.next()){
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
           }
           Encargado encargado = new Encargado(data);
           rs.close();
           return encargado;
       }catch(Exception ex){
           ex.printStackTrace();
       } 
       return null;
    }

    @Override
    public Departamento getDepartamento(String id) {
      try{
           String _id = "";
           DepartamentoDAO dao = new DepartamentoDAO();
           String[] data = new String[5];
           ResultSet rs = dao.verifyExist(id);
           if(rs.next()){
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                _id = rs.getString(6);
           }
           Departamento departamento = new Departamento(data);
           Encargado encargado = this.getEncargado(_id);
           departamento.setEncargado(encargado);
           rs.close();
           return departamento;
       }catch(Exception ex){
           ex.printStackTrace();
       } 
       return null;
    }

    @Override
    public ArrayList<Departamento> getAll() {
        try{
            String _id = "";
            ArrayList<Departamento> list = new ArrayList<>();
            DepartamentoDAO dao = new DepartamentoDAO();
            ResultSet rs = dao.getALL();
            while(rs.next()){
                String[] data = new String[5];
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                _id = rs.getString(6);
                Departamento departamento = new Departamento(data);
                Encargado encargado = this.getEncargado(_id);
                departamento.setEncargado(encargado);
                list.add(departamento);
            }
            rs.close();
            return list;
        }catch(Exception ex){
            ex.printStackTrace();
        }  
        return null;
    }
    
}
