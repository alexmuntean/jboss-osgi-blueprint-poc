package fi.eis.applications.jboss.poc.osgiservice.blueprint;

import fi.eis.applications.jboss.poc.osgiservice.api.MessageService;

public class SimpleMessageService implements MessageService {

  @Override
  public String getMessage() {
    return "tadaa";
  }
}
