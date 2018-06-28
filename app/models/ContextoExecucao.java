package models;

import javax.inject.Inject;
import akka.actor.ActorSystem;
import play.libs.concurrent.CustomExecutionContext;

public class ContextoExecucao extends CustomExecutionContext{

	@Inject
	public ContextoExecucao(ActorSystem actorSystem) {
		super(actorSystem, "diaro-custom-context");
	}
}
  