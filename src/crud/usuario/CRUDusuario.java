package crud.usuario;

import model.*;
import view.*;

public class CRUDusuario {
    
    public static void main(String[] args) {
        User u = new User();
        DAO_scripts DAO = new DAO_scripts();
        
        u.setUserName("Ricardo");
        u.setGender("M");
        u.setAddress("Rua da Laranja");
        u.setCpf("07280471102");
        u.setPhone("54251452498");
        
        DAO.update(u);
        
    }    
}
