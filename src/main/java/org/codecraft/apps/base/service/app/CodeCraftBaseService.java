package org.codecraft.apps.base.service.app;

import com.axelor.apps.base.service.app.AppBaseService;
import org.codecraft.apps.base.db.AppCodecraftBase;

public interface CodeCraftBaseService extends AppBaseService {

  AppCodecraftBase getAppCodecraftBase();
}
