package com.elliottbignell.homepix.innodb.innodb.django_content_type.generated;

import com.elliottbignell.homepix.innodb.innodb.django_content_type.DjangoContentType;
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
 * com.elliottbignell.homepix.innodb.innodb.django_content_type.DjangoContentType}-interface
 * representing entities of the {@code django_content_type}-table in the
 * database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedDjangoContentType {
    
    /**
     * This Field corresponds to the {@link DjangoContentType} field that can be
     * obtained using the {@link DjangoContentType#getId()} method.
     */
    ComparableField<DjangoContentType, Byte, Byte> ID = DatastoreFields.createComparableField(
        Identifier.ID,
        o -> OptionalUtil.unwrap(o.getId()),
        DjangoContentType::setId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link DjangoContentType} field that can be
     * obtained using the {@link DjangoContentType#getAppLabel()} method.
     */
    StringField<DjangoContentType, String> APP_LABEL = DatastoreFields.createStringField(
        Identifier.APP_LABEL,
        o -> OptionalUtil.unwrap(o.getAppLabel()),
        DjangoContentType::setAppLabel,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link DjangoContentType} field that can be
     * obtained using the {@link DjangoContentType#getModel()} method.
     */
    StringField<DjangoContentType, String> MODEL = DatastoreFields.createStringField(
        Identifier.MODEL,
        o -> OptionalUtil.unwrap(o.getModel()),
        DjangoContentType::setModel,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this DjangoContentType. The id field corresponds to the
     * database column innodb.innodb.django_content_type.id.
     * 
     * @return the id of this DjangoContentType
     */
    Optional<Byte> getId();
    
    /**
     * Returns the appLabel of this DjangoContentType. The appLabel field
     * corresponds to the database column
     * innodb.innodb.django_content_type.app_label.
     * 
     * @return the appLabel of this DjangoContentType
     */
    Optional<String> getAppLabel();
    
    /**
     * Returns the model of this DjangoContentType. The model field corresponds
     * to the database column innodb.innodb.django_content_type.model.
     * 
     * @return the model of this DjangoContentType
     */
    Optional<String> getModel();
    
    /**
     * Sets the id of this DjangoContentType. The id field corresponds to the
     * database column innodb.innodb.django_content_type.id.
     * 
     * @param id to set of this DjangoContentType
     * @return   this DjangoContentType instance
     */
    DjangoContentType setId(Byte id);
    
    /**
     * Sets the appLabel of this DjangoContentType. The appLabel field
     * corresponds to the database column
     * innodb.innodb.django_content_type.app_label.
     * 
     * @param appLabel to set of this DjangoContentType
     * @return         this DjangoContentType instance
     */
    DjangoContentType setAppLabel(String appLabel);
    
    /**
     * Sets the model of this DjangoContentType. The model field corresponds to
     * the database column innodb.innodb.django_content_type.model.
     * 
     * @param model to set of this DjangoContentType
     * @return      this DjangoContentType instance
     */
    DjangoContentType setModel(String model);
    
    enum Identifier implements ColumnIdentifier<DjangoContentType> {
        
        ID        ("id"),
        APP_LABEL ("app_label"),
        MODEL     ("model");
        
        private final String columnId;
        private final TableIdentifier<DjangoContentType> tableIdentifier;
        
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
            return "django_content_type";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<DjangoContentType> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}