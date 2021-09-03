package crud.usuario;

import model.*;
import view.*;

public class CRUDusuario {
    
    public static void main(String[] args) {
        User u = new User();
        /*
        u.setUserName("Ricardo");
        u.setGender("M");
        u.setAddress("Rua da Laranja");
        u.setCpf("07258412245");
        u.setPhone("54251452498");
        //u.setId(4);
        */
        DAO_scripts DAO = new DAO_scripts();
        /*
        DAO.save(u);
        */
        /*
        for(User u: DAO_scripts.search()){
            System.out.println(users);
        }*/
        DAO.read();
        
    }    
}
