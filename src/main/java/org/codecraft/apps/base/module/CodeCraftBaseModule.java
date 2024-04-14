package org.codecraft.apps.base.module;

import com.axelor.app.AxelorModule;
import org.codecraft.apps.base.service.app.CodeCraftBaseService;
import org.codecraft.apps.base.service.app.CodeCraftBaseServiceImpl;

public class CodeCraftBaseModule extends AxelorModule {

  @Override
  protected void configure() {
    bind(CodeCraftBaseService.class).to(CodeCraftBaseServiceImpl.class);
  }
}
