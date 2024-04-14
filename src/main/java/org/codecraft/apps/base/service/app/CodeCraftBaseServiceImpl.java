package org.codecraft.apps.base.service.app;

import com.axelor.apps.base.service.app.AppBaseServiceImpl;
import com.axelor.inject.Beans;
import com.axelor.meta.MetaFiles;
import com.axelor.meta.db.repo.MetaFileRepository;
import com.axelor.meta.db.repo.MetaModelRepository;
import com.axelor.meta.db.repo.MetaModuleRepository;
import com.axelor.studio.app.service.AppVersionService;
import com.axelor.studio.db.repo.AppRepository;
import com.axelor.studio.service.AppSettingsStudioService;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.codecraft.apps.base.db.AppCodecraftBase;
import org.codecraft.apps.base.db.repo.AppCodecraftBaseRepository;

@Singleton
public class CodeCraftBaseServiceImpl extends AppBaseServiceImpl implements CodeCraftBaseService {

  @Inject
  public CodeCraftBaseServiceImpl(
      AppRepository appRepo,
      MetaFiles metaFiles,
      AppVersionService appVersionService,
      MetaModelRepository metaModelRepo,
      AppSettingsStudioService appSettingsService,
      MetaModuleRepository metaModuleRepo,
      MetaFileRepository metaFileRepo) {
    super(
        appRepo,
        metaFiles,
        appVersionService,
        metaModelRepo,
        appSettingsService,
        metaModuleRepo,
        metaFileRepo);
  }

  @Override
  public AppCodecraftBase getAppCodecraftBase() {
    return Beans.get(AppCodecraftBaseRepository.class).all().fetchOne();
  }
}
