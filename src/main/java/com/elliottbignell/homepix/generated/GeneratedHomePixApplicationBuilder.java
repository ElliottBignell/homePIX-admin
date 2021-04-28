package com.elliottbignell.homepix.generated;

import com.elliottbignell.homepix.HomePixApplication;
import com.elliottbignell.homepix.HomePixApplicationBuilder;
import com.elliottbignell.homepix.HomePixApplicationImpl;
import com.elliottbignell.homepix.HomePixCacheReloader;
import com.elliottbignell.homepix.HomePixInjectorProxy;
import com.elliottbignell.homepix.innodb.innodb.albumview.AlbumViewManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.albumview.AlbumViewSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.auth_group.AuthGroupManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.auth_group.AuthGroupSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.auth_group_permissions.AuthGroupPermissionsManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.auth_group_permissions.AuthGroupPermissionsSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.auth_permission.AuthPermissionManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.auth_permission.AuthPermissionSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.auth_user.AuthUserManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.auth_user.AuthUserSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.auth_user_groups.AuthUserGroupsManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.auth_user_groups.AuthUserGroupsSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.auth_user_user_permissions.AuthUserUserPermissionsManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.auth_user_user_permissions.AuthUserUserPermissionsSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.calendarview.CalendarViewManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.calendarview.CalendarViewSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.captcha_captchastore.CaptchaCaptchastoreManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.captcha_captchastore.CaptchaCaptchastoreSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.django_admin_log.DjangoAdminLogManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.django_admin_log.DjangoAdminLogSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.django_content_type.DjangoContentTypeManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.django_content_type.DjangoContentTypeSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.django_migrations.DjangoMigrationsManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.django_migrations.DjangoMigrationsSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.django_session.DjangoSessionManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.django_session.DjangoSessionSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.homepix_album.HomePixAlbumManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_album.HomePixAlbumSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.homepix_albumcontent.HomePixAlbumcontentManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_albumcontent.HomePixAlbumcontentSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.homepix_comment.HomePixCommentManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_comment.HomePixCommentSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.homepix_csvcontent.HomePixCsvcontentManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_csvcontent.HomePixCsvcontentSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.homepix_csventry.HomePixCsventryManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_csventry.HomePixCsventrySqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.homepix_directory.HomePixDirectoryManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_directory.HomePixDirectorySqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.homepix_keywords.HomePixKeywordsManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_keywords.HomePixKeywordsSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.homepix_picturefile.HomePixPicturefileManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_picturefile.HomePixPicturefileSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.imports.ImportsManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.imports.ImportsSqlAdapter;
import com.elliottbignell.homepix.innodb.innodb.sqlite_sequence.SqliteSequenceManagerImpl;
import com.elliottbignell.homepix.innodb.innodb.sqlite_sequence.SqliteSequenceSqlAdapter;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.Injector;
import com.speedment.runtime.application.AbstractApplicationBuilder;
import com.speedment.runtime.connector.mariadb.MariaDbBundle;
import com.speedment.runtime.core.internal.AbstractApplicationBuilder;

/**
 * A generated base {@link
 * com.speedment.runtime.application.AbstractApplicationBuilder} class for the
 * {@link com.speedment.runtime.config.Project} named innodb.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedHomePixApplicationBuilder extends AbstractApplicationBuilder<HomePixApplication, HomePixApplicationBuilder> {
    
    protected GeneratedHomePixApplicationBuilder() {
        super(HomePixApplicationImpl.class, GeneratedHomePixMetadata.class);
        withManager(AlbumViewManagerImpl.class);
        withManager(AuthGroupManagerImpl.class);
        withManager(AuthGroupPermissionsManagerImpl.class);
        withManager(AuthPermissionManagerImpl.class);
        withManager(AuthUserManagerImpl.class);
        withManager(AuthUserGroupsManagerImpl.class);
        withManager(AuthUserUserPermissionsManagerImpl.class);
        withManager(CalendarViewManagerImpl.class);
        withManager(CaptchaCaptchastoreManagerImpl.class);
        withManager(DjangoAdminLogManagerImpl.class);
        withManager(DjangoContentTypeManagerImpl.class);
        withManager(DjangoMigrationsManagerImpl.class);
        withManager(DjangoSessionManagerImpl.class);
        withManager(HomePixAlbumManagerImpl.class);
        withManager(HomePixAlbumcontentManagerImpl.class);
        withManager(HomePixCommentManagerImpl.class);
        withManager(HomePixCsvcontentManagerImpl.class);
        withManager(HomePixCsventryManagerImpl.class);
        withManager(HomePixDirectoryManagerImpl.class);
        withManager(HomePixKeywordsManagerImpl.class);
        withManager(HomePixPicturefileManagerImpl.class);
        withManager(ImportsManagerImpl.class);
        withManager(SqliteSequenceManagerImpl.class);
        withComponent(AlbumViewSqlAdapter.class);
        withComponent(AuthGroupSqlAdapter.class);
        withComponent(AuthGroupPermissionsSqlAdapter.class);
        withComponent(AuthPermissionSqlAdapter.class);
        withComponent(AuthUserSqlAdapter.class);
        withComponent(AuthUserGroupsSqlAdapter.class);
        withComponent(AuthUserUserPermissionsSqlAdapter.class);
        withComponent(CalendarViewSqlAdapter.class);
        withComponent(CaptchaCaptchastoreSqlAdapter.class);
        withComponent(DjangoAdminLogSqlAdapter.class);
        withComponent(DjangoContentTypeSqlAdapter.class);
        withComponent(DjangoMigrationsSqlAdapter.class);
        withComponent(DjangoSessionSqlAdapter.class);
        withComponent(HomePixAlbumSqlAdapter.class);
        withComponent(HomePixAlbumcontentSqlAdapter.class);
        withComponent(HomePixCommentSqlAdapter.class);
        withComponent(HomePixCsvcontentSqlAdapter.class);
        withComponent(HomePixCsventrySqlAdapter.class);
        withComponent(HomePixDirectorySqlAdapter.class);
        withComponent(HomePixKeywordsSqlAdapter.class);
        withComponent(HomePixPicturefileSqlAdapter.class);
        withComponent(ImportsSqlAdapter.class);
        withComponent(SqliteSequenceSqlAdapter.class);
        withBundle(MariaDbBundle.class);
        withInjectorProxy(new HomePixInjectorProxy());
        withComponent(HomePixCacheReloader.class);
    }
    
    @Override
    public HomePixApplication build(Injector injector) {
        return injector.getOrThrow(HomePixApplication.class);
    }
}