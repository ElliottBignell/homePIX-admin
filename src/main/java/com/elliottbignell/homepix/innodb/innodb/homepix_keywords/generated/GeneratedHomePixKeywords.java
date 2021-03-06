package com.elliottbignell.homepix.innodb.innodb.homepix_keywords.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_keywords.HomePixKeywords;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.field.DatastoreFields;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;

/**
 * The generated base for the {@link
 * com.elliottbignell.homepix.innodb.innodb.homepix_keywords.HomePixKeywords}-interface
 * representing entities of the {@code homePIX_keywords}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedHomePixKeywords {
    
    /**
     * This Field corresponds to the {@link HomePixKeywords} field that can be
     * obtained using the {@link HomePixKeywords#getId()} method.
     */
    ComparableField<HomePixKeywords, Short, Short> ID = DatastoreFields.createComparableField(
        Identifier.ID,
        o -> OptionalUtil.unwrap(o.getId()),
        HomePixKeywords::setId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixKeywords} field that can be
     * obtained using the {@link HomePixKeywords#getKeywords()} method.
     */
    StringField<HomePixKeywords, String> KEYWORDS = DatastoreFields.createStringField(
        Identifier.KEYWORDS,
        o -> OptionalUtil.unwrap(o.getKeywords()),
        HomePixKeywords::setKeywords,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HomePixKeywords} field that can be
     * obtained using the {@link HomePixKeywords#getCount()} method.
     */
    ComparableField<HomePixKeywords, Byte, Byte> COUNT = DatastoreFields.createComparableField(
        Identifier.COUNT,
        o -> OptionalUtil.unwrap(o.getCount()),
        HomePixKeywords::setCount,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this HomePixKeywords. The id field corresponds to the
     * database column innodb.innodb.homePIX_keywords.id.
     * 
     * @return the id of this HomePixKeywords
     */
    Optional<Short> getId();
    
    /**
     * Returns the keywords of this HomePixKeywords. The keywords field
     * corresponds to the database column
     * innodb.innodb.homePIX_keywords.keywords.
     * 
     * @return the keywords of this HomePixKeywords
     */
    Optional<String> getKeywords();
    
    /**
     * Returns the count of this HomePixKeywords. The count field corresponds to
     * the database column innodb.innodb.homePIX_keywords.count.
     * 
     * @return the count of this HomePixKeywords
     */
    Optional<Byte> getCount();
    
    /**
     * Sets the id of this HomePixKeywords. The id field corresponds to the
     * database column innodb.innodb.homePIX_keywords.id.
     * 
     * @param id to set of this HomePixKeywords
     * @return   this HomePixKeywords instance
     */
    HomePixKeywords setId(Short id);
    
    /**
     * Sets the keywords of this HomePixKeywords. The keywords field corresponds
     * to the database column innodb.innodb.homePIX_keywords.keywords.
     * 
     * @param keywords to set of this HomePixKeywords
     * @return         this HomePixKeywords instance
     */
    HomePixKeywords setKeywords(String keywords);
    
    /**
     * Sets the count of this HomePixKeywords. The count field corresponds to
     * the database column innodb.innodb.homePIX_keywords.count.
     * 
     * @param count to set of this HomePixKeywords
     * @return      this HomePixKeywords instance
     */
    HomePixKeywords setCount(Byte count);
    
    enum Identifier implements ColumnIdentifier<HomePixKeywords> {
        
        ID       ("id"),
        KEYWORDS ("keywords"),
        COUNT    ("count");
        
        private final String columnId;
        private final TableIdentifier<HomePixKeywords> tableIdentifier;
        
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
            return "homePIX_keywords";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<HomePixKeywords> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}