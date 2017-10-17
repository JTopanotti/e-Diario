package modelos;

import play.data.validation.Constraints.Validate;
import play.data.validation.Constraints.Validatable;

@Validate
public class UsuarioLogin implements Validatable<String> {
	
    protected String usuario;
    protected String senha;
    
    public UsuarioLogin() {
    	
    }
    
    public String getUsuario() {
    	return usuario;
    }
    
    public String getSenha() {
    	return senha;
    }
    
    public void setUsuario(String usuario) {
    	this.usuario = usuario;
    }
    
    public void setSenha(String senha) {
    	this.senha = senha;
    }
    
    @Override
    public String validate() {
        if (!InfoUsuarioDB.autenticar(usuario, senha)) {
            // You could also return a key defined in conf/messages
        	System.out.println("Nao eutenticou	");
            return "Usuario e/ou senha errado(s)";
        }
        return null;
    } 

}
