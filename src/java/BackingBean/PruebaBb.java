/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBean;

import ValueObjects.UsuarioVo;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author TIC-SCI
 */
@ManagedBean
@RequestScoped
public class PruebaBb {

    /**
     * Creates a new instance of PruebaBb
     */
    
    private String user;
    private String pwd;
    private List<UsuarioVo> miLista;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public List<UsuarioVo> getMiLista() {
        return miLista;
    }

    public void setMiLista(List<UsuarioVo> miLista) {
        this.miLista = miLista;
    }   
    
    public PruebaBb() {
    }
    
    public void registrarse(){
        
        UsuarioVo miUsuario;
        
        miLista = new ArrayList<UsuarioVo>();
        int i = 0;
        i = pwd.length();
        for(int j=0; j < i ; j ++) {
            miUsuario= new UsuarioVo(getUser()+" "+j, getPwd()+" "+j);
            miLista.add(miUsuario);
            
        }
        
    }
    
}
