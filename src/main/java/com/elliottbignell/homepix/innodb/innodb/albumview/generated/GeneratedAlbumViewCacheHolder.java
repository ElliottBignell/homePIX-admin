package com.elliottbignell.homepix.innodb.innodb.albumview.generated;

import com.elliottbignell.homepix.innodb.innodb.albumview.AlbumView;
import com.elliottbignell.homepix.innodb.innodb.albumview.AlbumViewEntityStoreSerializerImpl;
import com.elliottbignell.homepix.innodb.innodb.albumview.AlbumViewManager;
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
 * AlbumViewManager}.
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
public final class GeneratedAlbumViewCacheHolder implements EntityStoreHolder<AlbumView> {
    
    private final EntityStore<AlbumView> entityStore;
    private final OfShort fieldIdCache;
    private final OfByte fieldAlbumIdCache;
    private final OfInt fieldEntryIdCache;
    private final OfInt fieldId1Cache;
    private final OfString fieldFileCache;
    private final OfString fieldTitleCache;
    private final OfString fieldSortkeyCache;
    private final OfString fieldAddedOnCache;
    private final OfString fieldTakenOnCache;
    private final OfString fieldLastModifiedCache;
    private final OfString fieldLocationCache;
    private final OfString fieldPrimaryCategoryCache;
    private final OfString fieldSecondaryCategoryCache;
    private final OfString fieldKeywordsIdCache;
    private final OfShort fieldPathIdCache;
    private final OfByte fieldHitsCache;
    private final OfByte fieldId2Cache;
    private final OfString fieldNameCache;
    private final OfByte fieldCountCache;
    private final OfInt fieldThumbnailIdCache;
    private final OfByte fieldHits1Cache;
    
    public GeneratedAlbumViewCacheHolder(
            EntityStore<AlbumView> entityStore,
            OfShort fieldIdCache,
            OfByte fieldAlbumIdCache,
            OfInt fieldEntryIdCache,
            OfInt fieldId1Cache,
            OfString fieldFileCache,
            OfString fieldTitleCache,
            OfString fieldSortkeyCache,
            OfString fieldAddedOnCache,
            OfString fieldTakenOnCache,
            OfString fieldLastModifiedCache,
            OfString fieldLocationCache,
            OfString fieldPrimaryCategoryCache,
            OfString fieldSecondaryCategoryCache,
            OfString fieldKeywordsIdCache,
            OfShort fieldPathIdCache,
            OfByte fieldHitsCache,
            OfByte fieldId2Cache,
            OfString fieldNameCache,
            OfByte fieldCountCache,
            OfInt fieldThumbnailIdCache,
            OfByte fieldHits1Cache) {
        
        this.entityStore                 = requireNonNull(entityStore);
        this.fieldIdCache                = requireNonNull(fieldIdCache);
        this.fieldAlbumIdCache           = requireNonNull(fieldAlbumIdCache);
        this.fieldEntryIdCache           = requireNonNull(fieldEntryIdCache);
        this.fieldId1Cache               = requireNonNull(fieldId1Cache);
        this.fieldFileCache              = requireNonNull(fieldFileCache);
        this.fieldTitleCache             = requireNonNull(fieldTitleCache);
        this.fieldSortkeyCache           = requireNonNull(fieldSortkeyCache);
        this.fieldAddedOnCache           = requireNonNull(fieldAddedOnCache);
        this.fieldTakenOnCache           = requireNonNull(fieldTakenOnCache);
        this.fieldLastModifiedCache      = requireNonNull(fieldLastModifiedCache);
        this.fieldLocationCache          = requireNonNull(fieldLocationCache);
        this.fieldPrimaryCategoryCache   = requireNonNull(fieldPrimaryCategoryCache);
        this.fieldSecondaryCategoryCache = requireNonNull(fieldSecondaryCategoryCache);
        this.fieldKeywordsIdCache        = requireNonNull(fieldKeywordsIdCache);
        this.fieldPathIdCache            = requireNonNull(fieldPathIdCache);
        this.fieldHitsCache              = requireNonNull(fieldHitsCache);
        this.fieldId2Cache               = requireNonNull(fieldId2Cache);
        this.fieldNameCache              = requireNonNull(fieldNameCache);
        this.fieldCountCache             = requireNonNull(fieldCountCache);
        this.fieldThumbnailIdCache       = requireNonNull(fieldThumbnailIdCache);
        this.fieldHits1Cache             = requireNonNull(fieldHits1Cache);
    }
    
    @Override
    public EntityStore<AlbumView> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<AlbumView> columnId) {
        if (columnId instanceof AlbumView.Identifier) {
            final AlbumView.Identifier _id = (AlbumView.Identifier) columnId;
            switch (_id) {
                case ID                 : return (CACHE) fieldIdCache;
                case ALBUM_ID           : return (CACHE) fieldAlbumIdCache;
                case ENTRY_ID           : return (CACHE) fieldEntryIdCache;
                case ID1                : return (CACHE) fieldId1Cache;
                case FILE               : return (CACHE) fieldFileCache;
                case TITLE              : return (CACHE) fieldTitleCache;
                case SORTKEY            : return (CACHE) fieldSortkeyCache;
                case ADDED_ON           : return (CACHE) fieldAddedOnCache;
                case TAKEN_ON           : return (CACHE) fieldTakenOnCache;
                case LAST_MODIFIED      : return (CACHE) fieldLastModifiedCache;
                case LOCATION           : return (CACHE) fieldLocationCache;
                case PRIMARY_CATEGORY   : return (CACHE) fieldPrimaryCategoryCache;
                case SECONDARY_CATEGORY : return (CACHE) fieldSecondaryCategoryCache;
                case KEYWORDS_ID        : return (CACHE) fieldKeywordsIdCache;
                case PATH_ID            : return (CACHE) fieldPathIdCache;
                case HITS               : return (CACHE) fieldHitsCache;
                case ID2                : return (CACHE) fieldId2Cache;
                case NAME               : return (CACHE) fieldNameCache;
                case COUNT              : return (CACHE) fieldCountCache;
                case THUMBNAIL_ID       : return (CACHE) fieldThumbnailIdCache;
                case HITS1              : return (CACHE) fieldHits1Cache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "id"                : return (CACHE) fieldIdCache;
                case "album_id"          : return (CACHE) fieldAlbumIdCache;
                case "entry_id"          : return (CACHE) fieldEntryIdCache;
                case "id:1"              : return (CACHE) fieldId1Cache;
                case "file"              : return (CACHE) fieldFileCache;
                case "title"             : return (CACHE) fieldTitleCache;
                case "sortkey"           : return (CACHE) fieldSortkeyCache;
                case "added_on"          : return (CACHE) fieldAddedOnCache;
                case "taken_on"          : return (CACHE) fieldTakenOnCache;
                case "last_modified"     : return (CACHE) fieldLastModifiedCache;
                case "location"          : return (CACHE) fieldLocationCache;
                case "primaryCategory"   : return (CACHE) fieldPrimaryCategoryCache;
                case "secondaryCategory" : return (CACHE) fieldSecondaryCategoryCache;
                case "keywords_id"       : return (CACHE) fieldKeywordsIdCache;
                case "path_id"           : return (CACHE) fieldPathIdCache;
                case "hits"              : return (CACHE) fieldHitsCache;
                case "id:2"              : return (CACHE) fieldId2Cache;
                case "name"              : return (CACHE) fieldNameCache;
                case "count"             : return (CACHE) fieldCountCache;
                case "thumbnail_id"      : return (CACHE) fieldThumbnailIdCache;
                case "hits:1"            : return (CACHE) fieldHits1Cache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<AlbumView> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedAlbumViewCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            AlbumViewEntityStoreSerializerImpl::new,
            TableIdentifier.of("innodb", "innodb", "AlbumView")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<AlbumView> recycleAndPersist(PersistOperation<AlbumView> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<AlbumView> recycleAndRemove(RemoveOperation<AlbumView> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<AlbumView> recycleAndUpdate(UpdateOperation<AlbumView> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<AlbumView> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<AlbumView>, FieldCache<?>>>of(
            Tuples.of(AlbumView.ID,                fieldIdCache),
            Tuples.of(AlbumView.ALBUM_ID,          fieldAlbumIdCache),
            Tuples.of(AlbumView.ENTRY_ID,          fieldEntryIdCache),
            Tuples.of(AlbumView.ID1,               fieldId1Cache),
            Tuples.of(AlbumView.FILE,              fieldFileCache),
            Tuples.of(AlbumView.TITLE,             fieldTitleCache),
            Tuples.of(AlbumView.SORTKEY,           fieldSortkeyCache),
            Tuples.of(AlbumView.ADDED_ON,          fieldAddedOnCache),
            Tuples.of(AlbumView.TAKEN_ON,          fieldTakenOnCache),
            Tuples.of(AlbumView.LAST_MODIFIED,     fieldLastModifiedCache),
            Tuples.of(AlbumView.LOCATION,          fieldLocationCache),
            Tuples.of(AlbumView.PRIMARY_CATEGORY,  fieldPrimaryCategoryCache),
            Tuples.of(AlbumView.SECONDARY_CATEGORY,fieldSecondaryCategoryCache),
            Tuples.of(AlbumView.KEYWORDS_ID,       fieldKeywordsIdCache),
            Tuples.of(AlbumView.PATH_ID,           fieldPathIdCache),
            Tuples.of(AlbumView.HITS,              fieldHitsCache),
            Tuples.of(AlbumView.ID2,               fieldId2Cache),
            Tuples.of(AlbumView.NAME,              fieldNameCache),
            Tuples.of(AlbumView.COUNT,             fieldCountCache),
            Tuples.of(AlbumView.THUMBNAIL_ID,      fieldThumbnailIdCache),
            Tuples.of(AlbumView.HITS1,             fieldHits1Cache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<AlbumView>> columnIdentifiers = Stream.<HasIdentifier<AlbumView>>of(
            AlbumView.ID,
            AlbumView.ALBUM_ID,
            AlbumView.ENTRY_ID,
            AlbumView.ID1,
            AlbumView.FILE,
            AlbumView.TITLE,
            AlbumView.SORTKEY,
            AlbumView.ADDED_ON,
            AlbumView.TAKEN_ON,
            AlbumView.LAST_MODIFIED,
            AlbumView.LOCATION,
            AlbumView.PRIMARY_CATEGORY,
            AlbumView.SECONDARY_CATEGORY,
            AlbumView.KEYWORDS_ID,
            AlbumView.PATH_ID,
            AlbumView.HITS,
            AlbumView.ID2,
            AlbumView.NAME,
            AlbumView.COUNT,
            AlbumView.THUMBNAIL_ID,
            AlbumView.HITS1
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
    
    public static CompletableFuture<GeneratedAlbumViewCacheHolder> reload(CompletableFuture<EntityStore<AlbumView>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfShort> fieldIdCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, AlbumView.ID, 0);
        
        final CompletableFuture<FieldCache.OfByte> fieldAlbumIdCacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, AlbumView.ALBUM_ID, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldEntryIdCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, AlbumView.ENTRY_ID, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldId1CacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, AlbumView.ID1, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldFileCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AlbumView.FILE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldTitleCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AlbumView.TITLE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldSortkeyCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AlbumView.SORTKEY, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldAddedOnCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AlbumView.ADDED_ON, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldTakenOnCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AlbumView.TAKEN_ON, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldLastModifiedCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AlbumView.LAST_MODIFIED, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldLocationCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AlbumView.LOCATION, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldPrimaryCategoryCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AlbumView.PRIMARY_CATEGORY, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldSecondaryCategoryCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AlbumView.SECONDARY_CATEGORY, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldKeywordsIdCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AlbumView.KEYWORDS_ID, 0);
        
        final CompletableFuture<FieldCache.OfShort> fieldPathIdCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, AlbumView.PATH_ID, 0);
        
        final CompletableFuture<FieldCache.OfByte> fieldHitsCacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, AlbumView.HITS, 0);
        
        final CompletableFuture<FieldCache.OfByte> fieldId2CacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, AlbumView.ID2, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldNameCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, AlbumView.NAME, 0);
        
        final CompletableFuture<FieldCache.OfByte> fieldCountCacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, AlbumView.COUNT, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldThumbnailIdCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, AlbumView.THUMBNAIL_ID, 0);
        
        final CompletableFuture<FieldCache.OfByte> fieldHits1CacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, AlbumView.HITS1, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedAlbumViewCacheHolder(
                    entityStore,
                    fieldIdCacheFuture.get(),
                    fieldAlbumIdCacheFuture.get(),
                    fieldEntryIdCacheFuture.get(),
                    fieldId1CacheFuture.get(),
                    fieldFileCacheFuture.get(),
                    fieldTitleCacheFuture.get(),
                    fieldSortkeyCacheFuture.get(),
                    fieldAddedOnCacheFuture.get(),
                    fieldTakenOnCacheFuture.get(),
                    fieldLastModifiedCacheFuture.get(),
                    fieldLocationCacheFuture.get(),
                    fieldPrimaryCategoryCacheFuture.get(),
                    fieldSecondaryCategoryCacheFuture.get(),
                    fieldKeywordsIdCacheFuture.get(),
                    fieldPathIdCacheFuture.get(),
                    fieldHitsCacheFuture.get(),
                    fieldId2CacheFuture.get(),
                    fieldNameCacheFuture.get(),
                    fieldCountCacheFuture.get(),
                    fieldThumbnailIdCacheFuture.get(),
                    fieldHits1CacheFuture.get()
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
        fieldAlbumIdCache.close();
        fieldEntryIdCache.close();
        fieldId1Cache.close();
        fieldFileCache.close();
        fieldTitleCache.close();
        fieldSortkeyCache.close();
        fieldAddedOnCache.close();
        fieldTakenOnCache.close();
        fieldLastModifiedCache.close();
        fieldLocationCache.close();
        fieldPrimaryCategoryCache.close();
        fieldSecondaryCategoryCache.close();
        fieldKeywordsIdCache.close();
        fieldPathIdCache.close();
        fieldHitsCache.close();
        fieldId2Cache.close();
        fieldNameCache.close();
        fieldCountCache.close();
        fieldThumbnailIdCache.close();
        fieldHits1Cache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                AlbumView.Identifier.ID,
                AlbumView.Identifier.ALBUM_ID,
                AlbumView.Identifier.ENTRY_ID,
                AlbumView.Identifier.ID1,
                AlbumView.Identifier.FILE,
                AlbumView.Identifier.TITLE,
                AlbumView.Identifier.SORTKEY,
                AlbumView.Identifier.ADDED_ON,
                AlbumView.Identifier.TAKEN_ON,
                AlbumView.Identifier.LAST_MODIFIED,
                AlbumView.Identifier.LOCATION,
                AlbumView.Identifier.PRIMARY_CATEGORY,
                AlbumView.Identifier.SECONDARY_CATEGORY,
                AlbumView.Identifier.KEYWORDS_ID,
                AlbumView.Identifier.PATH_ID,
                AlbumView.Identifier.HITS,
                AlbumView.Identifier.ID2,
                AlbumView.Identifier.NAME,
                AlbumView.Identifier.COUNT,
                AlbumView.Identifier.THUMBNAIL_ID,
                AlbumView.Identifier.HITS1
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}