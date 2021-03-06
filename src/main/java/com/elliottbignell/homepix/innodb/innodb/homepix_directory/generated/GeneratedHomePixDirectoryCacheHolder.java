package com.elliottbignell.homepix.innodb.innodb.homepix_directory.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_directory.HomePixDirectory;
import com.elliottbignell.homepix.innodb.innodb.homepix_directory.HomePixDirectoryEntityStoreSerializerImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_directory.HomePixDirectoryManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfByte;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfInt;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfShort;
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
 * HomePixDirectoryManager}.
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
public final class GeneratedHomePixDirectoryCacheHolder implements EntityStoreHolder<HomePixDirectory> {
    
    private final EntityStore<HomePixDirectory> entityStore;
    private final OfShort fieldIdCache;
    private final OfString fieldPathCache;
    private final OfByte fieldCountCache;
    private final OfString fieldRemoteKeyCache;
    private final OfInt fieldRemoteIdCache;
    private final OfString fieldThumbnailIdCache;
    private final OfByte fieldHitsCache;
    
    public GeneratedHomePixDirectoryCacheHolder(
            EntityStore<HomePixDirectory> entityStore,
            OfShort fieldIdCache,
            OfString fieldPathCache,
            OfByte fieldCountCache,
            OfString fieldRemoteKeyCache,
            OfInt fieldRemoteIdCache,
            OfString fieldThumbnailIdCache,
            OfByte fieldHitsCache) {
        
        this.entityStore           = requireNonNull(entityStore);
        this.fieldIdCache          = requireNonNull(fieldIdCache);
        this.fieldPathCache        = requireNonNull(fieldPathCache);
        this.fieldCountCache       = requireNonNull(fieldCountCache);
        this.fieldRemoteKeyCache   = requireNonNull(fieldRemoteKeyCache);
        this.fieldRemoteIdCache    = requireNonNull(fieldRemoteIdCache);
        this.fieldThumbnailIdCache = requireNonNull(fieldThumbnailIdCache);
        this.fieldHitsCache        = requireNonNull(fieldHitsCache);
    }
    
    @Override
    public EntityStore<HomePixDirectory> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<HomePixDirectory> columnId) {
        if (columnId instanceof HomePixDirectory.Identifier) {
            final HomePixDirectory.Identifier _id = (HomePixDirectory.Identifier) columnId;
            switch (_id) {
                case ID           : return (CACHE) fieldIdCache;
                case PATH         : return (CACHE) fieldPathCache;
                case COUNT        : return (CACHE) fieldCountCache;
                case REMOTE_KEY   : return (CACHE) fieldRemoteKeyCache;
                case REMOTE_ID    : return (CACHE) fieldRemoteIdCache;
                case THUMBNAIL_ID : return (CACHE) fieldThumbnailIdCache;
                case HITS         : return (CACHE) fieldHitsCache;
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
                case "path"         : return (CACHE) fieldPathCache;
                case "count"        : return (CACHE) fieldCountCache;
                case "remote_key"   : return (CACHE) fieldRemoteKeyCache;
                case "remote_id"    : return (CACHE) fieldRemoteIdCache;
                case "thumbnail_id" : return (CACHE) fieldThumbnailIdCache;
                case "hits"         : return (CACHE) fieldHitsCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<HomePixDirectory> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedHomePixDirectoryCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            HomePixDirectoryEntityStoreSerializerImpl::new,
            TableIdentifier.of("innodb", "innodb", "homePIX_directory")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<HomePixDirectory> recycleAndPersist(PersistOperation<HomePixDirectory> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<HomePixDirectory> recycleAndRemove(RemoveOperation<HomePixDirectory> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<HomePixDirectory> recycleAndUpdate(UpdateOperation<HomePixDirectory> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<HomePixDirectory> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<HomePixDirectory>, FieldCache<?>>>of(
            Tuples.of(HomePixDirectory.ID,          fieldIdCache),
            Tuples.of(HomePixDirectory.PATH,        fieldPathCache),
            Tuples.of(HomePixDirectory.COUNT,       fieldCountCache),
            Tuples.of(HomePixDirectory.REMOTE_KEY,  fieldRemoteKeyCache),
            Tuples.of(HomePixDirectory.REMOTE_ID,   fieldRemoteIdCache),
            Tuples.of(HomePixDirectory.THUMBNAIL_ID,fieldThumbnailIdCache),
            Tuples.of(HomePixDirectory.HITS,        fieldHitsCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<HomePixDirectory>> columnIdentifiers = Stream.<HasIdentifier<HomePixDirectory>>of(
            HomePixDirectory.ID,
            HomePixDirectory.PATH,
            HomePixDirectory.COUNT,
            HomePixDirectory.REMOTE_KEY,
            HomePixDirectory.REMOTE_ID,
            HomePixDirectory.THUMBNAIL_ID,
            HomePixDirectory.HITS
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
    
    public static CompletableFuture<GeneratedHomePixDirectoryCacheHolder> reload(CompletableFuture<EntityStore<HomePixDirectory>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfShort> fieldIdCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, HomePixDirectory.ID, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldPathCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, HomePixDirectory.PATH, 0);
        
        final CompletableFuture<FieldCache.OfByte> fieldCountCacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, HomePixDirectory.COUNT, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldRemoteKeyCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, HomePixDirectory.REMOTE_KEY, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldRemoteIdCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, HomePixDirectory.REMOTE_ID, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldThumbnailIdCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, HomePixDirectory.THUMBNAIL_ID, 0);
        
        final CompletableFuture<FieldCache.OfByte> fieldHitsCacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, HomePixDirectory.HITS, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedHomePixDirectoryCacheHolder(
                    entityStore,
                    fieldIdCacheFuture.get(),
                    fieldPathCacheFuture.get(),
                    fieldCountCacheFuture.get(),
                    fieldRemoteKeyCacheFuture.get(),
                    fieldRemoteIdCacheFuture.get(),
                    fieldThumbnailIdCacheFuture.get(),
                    fieldHitsCacheFuture.get()
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
        fieldPathCache.close();
        fieldCountCache.close();
        fieldRemoteKeyCache.close();
        fieldRemoteIdCache.close();
        fieldThumbnailIdCache.close();
        fieldHitsCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                HomePixDirectory.Identifier.ID,
                HomePixDirectory.Identifier.PATH,
                HomePixDirectory.Identifier.COUNT,
                HomePixDirectory.Identifier.REMOTE_KEY,
                HomePixDirectory.Identifier.REMOTE_ID,
                HomePixDirectory.Identifier.THUMBNAIL_ID,
                HomePixDirectory.Identifier.HITS
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}