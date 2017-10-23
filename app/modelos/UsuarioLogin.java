package modelos;

import play.data.validation.Constraints.Validate;
import play.data.validation.Constraints.Validatable;
import play.data.validation.ValidationError;

import javax.xml.bind.ValidationException;

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
        if (!ConexaoPostgres.autenticar(usuario, senha)) {
            // You could also return a key defined in conf/messages
            return "Usuario e/ou senha errado(s)";
        }
        return null;
    }
}
