/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValueObjects;
/**
 *
 * @author TIC-SCI
 */
public class UsuarioVo {
    
    private String userVo;
    
    private String pwdVo;

    public String getUserVo() {
        return userVo;
    }

    public void setUserVo(String userVo) {
        this.userVo = userVo;
    }

    public String getPwdVo() {
        return pwdVo;
    }

    public void setPwdVo(String pwdVo) {
        this.pwdVo = pwdVo;
    }

    public UsuarioVo(String userVo, String pwdVo) {
        this.userVo = userVo;
        this.pwdVo = pwdVo;
    }
    
    
    
}
