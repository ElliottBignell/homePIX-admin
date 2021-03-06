package com.elliottbignell.homepix.innodb.innodb.homepix_album.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_album.HomePixAlbum;
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
 * com.elliottbignell.homepix.innodb.innodb.homepix_album.HomePixAlbum}-interface
 * representing entities of the {@code homePIX_album}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedHomePixAlbum {
    
    /**
     * This Field corresponds to the {@link HomePixAlbum} field that can be
     * obtained using the {@link HomePixAlbum#getId()} method.
     */
    ComparableField<HomePixAlbum, Byte, Byte> ID = DatastoreFields.createComparableField(
        Identifier.ID,
        o -> OptionalUtil.unwrap(o.getId()),
        HomePixAlbum::setId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixAlbum} field that can be
     * obtained using the {@link HomePixAlbum#getName()} method.
     */
    StringField<HomePixAlbum, String> NAME = DatastoreFields.createStringField(
        Identifier.NAME,
        o -> OptionalUtil.unwrap(o.getName()),
        HomePixAlbum::setName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixAlbum} field that can be
     * obtained using the {@link HomePixAlbum#getCount()} method.
     */
    ComparableField<HomePixAlbum, Byte, Byte> COUNT = DatastoreFields.createComparableField(
        Identifier.COUNT,
        o -> OptionalUtil.unwrap(o.getCount()),
        HomePixAlbum::setCount,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixAlbum} field that can be
     * obtained using the {@link HomePixAlbum#getThumbnailId()} method.
     */
    ComparableField<HomePixAlbum, Integer, Integer> THUMBNAIL_ID = DatastoreFields.createComparableField(
        Identifier.THUMBNAIL_ID,
        o -> OptionalUtil.unwrap(o.getThumbnailId()),
        HomePixAlbum::setThumbnailId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixAlbum} field that can be
     * obtained using the {@link HomePixAlbum#getHits()} method.
     */
    ComparableField<HomePixAlbum, Byte, Byte> HITS = DatastoreFields.createComparableField(
        Identifier.HITS,
        o -> OptionalUtil.unwrap(o.getHits()),
        HomePixAlbum::setHits,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this HomePixAlbum. The id field corresponds to the
     * database column innodb.innodb.homePIX_album.id.
     * 
     * @return the id of this HomePixAlbum
     */
    Optional<Byte> getId();
    
    /**
     * Returns the name of this HomePixAlbum. The name field corresponds to the
     * database column innodb.innodb.homePIX_album.name.
     * 
     * @return the name of this HomePixAlbum
     */
    Optional<String> getName();
    
    /**
     * Returns the count of this HomePixAlbum. The count field corresponds to
     * the database column innodb.innodb.homePIX_album.count.
     * 
     * @return the count of this HomePixAlbum
     */
    Optional<Byte> getCount();
    
    /**
     * Returns the thumbnailId of this HomePixAlbum. The thumbnailId field
     * corresponds to the database column
     * innodb.innodb.homePIX_album.thumbnail_id.
     * 
     * @return the thumbnailId of this HomePixAlbum
     */
    OptionalInt getThumbnailId();
    
    /**
     * Returns the hits of this HomePixAlbum. The hits field corresponds to the
     * database column innodb.innodb.homePIX_album.hits.
     * 
     * @return the hits of this HomePixAlbum
     */
    Optional<Byte> getHits();
    
    /**
     * Sets the id of this HomePixAlbum. The id field corresponds to the
     * database column innodb.innodb.homePIX_album.id.
     * 
     * @param id to set of this HomePixAlbum
     * @return   this HomePixAlbum instance
     */
    HomePixAlbum setId(Byte id);
    
    /**
     * Sets the name of this HomePixAlbum. The name field corresponds to the
     * database column innodb.innodb.homePIX_album.name.
     * 
     * @param name to set of this HomePixAlbum
     * @return     this HomePixAlbum instance
     */
    HomePixAlbum setName(String name);
    
    /**
     * Sets the count of this HomePixAlbum. The count field corresponds to the
     * database column innodb.innodb.homePIX_album.count.
     * 
     * @param count to set of this HomePixAlbum
     * @return      this HomePixAlbum instance
     */
    HomePixAlbum setCount(Byte count);
    
    /**
     * Sets the thumbnailId of this HomePixAlbum. The thumbnailId field
     * corresponds to the database column
     * innodb.innodb.homePIX_album.thumbnail_id.
     * 
     * @param thumbnailId to set of this HomePixAlbum
     * @return            this HomePixAlbum instance
     */
    HomePixAlbum setThumbnailId(Integer thumbnailId);
    
    /**
     * Sets the hits of this HomePixAlbum. The hits field corresponds to the
     * database column innodb.innodb.homePIX_album.hits.
     * 
     * @param hits to set of this HomePixAlbum
     * @return     this HomePixAlbum instance
     */
    HomePixAlbum setHits(Byte hits);
    
    enum Identifier implements ColumnIdentifier<HomePixAlbum> {
        
        ID           ("id"),
        NAME         ("name"),
        COUNT        ("count"),
        THUMBNAIL_ID ("thumbnail_id"),
        HITS         ("hits");
        
        private final String columnId;
        private final TableIdentifier<HomePixAlbum> tableIdentifier;
        
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
            return "homePIX_album";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<HomePixAlbum> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}