package modelos;

import play.data.validation.ValidationError;
import java.util.ArrayList;
import java.util.List;
import modelos.InfoUsuarioDB;

public class FormularioLogin {
	public String usuario = "";
	public String senha = "";
	
	public FormularioLogin() {
		
	}
	
	public List<ValidationError> validate(){
		List<ValidationError> errors = new ArrayList<>();
		if(!InfoUsuarioDB.autenticar(usuario, senha)) {
			errors.add(new ValidationError("Username", ""));
			errors.add(new ValidationError("Password", ""));
		}
		return (errors.size() > 0) ? errors : null;
	}

}
