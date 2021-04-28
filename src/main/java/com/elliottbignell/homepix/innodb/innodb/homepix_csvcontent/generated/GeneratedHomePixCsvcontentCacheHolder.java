package com.elliottbignell.homepix.innodb.innodb.homepix_csvcontent.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_csvcontent.HomePixCsvcontent;
import com.elliottbignell.homepix.innodb.innodb.homepix_csvcontent.HomePixCsvcontentEntityStoreSerializerImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_csvcontent.HomePixCsvcontentManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfInt;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfShort;
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
 * HomePixCsvcontentManager}.
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
public final class GeneratedHomePixCsvcontentCacheHolder implements EntityStoreHolder<HomePixCsvcontent> {
    
    private final EntityStore<HomePixCsvcontent> entityStore;
    private final OfShort fieldIdCache;
    private final OfInt fieldEntryIdCache;
    private final OfInt fieldPicturefileIdCache;
    
    public GeneratedHomePixCsvcontentCacheHolder(
            EntityStore<HomePixCsvcontent> entityStore,
            OfShort fieldIdCache,
            OfInt fieldEntryIdCache,
            OfInt fieldPicturefileIdCache) {
        
        this.entityStore             = requireNonNull(entityStore);
        this.fieldIdCache            = requireNonNull(fieldIdCache);
        this.fieldEntryIdCache       = requireNonNull(fieldEntryIdCache);
        this.fieldPicturefileIdCache = requireNonNull(fieldPicturefileIdCache);
    }
    
    @Override
    public EntityStore<HomePixCsvcontent> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<HomePixCsvcontent> columnId) {
        if (columnId instanceof HomePixCsvcontent.Identifier) {
            final HomePixCsvcontent.Identifier _id = (HomePixCsvcontent.Identifier) columnId;
            switch (_id) {
                case ID             : return (CACHE) fieldIdCache;
                case ENTRY_ID       : return (CACHE) fieldEntryIdCache;
                case PICTUREFILE_ID : return (CACHE) fieldPicturefileIdCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "id"             : return (CACHE) fieldIdCache;
                case "entry_id"       : return (CACHE) fieldEntryIdCache;
                case "picturefile_id" : return (CACHE) fieldPicturefileIdCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<HomePixCsvcontent> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedHomePixCsvcontentCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            HomePixCsvcontentEntityStoreSerializerImpl::new,
            TableIdentifier.of("innodb", "innodb", "homePIX_csvcontent")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<HomePixCsvcontent> recycleAndPersist(PersistOperation<HomePixCsvcontent> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<HomePixCsvcontent> recycleAndRemove(RemoveOperation<HomePixCsvcontent> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<HomePixCsvcontent> recycleAndUpdate(UpdateOperation<HomePixCsvcontent> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<HomePixCsvcontent> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<HomePixCsvcontent>, FieldCache<?>>>of(
            Tuples.of(HomePixCsvcontent.ID,            fieldIdCache),
            Tuples.of(HomePixCsvcontent.ENTRY_ID,      fieldEntryIdCache),
            Tuples.of(HomePixCsvcontent.PICTUREFILE_ID,fieldPicturefileIdCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<HomePixCsvcontent>> columnIdentifiers = Stream.<HasIdentifier<HomePixCsvcontent>>of(
            HomePixCsvcontent.ID,
            HomePixCsvcontent.ENTRY_ID,
            HomePixCsvcontent.PICTUREFILE_ID
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
    
    public static CompletableFuture<GeneratedHomePixCsvcontentCacheHolder> reload(CompletableFuture<EntityStore<HomePixCsvcontent>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfShort> fieldIdCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, HomePixCsvcontent.ID, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldEntryIdCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, HomePixCsvcontent.ENTRY_ID, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldPicturefileIdCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, HomePixCsvcontent.PICTUREFILE_ID, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedHomePixCsvcontentCacheHolder(
                    entityStore,
                    fieldIdCacheFuture.get(),
                    fieldEntryIdCacheFuture.get(),
                    fieldPicturefileIdCacheFuture.get()
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
        fieldEntryIdCache.close();
        fieldPicturefileIdCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                HomePixCsvcontent.Identifier.ID,
                HomePixCsvcontent.Identifier.ENTRY_ID,
                HomePixCsvcontent.Identifier.PICTUREFILE_ID
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}