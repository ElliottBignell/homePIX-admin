package com.elliottbignell.homepix.generated;

import com.elliottbignell.homepix.innodb.innodb.albumview.AlbumView;
import com.elliottbignell.homepix.innodb.innodb.albumview.generated.GeneratedAlbumViewCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.auth_group.AuthGroup;
import com.elliottbignell.homepix.innodb.innodb.auth_group.generated.GeneratedAuthGroupCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.auth_group_permissions.AuthGroupPermissions;
import com.elliottbignell.homepix.innodb.innodb.auth_group_permissions.generated.GeneratedAuthGroupPermissionsCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.auth_permission.AuthPermission;
import com.elliottbignell.homepix.innodb.innodb.auth_permission.generated.GeneratedAuthPermissionCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.auth_user.AuthUser;
import com.elliottbignell.homepix.innodb.innodb.auth_user.generated.GeneratedAuthUserCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.auth_user_groups.AuthUserGroups;
import com.elliottbignell.homepix.innodb.innodb.auth_user_groups.generated.GeneratedAuthUserGroupsCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.auth_user_user_permissions.AuthUserUserPermissions;
import com.elliottbignell.homepix.innodb.innodb.auth_user_user_permissions.generated.GeneratedAuthUserUserPermissionsCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.calendarview.CalendarView;
import com.elliottbignell.homepix.innodb.innodb.calendarview.generated.GeneratedCalendarViewCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.captcha_captchastore.CaptchaCaptchastore;
import com.elliottbignell.homepix.innodb.innodb.captcha_captchastore.generated.GeneratedCaptchaCaptchastoreCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.django_admin_log.DjangoAdminLog;
import com.elliottbignell.homepix.innodb.innodb.django_admin_log.generated.GeneratedDjangoAdminLogCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.django_content_type.DjangoContentType;
import com.elliottbignell.homepix.innodb.innodb.django_content_type.generated.GeneratedDjangoContentTypeCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.django_migrations.DjangoMigrations;
import com.elliottbignell.homepix.innodb.innodb.django_migrations.generated.GeneratedDjangoMigrationsCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.django_session.DjangoSession;
import com.elliottbignell.homepix.innodb.innodb.django_session.generated.GeneratedDjangoSessionCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.homepix_album.HomePixAlbum;
import com.elliottbignell.homepix.innodb.innodb.homepix_album.generated.GeneratedHomePixAlbumCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.homepix_albumcontent.HomePixAlbumcontent;
import com.elliottbignell.homepix.innodb.innodb.homepix_albumcontent.generated.GeneratedHomePixAlbumcontentCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.homepix_comment.HomePixComment;
import com.elliottbignell.homepix.innodb.innodb.homepix_comment.generated.GeneratedHomePixCommentCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.homepix_csvcontent.HomePixCsvcontent;
import com.elliottbignell.homepix.innodb.innodb.homepix_csvcontent.generated.GeneratedHomePixCsvcontentCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.homepix_csventry.HomePixCsventry;
import com.elliottbignell.homepix.innodb.innodb.homepix_csventry.generated.GeneratedHomePixCsventryCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.homepix_directory.HomePixDirectory;
import com.elliottbignell.homepix.innodb.innodb.homepix_directory.generated.GeneratedHomePixDirectoryCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.homepix_keywords.HomePixKeywords;
import com.elliottbignell.homepix.innodb.innodb.homepix_keywords.generated.GeneratedHomePixKeywordsCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.homepix_picturefile.HomePixPicturefile;
import com.elliottbignell.homepix.innodb.innodb.homepix_picturefile.generated.GeneratedHomePixPicturefileCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.imports.Imports;
import com.elliottbignell.homepix.innodb.innodb.imports.generated.GeneratedImportsCacheHolder;
import com.elliottbignell.homepix.innodb.innodb.sqlite_sequence.SqliteSequence;
import com.elliottbignell.homepix.innodb.innodb.sqlite_sequence.generated.GeneratedSqliteSequenceCacheHolder;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.DataStoreHolder;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache;
import com.speedment.enterprise.datastore.runtime.fieldcache.MultiFieldCache;
import com.speedment.enterprise.datastore.runtime.statistic.Statistics;
import com.speedment.enterprise.datastore.runtime.util.StatisticsUtil;
import com.speedment.runtime.config.identifier.ColumnIdentifier;

import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;

/**
 * A holder class for the various caches that are used to speed up the project.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public final class GeneratedHomePixDataStoreHolder implements DataStoreHolder {
    
    private final GeneratedAlbumViewCacheHolder albumViewHolder;
    private final GeneratedAuthGroupCacheHolder authGroupHolder;
    private final GeneratedAuthGroupPermissionsCacheHolder authGroupPermissionsHolder;
    private final GeneratedAuthPermissionCacheHolder authPermissionHolder;
    private final GeneratedAuthUserCacheHolder authUserHolder;
    private final GeneratedAuthUserGroupsCacheHolder authUserGroupsHolder;
    private final GeneratedAuthUserUserPermissionsCacheHolder authUserUserPermissionsHolder;
    private final GeneratedCalendarViewCacheHolder calendarViewHolder;
    private final GeneratedCaptchaCaptchastoreCacheHolder captchaCaptchastoreHolder;
    private final GeneratedDjangoAdminLogCacheHolder djangoAdminLogHolder;
    private final GeneratedDjangoContentTypeCacheHolder djangoContentTypeHolder;
    private final GeneratedDjangoMigrationsCacheHolder djangoMigrationsHolder;
    private final GeneratedDjangoSessionCacheHolder djangoSessionHolder;
    private final GeneratedHomePixAlbumCacheHolder homePixAlbumHolder;
    private final GeneratedHomePixAlbumcontentCacheHolder homePixAlbumcontentHolder;
    private final GeneratedHomePixCommentCacheHolder homePixCommentHolder;
    private final GeneratedHomePixCsvcontentCacheHolder homePixCsvcontentHolder;
    private final GeneratedHomePixCsventryCacheHolder homePixCsventryHolder;
    private final GeneratedHomePixDirectoryCacheHolder homePixDirectoryHolder;
    private final GeneratedHomePixKeywordsCacheHolder homePixKeywordsHolder;
    private final GeneratedHomePixPicturefileCacheHolder homePixPicturefileHolder;
    private final GeneratedImportsCacheHolder importsHolder;
    private final GeneratedSqliteSequenceCacheHolder sqliteSequenceHolder;
    
    public GeneratedHomePixDataStoreHolder(
            GeneratedAlbumViewCacheHolder albumViewHolder,
            GeneratedAuthGroupCacheHolder authGroupHolder,
            GeneratedAuthGroupPermissionsCacheHolder authGroupPermissionsHolder,
            GeneratedAuthPermissionCacheHolder authPermissionHolder,
            GeneratedAuthUserCacheHolder authUserHolder,
            GeneratedAuthUserGroupsCacheHolder authUserGroupsHolder,
            GeneratedAuthUserUserPermissionsCacheHolder authUserUserPermissionsHolder,
            GeneratedCalendarViewCacheHolder calendarViewHolder,
            GeneratedCaptchaCaptchastoreCacheHolder captchaCaptchastoreHolder,
            GeneratedDjangoAdminLogCacheHolder djangoAdminLogHolder,
            GeneratedDjangoContentTypeCacheHolder djangoContentTypeHolder,
            GeneratedDjangoMigrationsCacheHolder djangoMigrationsHolder,
            GeneratedDjangoSessionCacheHolder djangoSessionHolder,
            GeneratedHomePixAlbumCacheHolder homePixAlbumHolder,
            GeneratedHomePixAlbumcontentCacheHolder homePixAlbumcontentHolder,
            GeneratedHomePixCommentCacheHolder homePixCommentHolder,
            GeneratedHomePixCsvcontentCacheHolder homePixCsvcontentHolder,
            GeneratedHomePixCsventryCacheHolder homePixCsventryHolder,
            GeneratedHomePixDirectoryCacheHolder homePixDirectoryHolder,
            GeneratedHomePixKeywordsCacheHolder homePixKeywordsHolder,
            GeneratedHomePixPicturefileCacheHolder homePixPicturefileHolder,
            GeneratedImportsCacheHolder importsHolder,
            GeneratedSqliteSequenceCacheHolder sqliteSequenceHolder) {
        this.albumViewHolder               = requireNonNull(albumViewHolder);
        this.authGroupHolder               = requireNonNull(authGroupHolder);
        this.authGroupPermissionsHolder    = requireNonNull(authGroupPermissionsHolder);
        this.authPermissionHolder          = requireNonNull(authPermissionHolder);
        this.authUserHolder                = requireNonNull(authUserHolder);
        this.authUserGroupsHolder          = requireNonNull(authUserGroupsHolder);
        this.authUserUserPermissionsHolder = requireNonNull(authUserUserPermissionsHolder);
        this.calendarViewHolder            = requireNonNull(calendarViewHolder);
        this.captchaCaptchastoreHolder     = requireNonNull(captchaCaptchastoreHolder);
        this.djangoAdminLogHolder          = requireNonNull(djangoAdminLogHolder);
        this.djangoContentTypeHolder       = requireNonNull(djangoContentTypeHolder);
        this.djangoMigrationsHolder        = requireNonNull(djangoMigrationsHolder);
        this.djangoSessionHolder           = requireNonNull(djangoSessionHolder);
        this.homePixAlbumHolder            = requireNonNull(homePixAlbumHolder);
        this.homePixAlbumcontentHolder     = requireNonNull(homePixAlbumcontentHolder);
        this.homePixCommentHolder          = requireNonNull(homePixCommentHolder);
        this.homePixCsvcontentHolder       = requireNonNull(homePixCsvcontentHolder);
        this.homePixCsventryHolder         = requireNonNull(homePixCsventryHolder);
        this.homePixDirectoryHolder        = requireNonNull(homePixDirectoryHolder);
        this.homePixKeywordsHolder         = requireNonNull(homePixKeywordsHolder);
        this.homePixPicturefileHolder      = requireNonNull(homePixPicturefileHolder);
        this.importsHolder                 = requireNonNull(importsHolder);
        this.sqliteSequenceHolder          = requireNonNull(sqliteSequenceHolder);
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <ENTITY> EntityStore<ENTITY> getEntityStore(
            String dbmsName,
            String schemaName,
            String tableName) {
        switch (tableName) {
            case "AlbumView"                  : return (EntityStore<ENTITY>) albumViewHolder.getEntityStore();
            case "auth_group"                 : return (EntityStore<ENTITY>) authGroupHolder.getEntityStore();
            case "auth_group_permissions"     : return (EntityStore<ENTITY>) authGroupPermissionsHolder.getEntityStore();
            case "auth_permission"            : return (EntityStore<ENTITY>) authPermissionHolder.getEntityStore();
            case "auth_user"                  : return (EntityStore<ENTITY>) authUserHolder.getEntityStore();
            case "auth_user_groups"           : return (EntityStore<ENTITY>) authUserGroupsHolder.getEntityStore();
            case "auth_user_user_permissions" : return (EntityStore<ENTITY>) authUserUserPermissionsHolder.getEntityStore();
            case "CalendarView"               : return (EntityStore<ENTITY>) calendarViewHolder.getEntityStore();
            case "captcha_captchastore"       : return (EntityStore<ENTITY>) captchaCaptchastoreHolder.getEntityStore();
            case "django_admin_log"           : return (EntityStore<ENTITY>) djangoAdminLogHolder.getEntityStore();
            case "django_content_type"        : return (EntityStore<ENTITY>) djangoContentTypeHolder.getEntityStore();
            case "django_migrations"          : return (EntityStore<ENTITY>) djangoMigrationsHolder.getEntityStore();
            case "django_session"             : return (EntityStore<ENTITY>) djangoSessionHolder.getEntityStore();
            case "homePIX_album"              : return (EntityStore<ENTITY>) homePixAlbumHolder.getEntityStore();
            case "homePIX_albumcontent"       : return (EntityStore<ENTITY>) homePixAlbumcontentHolder.getEntityStore();
            case "homePIX_comment"            : return (EntityStore<ENTITY>) homePixCommentHolder.getEntityStore();
            case "homePIX_csvcontent"         : return (EntityStore<ENTITY>) homePixCsvcontentHolder.getEntityStore();
            case "homePIX_csventry"           : return (EntityStore<ENTITY>) homePixCsventryHolder.getEntityStore();
            case "homePIX_directory"          : return (EntityStore<ENTITY>) homePixDirectoryHolder.getEntityStore();
            case "homePIX_keywords"           : return (EntityStore<ENTITY>) homePixKeywordsHolder.getEntityStore();
            case "homePIX_picturefile"        : return (EntityStore<ENTITY>) homePixPicturefileHolder.getEntityStore();
            case "imports"                    : return (EntityStore<ENTITY>) importsHolder.getEntityStore();
            case "sqlite_sequence"            : return (EntityStore<ENTITY>) sqliteSequenceHolder.getEntityStore();
            default : throw new UnsupportedOperationException(
                String.format("Could not find '%s' in database model.", tableName)
            );
        }
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <ENTITY, CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<ENTITY> columnId) {
        switch (columnId.getTableId()) {
            case "AlbumView"                  : return (CACHE) albumViewHolder.getFieldCache((ColumnIdentifier<AlbumView>) columnId);
            case "auth_group"                 : return (CACHE) authGroupHolder.getFieldCache((ColumnIdentifier<AuthGroup>) columnId);
            case "auth_group_permissions"     : return (CACHE) authGroupPermissionsHolder.getFieldCache((ColumnIdentifier<AuthGroupPermissions>) columnId);
            case "auth_permission"            : return (CACHE) authPermissionHolder.getFieldCache((ColumnIdentifier<AuthPermission>) columnId);
            case "auth_user"                  : return (CACHE) authUserHolder.getFieldCache((ColumnIdentifier<AuthUser>) columnId);
            case "auth_user_groups"           : return (CACHE) authUserGroupsHolder.getFieldCache((ColumnIdentifier<AuthUserGroups>) columnId);
            case "auth_user_user_permissions" : return (CACHE) authUserUserPermissionsHolder.getFieldCache((ColumnIdentifier<AuthUserUserPermissions>) columnId);
            case "CalendarView"               : return (CACHE) calendarViewHolder.getFieldCache((ColumnIdentifier<CalendarView>) columnId);
            case "captcha_captchastore"       : return (CACHE) captchaCaptchastoreHolder.getFieldCache((ColumnIdentifier<CaptchaCaptchastore>) columnId);
            case "django_admin_log"           : return (CACHE) djangoAdminLogHolder.getFieldCache((ColumnIdentifier<DjangoAdminLog>) columnId);
            case "django_content_type"        : return (CACHE) djangoContentTypeHolder.getFieldCache((ColumnIdentifier<DjangoContentType>) columnId);
            case "django_migrations"          : return (CACHE) djangoMigrationsHolder.getFieldCache((ColumnIdentifier<DjangoMigrations>) columnId);
            case "django_session"             : return (CACHE) djangoSessionHolder.getFieldCache((ColumnIdentifier<DjangoSession>) columnId);
            case "homePIX_album"              : return (CACHE) homePixAlbumHolder.getFieldCache((ColumnIdentifier<HomePixAlbum>) columnId);
            case "homePIX_albumcontent"       : return (CACHE) homePixAlbumcontentHolder.getFieldCache((ColumnIdentifier<HomePixAlbumcontent>) columnId);
            case "homePIX_comment"            : return (CACHE) homePixCommentHolder.getFieldCache((ColumnIdentifier<HomePixComment>) columnId);
            case "homePIX_csvcontent"         : return (CACHE) homePixCsvcontentHolder.getFieldCache((ColumnIdentifier<HomePixCsvcontent>) columnId);
            case "homePIX_csventry"           : return (CACHE) homePixCsventryHolder.getFieldCache((ColumnIdentifier<HomePixCsventry>) columnId);
            case "homePIX_directory"          : return (CACHE) homePixDirectoryHolder.getFieldCache((ColumnIdentifier<HomePixDirectory>) columnId);
            case "homePIX_keywords"           : return (CACHE) homePixKeywordsHolder.getFieldCache((ColumnIdentifier<HomePixKeywords>) columnId);
            case "homePIX_picturefile"        : return (CACHE) homePixPicturefileHolder.getFieldCache((ColumnIdentifier<HomePixPicturefile>) columnId);
            case "imports"                    : return (CACHE) importsHolder.getFieldCache((ColumnIdentifier<Imports>) columnId);
            case "sqlite_sequence"            : return (CACHE) sqliteSequenceHolder.getFieldCache((ColumnIdentifier<SqliteSequence>) columnId);
            default : throw new UnsupportedOperationException(
                String.format("Could not find '%s' in database model.", columnId.getTableId())
            );
        }
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <ENTITY, T0, T1, CACHE extends MultiFieldCache<T0, T1, CACHE>> Optional<CACHE> getMultiFieldCache(ColumnIdentifier<ENTITY> firstColumnId, ColumnIdentifier<ENTITY> secondColumnId) {
        return Optional.empty(); // No multi-indexes are used in the project
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <ENTITY> boolean isHavingMultiFieldCache(ColumnIdentifier<ENTITY> columnId) {
        return false; // No multi-indexes are used in the project
    }
    
    @Override
    public void close() {
        holders().forEach(EntityStoreHolder::close);
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.create(
            holders()
                .toArray(EntityStoreHolder[]::new)
        );
    }
    
    @Override
    public Stream<EntityStoreHolder<?>> holders() {
        return Stream.of(
            albumViewHolder,
            authGroupHolder,
            authGroupPermissionsHolder,
            authPermissionHolder,
            authUserHolder,
            authUserGroupsHolder,
            authUserUserPermissionsHolder,
            calendarViewHolder,
            captchaCaptchastoreHolder,
            djangoAdminLogHolder,
            djangoContentTypeHolder,
            djangoMigrationsHolder,
            djangoSessionHolder,
            homePixAlbumHolder,
            homePixAlbumcontentHolder,
            homePixCommentHolder,
            homePixCsvcontentHolder,
            homePixCsventryHolder,
            homePixDirectoryHolder,
            homePixKeywordsHolder,
            homePixPicturefileHolder,
            importsHolder,
            sqliteSequenceHolder
        );
    }
}