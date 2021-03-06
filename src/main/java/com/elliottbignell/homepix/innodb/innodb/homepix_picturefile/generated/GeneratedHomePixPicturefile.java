package com.elliottbignell.homepix.innodb.innodb.homepix_picturefile.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_picturefile.HomePixPicturefile;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.field.DatastoreFields;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;

/**
 * The generated base for the {@link
 * com.elliottbignell.homepix.innodb.innodb.homepix_picturefile.HomePixPicturefile}-interface
 * representing entities of the {@code homePIX_picturefile}-table in the
 * database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedHomePixPicturefile {
    
    /**
     * This Field corresponds to the {@link HomePixPicturefile} field that can
     * be obtained using the {@link HomePixPicturefile#getId()} method.
     */
    ComparableField<HomePixPicturefile, Integer, Integer> ID = DatastoreFields.createComparableField(
        Identifier.ID,
        o -> OptionalUtil.unwrap(o.getId()),
        HomePixPicturefile::setId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixPicturefile} field that can
     * be obtained using the {@link HomePixPicturefile#getFile()} method.
     */
    StringField<HomePixPicturefile, String> FILE = DatastoreFields.createStringField(
        Identifier.FILE,
        o -> OptionalUtil.unwrap(o.getFile()),
        HomePixPicturefile::setFile,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixPicturefile} field that can
     * be obtained using the {@link HomePixPicturefile#getTitle()} method.
     */
    StringField<HomePixPicturefile, String> TITLE = DatastoreFields.createStringField(
        Identifier.TITLE,
        o -> OptionalUtil.unwrap(o.getTitle()),
        HomePixPicturefile::setTitle,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixPicturefile} field that can
     * be obtained using the {@link HomePixPicturefile#getSortkey()} method.
     */
    ComparableField<HomePixPicturefile, Long, Long> SORTKEY = DatastoreFields.createComparableField(
        Identifier.SORTKEY,
        o -> OptionalUtil.unwrap(o.getSortkey()),
        HomePixPicturefile::setSortkey,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixPicturefile} field that can
     * be obtained using the {@link HomePixPicturefile#getAddedOn()} method.
     */
    ComparableField<HomePixPicturefile, Timestamp, Timestamp> ADDED_ON = DatastoreFields.createComparableField(
        Identifier.ADDED_ON,
        o -> OptionalUtil.unwrap(o.getAddedOn()),
        HomePixPicturefile::setAddedOn,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixPicturefile} field that can
     * be obtained using the {@link HomePixPicturefile#getTakenOn()} method.
     */
    ComparableField<HomePixPicturefile, Timestamp, Timestamp> TAKEN_ON = DatastoreFields.createComparableField(
        Identifier.TAKEN_ON,
        o -> OptionalUtil.unwrap(o.getTakenOn()),
        HomePixPicturefile::setTakenOn,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixPicturefile} field that can
     * be obtained using the {@link HomePixPicturefile#getLastModified()}
     * method.
     */
    ComparableField<HomePixPicturefile, Timestamp, Timestamp> LAST_MODIFIED = DatastoreFields.createComparableField(
        Identifier.LAST_MODIFIED,
        o -> OptionalUtil.unwrap(o.getLastModified()),
        HomePixPicturefile::setLastModified,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixPicturefile} field that can
     * be obtained using the {@link HomePixPicturefile#getLocation()} method.
     */
    StringField<HomePixPicturefile, String> LOCATION = DatastoreFields.createStringField(
        Identifier.LOCATION,
        o -> OptionalUtil.unwrap(o.getLocation()),
        HomePixPicturefile::setLocation,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixPicturefile} field that can
     * be obtained using the {@link HomePixPicturefile#getPrimaryCategory()}
     * method.
     */
    StringField<HomePixPicturefile, String> PRIMARY_CATEGORY = DatastoreFields.createStringField(
        Identifier.PRIMARY_CATEGORY,
        o -> OptionalUtil.unwrap(o.getPrimaryCategory()),
        HomePixPicturefile::setPrimaryCategory,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixPicturefile} field that can
     * be obtained using the {@link HomePixPicturefile#getSecondaryCategory()}
     * method.
     */
    StringField<HomePixPicturefile, String> SECONDARY_CATEGORY = DatastoreFields.createStringField(
        Identifier.SECONDARY_CATEGORY,
        o -> OptionalUtil.unwrap(o.getSecondaryCategory()),
        HomePixPicturefile::setSecondaryCategory,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixPicturefile} field that can
     * be obtained using the {@link HomePixPicturefile#getKeywordsId()} method.
     */
    ComparableField<HomePixPicturefile, Integer, Integer> KEYWORDS_ID = DatastoreFields.createComparableField(
        Identifier.KEYWORDS_ID,
        o -> OptionalUtil.unwrap(o.getKeywordsId()),
        HomePixPicturefile::setKeywordsId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixPicturefile} field that can
     * be obtained using the {@link HomePixPicturefile#getPathId()} method.
     */
    ComparableField<HomePixPicturefile, Short, Short> PATH_ID = DatastoreFields.createComparableField(
        Identifier.PATH_ID,
        o -> OptionalUtil.unwrap(o.getPathId()),
        HomePixPicturefile::setPathId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixPicturefile} field that can
     * be obtained using the {@link HomePixPicturefile#getHits()} method.
     */
    ComparableField<HomePixPicturefile, Byte, Byte> HITS = DatastoreFields.createComparableField(
        Identifier.HITS,
        o -> OptionalUtil.unwrap(o.getHits()),
        HomePixPicturefile::setHits,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this HomePixPicturefile. The id field corresponds to
     * the database column innodb.innodb.homePIX_picturefile.id.
     * 
     * @return the id of this HomePixPicturefile
     */
    OptionalInt getId();
    
    /**
     * Returns the file of this HomePixPicturefile. The file field corresponds
     * to the database column innodb.innodb.homePIX_picturefile.file.
     * 
     * @return the file of this HomePixPicturefile
     */
    Optional<String> getFile();
    
    /**
     * Returns the title of this HomePixPicturefile. The title field corresponds
     * to the database column innodb.innodb.homePIX_picturefile.title.
     * 
     * @return the title of this HomePixPicturefile
     */
    Optional<String> getTitle();
    
    /**
     * Returns the sortkey of this HomePixPicturefile. The sortkey field
     * corresponds to the database column
     * innodb.innodb.homePIX_picturefile.sortkey.
     * 
     * @return the sortkey of this HomePixPicturefile
     */
    OptionalLong getSortkey();
    
    /**
     * Returns the addedOn of this HomePixPicturefile. The addedOn field
     * corresponds to the database column
     * innodb.innodb.homePIX_picturefile.added_on.
     * 
     * @return the addedOn of this HomePixPicturefile
     */
    Optional<Timestamp> getAddedOn();
    
    /**
     * Returns the takenOn of this HomePixPicturefile. The takenOn field
     * corresponds to the database column
     * innodb.innodb.homePIX_picturefile.taken_on.
     * 
     * @return the takenOn of this HomePixPicturefile
     */
    Optional<Timestamp> getTakenOn();
    
    /**
     * Returns the lastModified of this HomePixPicturefile. The lastModified
     * field corresponds to the database column
     * innodb.innodb.homePIX_picturefile.last_modified.
     * 
     * @return the lastModified of this HomePixPicturefile
     */
    Optional<Timestamp> getLastModified();
    
    /**
     * Returns the location of this HomePixPicturefile. The location field
     * corresponds to the database column
     * innodb.innodb.homePIX_picturefile.location.
     * 
     * @return the location of this HomePixPicturefile
     */
    Optional<String> getLocation();
    
    /**
     * Returns the primaryCategory of this HomePixPicturefile. The
     * primaryCategory field corresponds to the database column
     * innodb.innodb.homePIX_picturefile.primaryCategory.
     * 
     * @return the primaryCategory of this HomePixPicturefile
     */
    Optional<String> getPrimaryCategory();
    
    /**
     * Returns the secondaryCategory of this HomePixPicturefile. The
     * secondaryCategory field corresponds to the database column
     * innodb.innodb.homePIX_picturefile.secondaryCategory.
     * 
     * @return the secondaryCategory of this HomePixPicturefile
     */
    Optional<String> getSecondaryCategory();
    
    /**
     * Returns the keywordsId of this HomePixPicturefile. The keywordsId field
     * corresponds to the database column
     * innodb.innodb.homePIX_picturefile.keywords_id.
     * 
     * @return the keywordsId of this HomePixPicturefile
     */
    OptionalInt getKeywordsId();
    
    /**
     * Returns the pathId of this HomePixPicturefile. The pathId field
     * corresponds to the database column
     * innodb.innodb.homePIX_picturefile.path_id.
     * 
     * @return the pathId of this HomePixPicturefile
     */
    Optional<Short> getPathId();
    
    /**
     * Returns the hits of this HomePixPicturefile. The hits field corresponds
     * to the database column innodb.innodb.homePIX_picturefile.hits.
     * 
     * @return the hits of this HomePixPicturefile
     */
    Optional<Byte> getHits();
    
    /**
     * Sets the id of this HomePixPicturefile. The id field corresponds to the
     * database column innodb.innodb.homePIX_picturefile.id.
     * 
     * @param id to set of this HomePixPicturefile
     * @return   this HomePixPicturefile instance
     */
    HomePixPicturefile setId(Integer id);
    
    /**
     * Sets the file of this HomePixPicturefile. The file field corresponds to
     * the database column innodb.innodb.homePIX_picturefile.file.
     * 
     * @param file to set of this HomePixPicturefile
     * @return     this HomePixPicturefile instance
     */
    HomePixPicturefile setFile(String file);
    
    /**
     * Sets the title of this HomePixPicturefile. The title field corresponds to
     * the database column innodb.innodb.homePIX_picturefile.title.
     * 
     * @param title to set of this HomePixPicturefile
     * @return      this HomePixPicturefile instance
     */
    HomePixPicturefile setTitle(String title);
    
    /**
     * Sets the sortkey of this HomePixPicturefile. The sortkey field
     * corresponds to the database column
     * innodb.innodb.homePIX_picturefile.sortkey.
     * 
     * @param sortkey to set of this HomePixPicturefile
     * @return        this HomePixPicturefile instance
     */
    HomePixPicturefile setSortkey(Long sortkey);
    
    /**
     * Sets the addedOn of this HomePixPicturefile. The addedOn field
     * corresponds to the database column
     * innodb.innodb.homePIX_picturefile.added_on.
     * 
     * @param addedOn to set of this HomePixPicturefile
     * @return        this HomePixPicturefile instance
     */
    HomePixPicturefile setAddedOn(Timestamp addedOn);
    
    /**
     * Sets the takenOn of this HomePixPicturefile. The takenOn field
     * corresponds to the database column
     * innodb.innodb.homePIX_picturefile.taken_on.
     * 
     * @param takenOn to set of this HomePixPicturefile
     * @return        this HomePixPicturefile instance
     */
    HomePixPicturefile setTakenOn(Timestamp takenOn);
    
    /**
     * Sets the lastModified of this HomePixPicturefile. The lastModified field
     * corresponds to the database column
     * innodb.innodb.homePIX_picturefile.last_modified.
     * 
     * @param lastModified to set of this HomePixPicturefile
     * @return             this HomePixPicturefile instance
     */
    HomePixPicturefile setLastModified(Timestamp lastModified);
    
    /**
     * Sets the location of this HomePixPicturefile. The location field
     * corresponds to the database column
     * innodb.innodb.homePIX_picturefile.location.
     * 
     * @param location to set of this HomePixPicturefile
     * @return         this HomePixPicturefile instance
     */
    HomePixPicturefile setLocation(String location);
    
    /**
     * Sets the primaryCategory of this HomePixPicturefile. The primaryCategory
     * field corresponds to the database column
     * innodb.innodb.homePIX_picturefile.primaryCategory.
     * 
     * @param primaryCategory to set of this HomePixPicturefile
     * @return                this HomePixPicturefile instance
     */
    HomePixPicturefile setPrimaryCategory(String primaryCategory);
    
    /**
     * Sets the secondaryCategory of this HomePixPicturefile. The
     * secondaryCategory field corresponds to the database column
     * innodb.innodb.homePIX_picturefile.secondaryCategory.
     * 
     * @param secondaryCategory to set of this HomePixPicturefile
     * @return                  this HomePixPicturefile instance
     */
    HomePixPicturefile setSecondaryCategory(String secondaryCategory);
    
    /**
     * Sets the keywordsId of this HomePixPicturefile. The keywordsId field
     * corresponds to the database column
     * innodb.innodb.homePIX_picturefile.keywords_id.
     * 
     * @param keywordsId to set of this HomePixPicturefile
     * @return           this HomePixPicturefile instance
     */
    HomePixPicturefile setKeywordsId(Integer keywordsId);
    
    /**
     * Sets the pathId of this HomePixPicturefile. The pathId field corresponds
     * to the database column innodb.innodb.homePIX_picturefile.path_id.
     * 
     * @param pathId to set of this HomePixPicturefile
     * @return       this HomePixPicturefile instance
     */
    HomePixPicturefile setPathId(Short pathId);
    
    /**
     * Sets the hits of this HomePixPicturefile. The hits field corresponds to
     * the database column innodb.innodb.homePIX_picturefile.hits.
     * 
     * @param hits to set of this HomePixPicturefile
     * @return     this HomePixPicturefile instance
     */
    HomePixPicturefile setHits(Byte hits);
    
    enum Identifier implements ColumnIdentifier<HomePixPicturefile> {
        
        ID                 ("id"),
        FILE               ("file"),
        TITLE              ("title"),
        SORTKEY            ("sortkey"),
        ADDED_ON           ("added_on"),
        TAKEN_ON           ("taken_on"),
        LAST_MODIFIED      ("last_modified"),
        LOCATION           ("location"),
        PRIMARY_CATEGORY   ("primaryCategory"),
        SECONDARY_CATEGORY ("secondaryCategory"),
        KEYWORDS_ID        ("keywords_id"),
        PATH_ID            ("path_id"),
        HITS               ("hits");
        
        private final String columnId;
        private final TableIdentifier<HomePixPicturefile> tableIdentifier;
        
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
            return "homePIX_picturefile";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<HomePixPicturefile> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}