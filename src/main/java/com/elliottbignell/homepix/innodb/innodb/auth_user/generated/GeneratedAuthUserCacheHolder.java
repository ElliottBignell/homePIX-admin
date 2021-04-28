package com.elliottbignell.homepix.innodb.innodb.auth_user.generated;

import com.elliottbignell.homepix.innodb.innodb.auth_user.AuthUser;
import com.elliottbignell.homepix.innodb.innodb.auth_user.AuthUserEntityStoreSerializerImpl;
import com.elliottbignell.homepix.innodb.innodb.auth_user.AuthUserManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfByte;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfString;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache;
import com.speedment.enterprise.datastore.runtime.fieldcache.MultiFieldCache;
import com.speedment.enterprise.datastore.runtime.statistic.Statistics;
import com.speedment.enterprise.datastore.runtime.util.DataStoreHolderUtil;
import com.speedment.enterprise.datastore.runtime.util.StatisticsUtil;
import com.speedment.runtime.bulk.PersistOperation;
import com.speedment.runtime.bulk.RemoveOperation;
import com.speedment.runtime.bulk.UpdateOperation;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.ColumnLabel;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.StreamSupplierComponent;
import com.speedment.runtime.field.Field;
import com.speedment.runtime.field.trait.HasIdentifier;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

/**
 * A holder class for the various caches that are used to speed up the {@link
 * AuthUserManager}.
 * 
 * Generated by
 * com.speedment.enterprise.datastore.generator.internal.code.GeneratedEntityCacheHolderTranslator
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public final class GeneratedAuthUserCacheHolder implements EntityStoreHolder<AuthUser> {
    
    private final EntityStore<AuthUser> entityStore;
    private final OfByte fieldIdCache;
    private final OfString fieldPasswordCache;
    private final OfString fieldLastLoginCache;
    private final OfByte fieldIsSuperuserCache;
    private final OfString fieldUsernameCache;
    private final OfString fieldLastNameCache;
    private final OfString fieldEmailCache;
    private final OfByte fieldIsStaffCache;
    private final OfByte fieldIsActiveCache;
    private final OfString fieldDateJoinedCache;
    private final OfString fieldFirstNameCache;
    
    public GeneratedAuthUserCacheHolder(
            EntityStore<AuthUser> entityStore,
            OfByte fieldIdCache,
            OfString fieldPasswordCache,
            OfString fieldLastLoginCache,
            OfByte fieldIsSuperuserCache,
            OfString fieldUsernameCache,
            OfString fieldLastNameCache,
            OfString fieldEmailCache,
            OfByte fieldIsStaffCache,
            OfByte fieldIsActiveCache,
            OfString fieldDateJoinedCache,
            OfString fieldFirstNameCache) {
        
        this.entityStore           = requireNonNull(entityStore);
        this.fieldIdCache          = requireNonNull(fieldIdCache);
        this.fieldPasswordCache    = requireNonNull(fieldPasswordCache);
        this.fieldLastLoginCache   = requireNonNull(fieldLastLoginCache);
        this.fieldIsSuperuserCache = requireNonNull(fieldIsSuperuserCache);
        this.fieldUsernameCache    = requireNonNull(fieldUsernameCache);
        this.fieldLastNameCache    = requireNonNull(fieldLastNameCache);
        this.fieldEmailCache       = requireNonNull(fieldEmailCache);
        this.fieldIsStaffCache     = requireNonNull(fieldIsStaffCache);
        this.fieldIsActiveCache    = requireNonNull(fieldIsActiveCache);
        this.fieldDateJoinedCache  = requireNonNull(fieldDateJoinedCache);
        this.fieldFirstNameCache   = requireNonNull(fieldFirstNameCache);
    }
    
    @Override
    public EntityStore<AuthUser> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<AuthUser> columnId) {
        if (columnId instanceof AuthUser.Identifier) {
            final AuthUser.Identifier _id = (AuthUser.Identifier) columnId;
            switch (_id) {
                case ID           : return (CACHE) fieldIdCache;
                case PASSWORD     : return (CACHE) fieldPasswordCache;
                case LAST_LOGIN   : return (CACHE) fieldLastLoginCache;
                case IS_SUPERUSER : return (CACHE) fieldIsSuperuserCache;
                case USERNAME     : return (CACHE) fieldUsernameCache;
                case LAST_NAME    : return (CACHE) fieldLastNameCache;
                case EMAIL        : return (CACHE) fieldEmailCache;
                case IS_STAFF     : return (CACHE) fieldIsStaffCache;
                case IS_ACTIVE    : return (CACHE) fieldIsActiveCache;
                case DATE_JOINED  : return (CACHE) fieldDateJoinedCache;
                case FIRST_NAME   : return (CACHE) fieldFirstNameCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "id"           : return (CACHE) fieldIdCache;
                case "password"     : return (CACHE) fieldPasswordCache;
                case "last_login"   : return (CACHE) fieldLastLoginCache;
                case "is_superuser" : return (CACHE) fieldIsSuperuserCache;
                case "username"     : return (CACHE) fieldUsernameCache;
                case "last_name"    : return (CACHE) fieldLastNameCache;
                case "email"        : return (CACHE) fieldEmailCache;
                case "is_staff"     : return (CACHE) fieldIsStaffCache;
                case "is_active"    : return (CACHE) fieldIsActiveCache;
                case "date_joined"  : return (CACHE) fieldDateJoinedCache;
                case "first_name"   : return (CACHE) fieldFirstNameCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<AuthUser> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedAuthUserCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            AuthUserEntityStoreSerializerImpl::new,
            TableIdentifier.of("innodb", "innodb", "auth_user")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<AuthUser> recycleAndPersist(PersistOperation<AuthUser> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<AuthUser> recycleAndRemove(RemoveOperation<AuthUser> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<AuthUser> recycleAndUpdate(UpdateOperation<AuthUser> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<AuthUser> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<AuthUser>, FieldCache<?>>>of(
            Tuples.of(AuthUser.ID,          fieldIdCache),
            Tuples.of(AuthUser.PASSWORD,    fieldPasswordCache),
            Tuples.of(AuthUser.LAST_LOGIN,  fieldLastLoginCache),
            Tuples.of(AuthUser.IS_SUPERUSER,fieldIsSuperuserCache),
            Tuples.of(AuthUser.USERNAME,    fieldUsernameCache),
            Tuples.of(AuthUser.LAST_NAME,   fieldLastNameCache),
            Tuples.of(AuthUser.EMAIL,       fieldEmailCache),
            Tuples.of(AuthUser.IS_STAFF,    fieldIsStaffCache),
            Tuples.of(AuthUser.IS_ACTIVE,   fieldIsActiveCache),
            Tuples.of(AuthUser.DATE_JOINED, fieldDateJoinedCache),
            Tuples.of(AuthUser.FIRST_NAME,  fieldFirstNameCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<AuthUser>> columnIdentifiers = Stream.<HasIdentifier<AuthUser>>of(
            AuthUser.ID,
            AuthUser.PASSWORD,
            AuthUser.LAST_LOGIN,
            AuthUser.IS_SUPERUSER,
            AuthUser.USERNAME,
            AuthUser.LAST_NAME,
            AuthUser.EMAIL,
            AuthUser.IS_STAFF,
            AuthUser.IS_ACTIVE,
            AuthUser.DATE_JOINED,
            AuthUser.FIRST_NAME
        )
            .map(HasIdentifier::identifier)
            .collect(toSet());
        return EntityStoreHolder.of(
            entityStore,
            fieldCaches,
            multiFieldCaches,
            columnIdentifiers
        );
    }
    
    public static CompletableFuture<GeneratedAuthUserCacheHolder> reload(CompletableFuture<EntityStore<AuthUser>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfByte> fieldIdCacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, AuthUser.ID, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldPasswordCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AuthUser.PASSWORD, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldLastLoginCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AuthUser.LAST_LOGIN, 0);
        
        final CompletableFuture<FieldCache.OfByte> fieldIsSuperuserCacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, AuthUser.IS_SUPERUSER, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldUsernameCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AuthUser.USERNAME, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldLastNameCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AuthUser.LAST_NAME, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldEmailCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AuthUser.EMAIL, 0);
        
        final CompletableFuture<FieldCache.OfByte> fieldIsStaffCacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, AuthUser.IS_STAFF, 0);
        
        final CompletableFuture<FieldCache.OfByte> fieldIsActiveCacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, AuthUser.IS_ACTIVE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldDateJoinedCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AuthUser.DATE_JOINED, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldFirstNameCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AuthUser.FIRST_NAME, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedAuthUserCacheHolder(
                    entityStore,
                    fieldIdCacheFuture.get(),
                    fieldPasswordCacheFuture.get(),
                    fieldLastLoginCacheFuture.get(),
                    fieldIsSuperuserCacheFuture.get(),
                    fieldUsernameCacheFuture.get(),
                    fieldLastNameCacheFuture.get(),
                    fieldEmailCacheFuture.get(),
                    fieldIsStaffCacheFuture.get(),
                    fieldIsActiveCacheFuture.get(),
                    fieldDateJoinedCacheFuture.get(),
                    fieldFirstNameCacheFuture.get()
                );
            } catch (final ExecutionException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    
    @Override
    public void close() {
        entityStore.close();
        fieldIdCache.close();
        fieldPasswordCache.close();
        fieldLastLoginCache.close();
        fieldIsSuperuserCache.close();
        fieldUsernameCache.close();
        fieldLastNameCache.close();
        fieldEmailCache.close();
        fieldIsStaffCache.close();
        fieldIsActiveCache.close();
        fieldDateJoinedCache.close();
        fieldFirstNameCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                AuthUser.Identifier.ID,
                AuthUser.Identifier.PASSWORD,
                AuthUser.Identifier.LAST_LOGIN,
                AuthUser.Identifier.IS_SUPERUSER,
                AuthUser.Identifier.USERNAME,
                AuthUser.Identifier.LAST_NAME,
                AuthUser.Identifier.EMAIL,
                AuthUser.Identifier.IS_STAFF,
                AuthUser.Identifier.IS_ACTIVE,
                AuthUser.Identifier.DATE_JOINED,
                AuthUser.Identifier.FIRST_NAME
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}