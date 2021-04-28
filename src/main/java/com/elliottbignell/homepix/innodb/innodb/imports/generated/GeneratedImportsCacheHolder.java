package com.elliottbignell.homepix.innodb.innodb.imports.generated;

import com.elliottbignell.homepix.innodb.innodb.imports.Imports;
import com.elliottbignell.homepix.innodb.innodb.imports.ImportsEntityStoreSerializerImpl;
import com.elliottbignell.homepix.innodb.innodb.imports.ImportsManager;
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
 * ImportsManager}.
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
public final class GeneratedImportsCacheHolder implements EntityStoreHolder<Imports> {
    
    private final EntityStore<Imports> entityStore;
    private final OfInt fieldIdCache;
    private final OfString fieldFileCache;
    private final OfString fieldTitleCache;
    private final OfString fieldSortkeyCache;
    private final OfString fieldAddedOnCache;
    private final OfString fieldLastModifiedCache;
    private final OfShort fieldKeywordsIdCache;
    private final OfShort fieldPathIdCache;
    private final OfString fieldLocationCache;
    private final OfString fieldPrimaryCategoryCache;
    private final OfString fieldSecondaryCategoryCache;
    private final OfString fieldTakenOnCache;
    private final OfInt fieldId1Cache;
    private final OfString fieldFilenameCache;
    private final OfString fieldImageRefCache;
    private final OfString fieldCaptionCache;
    private final OfString fieldTagsCache;
    private final OfString fieldLicenseTypeCache;
    private final OfString fieldUserNameCache;
    private final OfString fieldSuperTagsCache;
    private final OfString fieldLocation1Cache;
    private final OfByte fieldNumberOfPeopleCache;
    private final OfString fieldModelReleaseCache;
    private final OfString fieldIsTherePropertyCache;
    private final OfString fieldPropertyReleaseCache;
    private final OfString fieldPrimaryCategory1Cache;
    private final OfString fieldSecondaryCategory1Cache;
    private final OfString fieldImageTypeCache;
    private final OfString fieldExclusiveToAlamyCache;
    private final OfString fieldAdditionalInfoCache;
    private final OfString fieldStatusCache;
    private final OfString fieldDateTakenCache;
    private final OfString fieldTakenCache;
    private final OfString fieldShotCache;
    
    public GeneratedImportsCacheHolder(
            EntityStore<Imports> entityStore,
            OfInt fieldIdCache,
            OfString fieldFileCache,
            OfString fieldTitleCache,
            OfString fieldSortkeyCache,
            OfString fieldAddedOnCache,
            OfString fieldLastModifiedCache,
            OfShort fieldKeywordsIdCache,
            OfShort fieldPathIdCache,
            OfString fieldLocationCache,
            OfString fieldPrimaryCategoryCache,
            OfString fieldSecondaryCategoryCache,
            OfString fieldTakenOnCache,
            OfInt fieldId1Cache,
            OfString fieldFilenameCache,
            OfString fieldImageRefCache,
            OfString fieldCaptionCache,
            OfString fieldTagsCache,
            OfString fieldLicenseTypeCache,
            OfString fieldUserNameCache,
            OfString fieldSuperTagsCache,
            OfString fieldLocation1Cache,
            OfByte fieldNumberOfPeopleCache,
            OfString fieldModelReleaseCache,
            OfString fieldIsTherePropertyCache,
            OfString fieldPropertyReleaseCache,
            OfString fieldPrimaryCategory1Cache,
            OfString fieldSecondaryCategory1Cache,
            OfString fieldImageTypeCache,
            OfString fieldExclusiveToAlamyCache,
            OfString fieldAdditionalInfoCache,
            OfString fieldStatusCache,
            OfString fieldDateTakenCache,
            OfString fieldTakenCache,
            OfString fieldShotCache) {
        
        this.entityStore                  = requireNonNull(entityStore);
        this.fieldIdCache                 = requireNonNull(fieldIdCache);
        this.fieldFileCache               = requireNonNull(fieldFileCache);
        this.fieldTitleCache              = requireNonNull(fieldTitleCache);
        this.fieldSortkeyCache            = requireNonNull(fieldSortkeyCache);
        this.fieldAddedOnCache            = requireNonNull(fieldAddedOnCache);
        this.fieldLastModifiedCache       = requireNonNull(fieldLastModifiedCache);
        this.fieldKeywordsIdCache         = requireNonNull(fieldKeywordsIdCache);
        this.fieldPathIdCache             = requireNonNull(fieldPathIdCache);
        this.fieldLocationCache           = requireNonNull(fieldLocationCache);
        this.fieldPrimaryCategoryCache    = requireNonNull(fieldPrimaryCategoryCache);
        this.fieldSecondaryCategoryCache  = requireNonNull(fieldSecondaryCategoryCache);
        this.fieldTakenOnCache            = requireNonNull(fieldTakenOnCache);
        this.fieldId1Cache                = requireNonNull(fieldId1Cache);
        this.fieldFilenameCache           = requireNonNull(fieldFilenameCache);
        this.fieldImageRefCache           = requireNonNull(fieldImageRefCache);
        this.fieldCaptionCache            = requireNonNull(fieldCaptionCache);
        this.fieldTagsCache               = requireNonNull(fieldTagsCache);
        this.fieldLicenseTypeCache        = requireNonNull(fieldLicenseTypeCache);
        this.fieldUserNameCache           = requireNonNull(fieldUserNameCache);
        this.fieldSuperTagsCache          = requireNonNull(fieldSuperTagsCache);
        this.fieldLocation1Cache          = requireNonNull(fieldLocation1Cache);
        this.fieldNumberOfPeopleCache     = requireNonNull(fieldNumberOfPeopleCache);
        this.fieldModelReleaseCache       = requireNonNull(fieldModelReleaseCache);
        this.fieldIsTherePropertyCache    = requireNonNull(fieldIsTherePropertyCache);
        this.fieldPropertyReleaseCache    = requireNonNull(fieldPropertyReleaseCache);
        this.fieldPrimaryCategory1Cache   = requireNonNull(fieldPrimaryCategory1Cache);
        this.fieldSecondaryCategory1Cache = requireNonNull(fieldSecondaryCategory1Cache);
        this.fieldImageTypeCache          = requireNonNull(fieldImageTypeCache);
        this.fieldExclusiveToAlamyCache   = requireNonNull(fieldExclusiveToAlamyCache);
        this.fieldAdditionalInfoCache     = requireNonNull(fieldAdditionalInfoCache);
        this.fieldStatusCache             = requireNonNull(fieldStatusCache);
        this.fieldDateTakenCache          = requireNonNull(fieldDateTakenCache);
        this.fieldTakenCache              = requireNonNull(fieldTakenCache);
        this.fieldShotCache               = requireNonNull(fieldShotCache);
    }
    
    @Override
    public EntityStore<Imports> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<Imports> columnId) {
        if (columnId instanceof Imports.Identifier) {
            final Imports.Identifier _id = (Imports.Identifier) columnId;
            switch (_id) {
                case ID                  : return (CACHE) fieldIdCache;
                case FILE                : return (CACHE) fieldFileCache;
                case TITLE               : return (CACHE) fieldTitleCache;
                case SORTKEY             : return (CACHE) fieldSortkeyCache;
                case ADDED_ON            : return (CACHE) fieldAddedOnCache;
                case LAST_MODIFIED       : return (CACHE) fieldLastModifiedCache;
                case KEYWORDS_ID         : return (CACHE) fieldKeywordsIdCache;
                case PATH_ID             : return (CACHE) fieldPathIdCache;
                case LOCATION            : return (CACHE) fieldLocationCache;
                case PRIMARY_CATEGORY    : return (CACHE) fieldPrimaryCategoryCache;
                case SECONDARY_CATEGORY  : return (CACHE) fieldSecondaryCategoryCache;
                case TAKEN_ON            : return (CACHE) fieldTakenOnCache;
                case ID1                 : return (CACHE) fieldId1Cache;
                case FILENAME            : return (CACHE) fieldFilenameCache;
                case IMAGE_REF           : return (CACHE) fieldImageRefCache;
                case CAPTION             : return (CACHE) fieldCaptionCache;
                case TAGS                : return (CACHE) fieldTagsCache;
                case LICENSE_TYPE        : return (CACHE) fieldLicenseTypeCache;
                case USER_NAME           : return (CACHE) fieldUserNameCache;
                case SUPER_TAGS          : return (CACHE) fieldSuperTagsCache;
                case LOCATION1           : return (CACHE) fieldLocation1Cache;
                case NUMBER_OF_PEOPLE    : return (CACHE) fieldNumberOfPeopleCache;
                case MODEL_RELEASE       : return (CACHE) fieldModelReleaseCache;
                case IS_THERE_PROPERTY   : return (CACHE) fieldIsTherePropertyCache;
                case PROPERTY_RELEASE    : return (CACHE) fieldPropertyReleaseCache;
                case PRIMARY_CATEGORY1   : return (CACHE) fieldPrimaryCategory1Cache;
                case SECONDARY_CATEGORY1 : return (CACHE) fieldSecondaryCategory1Cache;
                case IMAGE_TYPE          : return (CACHE) fieldImageTypeCache;
                case EXCLUSIVE_TO_ALAMY  : return (CACHE) fieldExclusiveToAlamyCache;
                case ADDITIONAL_INFO     : return (CACHE) fieldAdditionalInfoCache;
                case STATUS              : return (CACHE) fieldStatusCache;
                case DATE_TAKEN          : return (CACHE) fieldDateTakenCache;
                case TAKEN               : return (CACHE) fieldTakenCache;
                case SHOT                : return (CACHE) fieldShotCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "id"                  : return (CACHE) fieldIdCache;
                case "file"                : return (CACHE) fieldFileCache;
                case "title"               : return (CACHE) fieldTitleCache;
                case "sortkey"             : return (CACHE) fieldSortkeyCache;
                case "added_on"            : return (CACHE) fieldAddedOnCache;
                case "last_modified"       : return (CACHE) fieldLastModifiedCache;
                case "keywords_id"         : return (CACHE) fieldKeywordsIdCache;
                case "path_id"             : return (CACHE) fieldPathIdCache;
                case "location"            : return (CACHE) fieldLocationCache;
                case "primaryCategory"     : return (CACHE) fieldPrimaryCategoryCache;
                case "secondaryCategory"   : return (CACHE) fieldSecondaryCategoryCache;
                case "taken_on"            : return (CACHE) fieldTakenOnCache;
                case "id:1"                : return (CACHE) fieldId1Cache;
                case "filename"            : return (CACHE) fieldFilenameCache;
                case "imageRef"            : return (CACHE) fieldImageRefCache;
                case "caption"             : return (CACHE) fieldCaptionCache;
                case "tags"                : return (CACHE) fieldTagsCache;
                case "licenseType"         : return (CACHE) fieldLicenseTypeCache;
                case "userName"            : return (CACHE) fieldUserNameCache;
                case "superTags"           : return (CACHE) fieldSuperTagsCache;
                case "location:1"          : return (CACHE) fieldLocation1Cache;
                case "numberOfPeople"      : return (CACHE) fieldNumberOfPeopleCache;
                case "modelRelease"        : return (CACHE) fieldModelReleaseCache;
                case "isThereProperty"     : return (CACHE) fieldIsTherePropertyCache;
                case "propertyRelease"     : return (CACHE) fieldPropertyReleaseCache;
                case "primaryCategory:1"   : return (CACHE) fieldPrimaryCategory1Cache;
                case "secondaryCategory:1" : return (CACHE) fieldSecondaryCategory1Cache;
                case "imageType"           : return (CACHE) fieldImageTypeCache;
                case "exclusiveToAlamy"    : return (CACHE) fieldExclusiveToAlamyCache;
                case "additionalInfo"      : return (CACHE) fieldAdditionalInfoCache;
                case "status"              : return (CACHE) fieldStatusCache;
                case "dateTaken"           : return (CACHE) fieldDateTakenCache;
                case "taken"               : return (CACHE) fieldTakenCache;
                case "shot"                : return (CACHE) fieldShotCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<Imports> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedImportsCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            ImportsEntityStoreSerializerImpl::new,
            TableIdentifier.of("innodb", "innodb", "imports")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<Imports> recycleAndPersist(PersistOperation<Imports> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<Imports> recycleAndRemove(RemoveOperation<Imports> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<Imports> recycleAndUpdate(UpdateOperation<Imports> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<Imports> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<Imports>, FieldCache<?>>>of(
            Tuples.of(Imports.ID,                 fieldIdCache),
            Tuples.of(Imports.FILE,               fieldFileCache),
            Tuples.of(Imports.TITLE,              fieldTitleCache),
            Tuples.of(Imports.SORTKEY,            fieldSortkeyCache),
            Tuples.of(Imports.ADDED_ON,           fieldAddedOnCache),
            Tuples.of(Imports.LAST_MODIFIED,      fieldLastModifiedCache),
            Tuples.of(Imports.KEYWORDS_ID,        fieldKeywordsIdCache),
            Tuples.of(Imports.PATH_ID,            fieldPathIdCache),
            Tuples.of(Imports.LOCATION,           fieldLocationCache),
            Tuples.of(Imports.PRIMARY_CATEGORY,   fieldPrimaryCategoryCache),
            Tuples.of(Imports.SECONDARY_CATEGORY, fieldSecondaryCategoryCache),
            Tuples.of(Imports.TAKEN_ON,           fieldTakenOnCache),
            Tuples.of(Imports.ID1,                fieldId1Cache),
            Tuples.of(Imports.FILENAME,           fieldFilenameCache),
            Tuples.of(Imports.IMAGE_REF,          fieldImageRefCache),
            Tuples.of(Imports.CAPTION,            fieldCaptionCache),
            Tuples.of(Imports.TAGS,               fieldTagsCache),
            Tuples.of(Imports.LICENSE_TYPE,       fieldLicenseTypeCache),
            Tuples.of(Imports.USER_NAME,          fieldUserNameCache),
            Tuples.of(Imports.SUPER_TAGS,         fieldSuperTagsCache),
            Tuples.of(Imports.LOCATION1,          fieldLocation1Cache),
            Tuples.of(Imports.NUMBER_OF_PEOPLE,   fieldNumberOfPeopleCache),
            Tuples.of(Imports.MODEL_RELEASE,      fieldModelReleaseCache),
            Tuples.of(Imports.IS_THERE_PROPERTY,  fieldIsTherePropertyCache),
            Tuples.of(Imports.PROPERTY_RELEASE,   fieldPropertyReleaseCache),
            Tuples.of(Imports.PRIMARY_CATEGORY1,  fieldPrimaryCategory1Cache),
            Tuples.of(Imports.SECONDARY_CATEGORY1,fieldSecondaryCategory1Cache),
            Tuples.of(Imports.IMAGE_TYPE,         fieldImageTypeCache),
            Tuples.of(Imports.EXCLUSIVE_TO_ALAMY, fieldExclusiveToAlamyCache),
            Tuples.of(Imports.ADDITIONAL_INFO,    fieldAdditionalInfoCache),
            Tuples.of(Imports.STATUS,             fieldStatusCache),
            Tuples.of(Imports.DATE_TAKEN,         fieldDateTakenCache),
            Tuples.of(Imports.TAKEN,              fieldTakenCache),
            Tuples.of(Imports.SHOT,               fieldShotCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<Imports>> columnIdentifiers = Stream.<HasIdentifier<Imports>>of(
            Imports.ID,
            Imports.FILE,
            Imports.TITLE,
            Imports.SORTKEY,
            Imports.ADDED_ON,
            Imports.LAST_MODIFIED,
            Imports.KEYWORDS_ID,
            Imports.PATH_ID,
            Imports.LOCATION,
            Imports.PRIMARY_CATEGORY,
            Imports.SECONDARY_CATEGORY,
            Imports.TAKEN_ON,
            Imports.ID1,
            Imports.FILENAME,
            Imports.IMAGE_REF,
            Imports.CAPTION,
            Imports.TAGS,
            Imports.LICENSE_TYPE,
            Imports.USER_NAME,
            Imports.SUPER_TAGS,
            Imports.LOCATION1,
            Imports.NUMBER_OF_PEOPLE,
            Imports.MODEL_RELEASE,
            Imports.IS_THERE_PROPERTY,
            Imports.PROPERTY_RELEASE,
            Imports.PRIMARY_CATEGORY1,
            Imports.SECONDARY_CATEGORY1,
            Imports.IMAGE_TYPE,
            Imports.EXCLUSIVE_TO_ALAMY,
            Imports.ADDITIONAL_INFO,
            Imports.STATUS,
            Imports.DATE_TAKEN,
            Imports.TAKEN,
            Imports.SHOT
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
    
    public static CompletableFuture<GeneratedImportsCacheHolder> reload(CompletableFuture<EntityStore<Imports>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfInt> fieldIdCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Imports.ID, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldFileCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.FILE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldTitleCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.TITLE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldSortkeyCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.SORTKEY, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldAddedOnCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.ADDED_ON, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldLastModifiedCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.LAST_MODIFIED, 0);
        
        final CompletableFuture<FieldCache.OfShort> fieldKeywordsIdCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, Imports.KEYWORDS_ID, 0);
        
        final CompletableFuture<FieldCache.OfShort> fieldPathIdCacheFuture =
            DataStoreHolderUtil.buildShortCache(entityStoreFuture, executor, Imports.PATH_ID, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldLocationCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.LOCATION, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldPrimaryCategoryCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.PRIMARY_CATEGORY, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldSecondaryCategoryCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.SECONDARY_CATEGORY, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldTakenOnCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.TAKEN_ON, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldId1CacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Imports.ID1, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldFilenameCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.FILENAME, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldImageRefCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.IMAGE_REF, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldCaptionCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.CAPTION, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldTagsCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.TAGS, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldLicenseTypeCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.LICENSE_TYPE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldUserNameCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.USER_NAME, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldSuperTagsCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.SUPER_TAGS, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldLocation1CacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.LOCATION1, 0);
        
        final CompletableFuture<FieldCache.OfByte> fieldNumberOfPeopleCacheFuture =
            DataStoreHolderUtil.buildByteCache(entityStoreFuture, executor, Imports.NUMBER_OF_PEOPLE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldModelReleaseCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.MODEL_RELEASE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldIsTherePropertyCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.IS_THERE_PROPERTY, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldPropertyReleaseCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.PROPERTY_RELEASE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldPrimaryCategory1CacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.PRIMARY_CATEGORY1, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldSecondaryCategory1CacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.SECONDARY_CATEGORY1, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldImageTypeCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.IMAGE_TYPE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldExclusiveToAlamyCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.EXCLUSIVE_TO_ALAMY, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldAdditionalInfoCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.ADDITIONAL_INFO, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldStatusCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.STATUS, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldDateTakenCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.DATE_TAKEN, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldTakenCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.TAKEN, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldShotCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Imports.SHOT, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedImportsCacheHolder(
                    entityStore,
                    fieldIdCacheFuture.get(),
                    fieldFileCacheFuture.get(),
                    fieldTitleCacheFuture.get(),
                    fieldSortkeyCacheFuture.get(),
                    fieldAddedOnCacheFuture.get(),
                    fieldLastModifiedCacheFuture.get(),
                    fieldKeywordsIdCacheFuture.get(),
                    fieldPathIdCacheFuture.get(),
                    fieldLocationCacheFuture.get(),
                    fieldPrimaryCategoryCacheFuture.get(),
                    fieldSecondaryCategoryCacheFuture.get(),
                    fieldTakenOnCacheFuture.get(),
                    fieldId1CacheFuture.get(),
                    fieldFilenameCacheFuture.get(),
                    fieldImageRefCacheFuture.get(),
                    fieldCaptionCacheFuture.get(),
                    fieldTagsCacheFuture.get(),
                    fieldLicenseTypeCacheFuture.get(),
                    fieldUserNameCacheFuture.get(),
                    fieldSuperTagsCacheFuture.get(),
                    fieldLocation1CacheFuture.get(),
                    fieldNumberOfPeopleCacheFuture.get(),
                    fieldModelReleaseCacheFuture.get(),
                    fieldIsTherePropertyCacheFuture.get(),
                    fieldPropertyReleaseCacheFuture.get(),
                    fieldPrimaryCategory1CacheFuture.get(),
                    fieldSecondaryCategory1CacheFuture.get(),
                    fieldImageTypeCacheFuture.get(),
                    fieldExclusiveToAlamyCacheFuture.get(),
                    fieldAdditionalInfoCacheFuture.get(),
                    fieldStatusCacheFuture.get(),
                    fieldDateTakenCacheFuture.get(),
                    fieldTakenCacheFuture.get(),
                    fieldShotCacheFuture.get()
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
        fieldFileCache.close();
        fieldTitleCache.close();
        fieldSortkeyCache.close();
        fieldAddedOnCache.close();
        fieldLastModifiedCache.close();
        fieldKeywordsIdCache.close();
        fieldPathIdCache.close();
        fieldLocationCache.close();
        fieldPrimaryCategoryCache.close();
        fieldSecondaryCategoryCache.close();
        fieldTakenOnCache.close();
        fieldId1Cache.close();
        fieldFilenameCache.close();
        fieldImageRefCache.close();
        fieldCaptionCache.close();
        fieldTagsCache.close();
        fieldLicenseTypeCache.close();
        fieldUserNameCache.close();
        fieldSuperTagsCache.close();
        fieldLocation1Cache.close();
        fieldNumberOfPeopleCache.close();
        fieldModelReleaseCache.close();
        fieldIsTherePropertyCache.close();
        fieldPropertyReleaseCache.close();
        fieldPrimaryCategory1Cache.close();
        fieldSecondaryCategory1Cache.close();
        fieldImageTypeCache.close();
        fieldExclusiveToAlamyCache.close();
        fieldAdditionalInfoCache.close();
        fieldStatusCache.close();
        fieldDateTakenCache.close();
        fieldTakenCache.close();
        fieldShotCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                Imports.Identifier.ID,
                Imports.Identifier.FILE,
                Imports.Identifier.TITLE,
                Imports.Identifier.SORTKEY,
                Imports.Identifier.ADDED_ON,
                Imports.Identifier.LAST_MODIFIED,
                Imports.Identifier.KEYWORDS_ID,
                Imports.Identifier.PATH_ID,
                Imports.Identifier.LOCATION,
                Imports.Identifier.PRIMARY_CATEGORY,
                Imports.Identifier.SECONDARY_CATEGORY,
                Imports.Identifier.TAKEN_ON,
                Imports.Identifier.ID1,
                Imports.Identifier.FILENAME,
                Imports.Identifier.IMAGE_REF,
                Imports.Identifier.CAPTION,
                Imports.Identifier.TAGS,
                Imports.Identifier.LICENSE_TYPE,
                Imports.Identifier.USER_NAME,
                Imports.Identifier.SUPER_TAGS,
                Imports.Identifier.LOCATION1,
                Imports.Identifier.NUMBER_OF_PEOPLE,
                Imports.Identifier.MODEL_RELEASE,
                Imports.Identifier.IS_THERE_PROPERTY,
                Imports.Identifier.PROPERTY_RELEASE,
                Imports.Identifier.PRIMARY_CATEGORY1,
                Imports.Identifier.SECONDARY_CATEGORY1,
                Imports.Identifier.IMAGE_TYPE,
                Imports.Identifier.EXCLUSIVE_TO_ALAMY,
                Imports.Identifier.ADDITIONAL_INFO,
                Imports.Identifier.STATUS,
                Imports.Identifier.DATE_TAKEN,
                Imports.Identifier.TAKEN,
                Imports.Identifier.SHOT
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}