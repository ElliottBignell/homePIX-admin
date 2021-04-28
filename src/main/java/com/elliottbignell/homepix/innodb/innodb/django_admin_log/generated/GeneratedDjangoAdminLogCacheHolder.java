package com.elliottbignell.homepix.innodb.innodb.django_admin_log.generated;

import com.elliottbignell.homepix.innodb.innodb.django_admin_log.DjangoAdminLog;
import com.elliottbignell.homepix.innodb.innodb.django_admin_log.DjangoAdminLogEntityStoreSerializerImpl;
import com.elliottbignell.homepix.innodb.innodb.django_admin_log.DjangoAdminLogManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfComparable;
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

import java.sql.Timestamp;
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
 * DjangoAdminLogManager}.
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
public final class GeneratedDjangoAdminLogCacheHolder implements EntityStoreHolder<DjangoAdminLog> {
    
    private final EntityStore<DjangoAdminLog> entityStore;
    private final OfString fieldIdCache;
    private final OfComparable<Timestamp> fieldActionTimeCache;
    private final OfString fieldObjectIdCache;
    private final OfString fieldObjectReprCache;
    private final OfString fieldChangeMessageCache;
    private final OfString fieldContentTypeIdCache;
    private final OfString fieldUserIdCache;
    private final OfString fieldActionFlagCache;
    
    public GeneratedDjangoAdminLogCacheHolder(
            EntityStore<DjangoAdminLog> entityStore,
            OfString fieldIdCache,
            OfComparable<Timestamp> fieldActionTimeCache,
            OfString fieldObjectIdCache,
            OfString fieldObjectReprCache,
            OfString fieldChangeMessageCache,
            OfString fieldContentTypeIdCache,
            OfString fieldUserIdCache,
            OfString fieldActionFlagCache) {
        
        this.entityStore             = requireNonNull(entityStore);
        this.fieldIdCache            = requireNonNull(fieldIdCache);
        this.fieldActionTimeCache    = requireNonNull(fieldActionTimeCache);
        this.fieldObjectIdCache      = requireNonNull(fieldObjectIdCache);
        this.fieldObjectReprCache    = requireNonNull(fieldObjectReprCache);
        this.fieldChangeMessageCache = requireNonNull(fieldChangeMessageCache);
        this.fieldContentTypeIdCache = requireNonNull(fieldContentTypeIdCache);
        this.fieldUserIdCache        = requireNonNull(fieldUserIdCache);
        this.fieldActionFlagCache    = requireNonNull(fieldActionFlagCache);
    }
    
    @Override
    public EntityStore<DjangoAdminLog> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<DjangoAdminLog> columnId) {
        if (columnId instanceof DjangoAdminLog.Identifier) {
            final DjangoAdminLog.Identifier _id = (DjangoAdminLog.Identifier) columnId;
            switch (_id) {
                case ID              : return (CACHE) fieldIdCache;
                case ACTION_TIME     : return (CACHE) fieldActionTimeCache;
                case OBJECT_ID       : return (CACHE) fieldObjectIdCache;
                case OBJECT_REPR     : return (CACHE) fieldObjectReprCache;
                case CHANGE_MESSAGE  : return (CACHE) fieldChangeMessageCache;
                case CONTENT_TYPE_ID : return (CACHE) fieldContentTypeIdCache;
                case USER_ID         : return (CACHE) fieldUserIdCache;
                case ACTION_FLAG     : return (CACHE) fieldActionFlagCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "id"              : return (CACHE) fieldIdCache;
                case "action_time"     : return (CACHE) fieldActionTimeCache;
                case "object_id"       : return (CACHE) fieldObjectIdCache;
                case "object_repr"     : return (CACHE) fieldObjectReprCache;
                case "change_message"  : return (CACHE) fieldChangeMessageCache;
                case "content_type_id" : return (CACHE) fieldContentTypeIdCache;
                case "user_id"         : return (CACHE) fieldUserIdCache;
                case "action_flag"     : return (CACHE) fieldActionFlagCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<DjangoAdminLog> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedDjangoAdminLogCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            DjangoAdminLogEntityStoreSerializerImpl::new,
            TableIdentifier.of("innodb", "innodb", "django_admin_log")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<DjangoAdminLog> recycleAndPersist(PersistOperation<DjangoAdminLog> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<DjangoAdminLog> recycleAndRemove(RemoveOperation<DjangoAdminLog> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<DjangoAdminLog> recycleAndUpdate(UpdateOperation<DjangoAdminLog> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<DjangoAdminLog> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<DjangoAdminLog>, FieldCache<?>>>of(
            Tuples.of(DjangoAdminLog.ID,             fieldIdCache),
            Tuples.of(DjangoAdminLog.ACTION_TIME,    fieldActionTimeCache),
            Tuples.of(DjangoAdminLog.OBJECT_ID,      fieldObjectIdCache),
            Tuples.of(DjangoAdminLog.OBJECT_REPR,    fieldObjectReprCache),
            Tuples.of(DjangoAdminLog.CHANGE_MESSAGE, fieldChangeMessageCache),
            Tuples.of(DjangoAdminLog.CONTENT_TYPE_ID,fieldContentTypeIdCache),
            Tuples.of(DjangoAdminLog.USER_ID,        fieldUserIdCache),
            Tuples.of(DjangoAdminLog.ACTION_FLAG,    fieldActionFlagCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<DjangoAdminLog>> columnIdentifiers = Stream.<HasIdentifier<DjangoAdminLog>>of(
            DjangoAdminLog.ID,
            DjangoAdminLog.ACTION_TIME,
            DjangoAdminLog.OBJECT_ID,
            DjangoAdminLog.OBJECT_REPR,
            DjangoAdminLog.CHANGE_MESSAGE,
            DjangoAdminLog.CONTENT_TYPE_ID,
            DjangoAdminLog.USER_ID,
            DjangoAdminLog.ACTION_FLAG
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
    
    public static CompletableFuture<GeneratedDjangoAdminLogCacheHolder> reload(CompletableFuture<EntityStore<DjangoAdminLog>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfString> fieldIdCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, DjangoAdminLog.ID, 0);
        
        final CompletableFuture<FieldCache.OfComparable<Timestamp>> fieldActionTimeCacheFuture =
            DataStoreHolderUtil.buildComparableCache(entityStoreFuture, executor, DjangoAdminLog.ACTION_TIME, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldObjectIdCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, DjangoAdminLog.OBJECT_ID, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldObjectReprCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, DjangoAdminLog.OBJECT_REPR, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldChangeMessageCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, DjangoAdminLog.CHANGE_MESSAGE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldContentTypeIdCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, DjangoAdminLog.CONTENT_TYPE_ID, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldUserIdCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, DjangoAdminLog.USER_ID, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldActionFlagCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, DjangoAdminLog.ACTION_FLAG, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedDjangoAdminLogCacheHolder(
                    entityStore,
                    fieldIdCacheFuture.get(),
                    fieldActionTimeCacheFuture.get(),
                    fieldObjectIdCacheFuture.get(),
                    fieldObjectReprCacheFuture.get(),
                    fieldChangeMessageCacheFuture.get(),
                    fieldContentTypeIdCacheFuture.get(),
                    fieldUserIdCacheFuture.get(),
                    fieldActionFlagCacheFuture.get()
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
        fieldActionTimeCache.close();
        fieldObjectIdCache.close();
        fieldObjectReprCache.close();
        fieldChangeMessageCache.close();
        fieldContentTypeIdCache.close();
        fieldUserIdCache.close();
        fieldActionFlagCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                DjangoAdminLog.Identifier.ID,
                DjangoAdminLog.Identifier.ACTION_TIME,
                DjangoAdminLog.Identifier.OBJECT_ID,
                DjangoAdminLog.Identifier.OBJECT_REPR,
                DjangoAdminLog.Identifier.CHANGE_MESSAGE,
                DjangoAdminLog.Identifier.CONTENT_TYPE_ID,
                DjangoAdminLog.Identifier.USER_ID,
                DjangoAdminLog.Identifier.ACTION_FLAG
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}