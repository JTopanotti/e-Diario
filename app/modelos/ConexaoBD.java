package modelos;

import javax.inject.Inject;
import javax.inject.Singleton;
import play.db.NamedDatabase;
import play.db.*;

@Singleton
public class ConexaoBD {
	private Database db;
	private ContextoExecucao executionContext;
	
	@Inject
	public ConexaoBD(@NamedDatabase("playdb") Database db, ContextoExecucao executionContext) {
		this.db = db;
		this.executionContext = executionContext;
	}

}
