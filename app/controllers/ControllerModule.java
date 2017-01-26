package controllers;

import play.api.Configuration;
import play.api.Environment;
import play.api.inject.Binding;
import scala.collection.Seq;

/**
 * Spring needs to know about the controllers so in this case we're just binding them here
 */
public class ControllerModule extends play.api.inject.Module {

  @Override
  public Seq<Binding<?>> bindings(Environment environment, Configuration configuration) {
    return seq(
        bind(PersonController.class).toSelf()
    );
  }
}
