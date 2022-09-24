package com.una.proyecto3_progra3.controller.departamento;

import com.una.proyecto3_progra3.model.departamento.Departamento;
import com.una.proyecto3_progra3.model.departamento.DepartamentoDAO;
import com.una.proyecto3_progra3.model.encargado.Encargado;
import com.una.proyecto3_progra3.model.encargado.EncargadoDAO;
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
           Encargado rs = dao.verifyExist(id);
           if(rs != null){
              return rs;  
           }
       }catch(Exception ex){
           ex.printStackTrace();
       } 
       return null;
    }

    @Override
    public Departamento getDepartamento(String id) {
      try{
           DepartamentoDAO dao = new DepartamentoDAO();
           Departamento rs = dao.verifyExist(id);
           if(rs!=null){
               return rs; 
           }
       }catch(Exception ex){
           ex.printStackTrace();
       } 
       return null;
    }

    @Override
    public String[][] getAll() {
        try{
            DepartamentoDAO dao = new DepartamentoDAO();
            ArrayList<Departamento> list = dao.getALL();
            String[][] data = new String[list.size()][6];
            for(int i = 0; i < list.size(); i++){
                Departamento aux = list.get(i);
                data[i][0] = aux.getCodigo();
                data[i][1] = aux.getNombre();
                data[i][2] = aux.getUbicacion();
                data[i][3] = aux.getTelefono();
                data[i][4] = aux.getEmail();
                data[i][5] = aux.getEncargado().getId();
            }
            return data;
        }catch(Exception ex){
            ex.printStackTrace();
        }  
        return null;
    }
    
}
