package com.elliottbignell.homepix.innodb.innodb.homepix_directory.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_directory.HomePixDirectory;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.field.DatastoreFields;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * com.elliottbignell.homepix.innodb.innodb.homepix_directory.HomePixDirectory}-interface
 * representing entities of the {@code homePIX_directory}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedHomePixDirectory {
    
    /**
     * This Field corresponds to the {@link HomePixDirectory} field that can be
     * obtained using the {@link HomePixDirectory#getId()} method.
     */
    ComparableField<HomePixDirectory, Short, Short> ID = DatastoreFields.createComparableField(
        Identifier.ID,
        o -> OptionalUtil.unwrap(o.getId()),
        HomePixDirectory::setId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixDirectory} field that can be
     * obtained using the {@link HomePixDirectory#getPath()} method.
     */
    StringField<HomePixDirectory, String> PATH = DatastoreFields.createStringField(
        Identifier.PATH,
        o -> OptionalUtil.unwrap(o.getPath()),
        HomePixDirectory::setPath,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixDirectory} field that can be
     * obtained using the {@link HomePixDirectory#getCount()} method.
     */
    ComparableField<HomePixDirectory, Byte, Byte> COUNT = DatastoreFields.createComparableField(
        Identifier.COUNT,
        o -> OptionalUtil.unwrap(o.getCount()),
        HomePixDirectory::setCount,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixDirectory} field that can be
     * obtained using the {@link HomePixDirectory#getRemoteKey()} method.
     */
    StringField<HomePixDirectory, String> REMOTE_KEY = DatastoreFields.createStringField(
        Identifier.REMOTE_KEY,
        o -> OptionalUtil.unwrap(o.getRemoteKey()),
        HomePixDirectory::setRemoteKey,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixDirectory} field that can be
     * obtained using the {@link HomePixDirectory#getRemoteId()} method.
     */
    ComparableField<HomePixDirectory, Integer, Integer> REMOTE_ID = DatastoreFields.createComparableField(
        Identifier.REMOTE_ID,
        o -> OptionalUtil.unwrap(o.getRemoteId()),
        HomePixDirectory::setRemoteId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixDirectory} field that can be
     * obtained using the {@link HomePixDirectory#getThumbnailId()} method.
     */
    StringField<HomePixDirectory, String> THUMBNAIL_ID = DatastoreFields.createStringField(
        Identifier.THUMBNAIL_ID,
        o -> OptionalUtil.unwrap(o.getThumbnailId()),
        HomePixDirectory::setThumbnailId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixDirectory} field that can be
     * obtained using the {@link HomePixDirectory#getHits()} method.
     */
    ComparableField<HomePixDirectory, Byte, Byte> HITS = DatastoreFields.createComparableField(
        Identifier.HITS,
        o -> OptionalUtil.unwrap(o.getHits()),
        HomePixDirectory::setHits,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this HomePixDirectory. The id field corresponds to the
     * database column innodb.innodb.homePIX_directory.id.
     * 
     * @return the id of this HomePixDirectory
     */
    Optional<Short> getId();
    
    /**
     * Returns the path of this HomePixDirectory. The path field corresponds to
     * the database column innodb.innodb.homePIX_directory.path.
     * 
     * @return the path of this HomePixDirectory
     */
    Optional<String> getPath();
    
    /**
     * Returns the count of this HomePixDirectory. The count field corresponds
     * to the database column innodb.innodb.homePIX_directory.count.
     * 
     * @return the count of this HomePixDirectory
     */
    Optional<Byte> getCount();
    
    /**
     * Returns the remoteKey of this HomePixDirectory. The remoteKey field
     * corresponds to the database column
     * innodb.innodb.homePIX_directory.remote_key.
     * 
     * @return the remoteKey of this HomePixDirectory
     */
    Optional<String> getRemoteKey();
    
    /**
     * Returns the remoteId of this HomePixDirectory. The remoteId field
     * corresponds to the database column
     * innodb.innodb.homePIX_directory.remote_id.
     * 
     * @return the remoteId of this HomePixDirectory
     */
    OptionalInt getRemoteId();
    
    /**
     * Returns the thumbnailId of this HomePixDirectory. The thumbnailId field
     * corresponds to the database column
     * innodb.innodb.homePIX_directory.thumbnail_id.
     * 
     * @return the thumbnailId of this HomePixDirectory
     */
    Optional<String> getThumbnailId();
    
    /**
     * Returns the hits of this HomePixDirectory. The hits field corresponds to
     * the database column innodb.innodb.homePIX_directory.hits.
     * 
     * @return the hits of this HomePixDirectory
     */
    Optional<Byte> getHits();
    
    /**
     * Sets the id of this HomePixDirectory. The id field corresponds to the
     * database column innodb.innodb.homePIX_directory.id.
     * 
     * @param id to set of this HomePixDirectory
     * @return   this HomePixDirectory instance
     */
    HomePixDirectory setId(Short id);
    
    /**
     * Sets the path of this HomePixDirectory. The path field corresponds to the
     * database column innodb.innodb.homePIX_directory.path.
     * 
     * @param path to set of this HomePixDirectory
     * @return     this HomePixDirectory instance
     */
    HomePixDirectory setPath(String path);
    
    /**
     * Sets the count of this HomePixDirectory. The count field corresponds to
     * the database column innodb.innodb.homePIX_directory.count.
     * 
     * @param count to set of this HomePixDirectory
     * @return      this HomePixDirectory instance
     */
    HomePixDirectory setCount(Byte count);
    
    /**
     * Sets the remoteKey of this HomePixDirectory. The remoteKey field
     * corresponds to the database column
     * innodb.innodb.homePIX_directory.remote_key.
     * 
     * @param remoteKey to set of this HomePixDirectory
     * @return          this HomePixDirectory instance
     */
    HomePixDirectory setRemoteKey(String remoteKey);
    
    /**
     * Sets the remoteId of this HomePixDirectory. The remoteId field
     * corresponds to the database column
     * innodb.innodb.homePIX_directory.remote_id.
     * 
     * @param remoteId to set of this HomePixDirectory
     * @return         this HomePixDirectory instance
     */
    HomePixDirectory setRemoteId(Integer remoteId);
    
    /**
     * Sets the thumbnailId of this HomePixDirectory. The thumbnailId field
     * corresponds to the database column
     * innodb.innodb.homePIX_directory.thumbnail_id.
     * 
     * @param thumbnailId to set of this HomePixDirectory
     * @return            this HomePixDirectory instance
     */
    HomePixDirectory setThumbnailId(String thumbnailId);
    
    /**
     * Sets the hits of this HomePixDirectory. The hits field corresponds to the
     * database column innodb.innodb.homePIX_directory.hits.
     * 
     * @param hits to set of this HomePixDirectory
     * @return     this HomePixDirectory instance
     */
    HomePixDirectory setHits(Byte hits);
    
    enum Identifier implements ColumnIdentifier<HomePixDirectory> {
        
        ID           ("id"),
        PATH         ("path"),
        COUNT        ("count"),
        REMOTE_KEY   ("remote_key"),
        REMOTE_ID    ("remote_id"),
        THUMBNAIL_ID ("thumbnail_id"),
        HITS         ("hits");
        
        private final String columnId;
        private final TableIdentifier<HomePixDirectory> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "innodb";
        }
        
        @Override
        public String getSchemaId() {
            return "innodb";
        }
        
        @Override
        public String getTableId() {
            return "homePIX_directory";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<HomePixDirectory> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}