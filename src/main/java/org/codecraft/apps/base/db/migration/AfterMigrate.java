package org.codecraft.apps.base.db.migration;

import org.flywaydb.core.api.callback.Callback;
import org.flywaydb.core.api.callback.Context;
import org.flywaydb.core.api.callback.Event;

public class AfterMigrate implements Callback {

  @Override
  public boolean supports(Event event, Context context) {
    return event == Event.AFTER_MIGRATE;
  }

  @Override
  public boolean canHandleInTransaction(Event event, Context context) {
    return true;
  }

  @Override
  public void handle(Event event, Context context) {
    if (event == Event.AFTER_MIGRATE) {
      refreshMetaData();
    }
  }

  @Override
  public String getCallbackName() {
    return "Refresh meta data";
  }

  private void refreshMetaData() {
    System.out.println("Refresh meta data");
  }
}
