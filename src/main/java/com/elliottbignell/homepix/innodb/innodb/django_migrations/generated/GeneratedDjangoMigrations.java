package com.elliottbignell.homepix.innodb.innodb.django_migrations.generated;

import com.elliottbignell.homepix.innodb.innodb.django_migrations.DjangoMigrations;
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

/**
 * The generated base for the {@link
 * com.elliottbignell.homepix.innodb.innodb.django_migrations.DjangoMigrations}-interface
 * representing entities of the {@code django_migrations}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedDjangoMigrations {
    
    /**
     * This Field corresponds to the {@link DjangoMigrations} field that can be
     * obtained using the {@link DjangoMigrations#getId()} method.
     */
    ComparableField<DjangoMigrations, Byte, Byte> ID = DatastoreFields.createComparableField(
        Identifier.ID,
        o -> OptionalUtil.unwrap(o.getId()),
        DjangoMigrations::setId,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link DjangoMigrations} field that can be
     * obtained using the {@link DjangoMigrations#getApp()} method.
     */
    StringField<DjangoMigrations, String> APP = DatastoreFields.createStringField(
        Identifier.APP,
        o -> OptionalUtil.unwrap(o.getApp()),
        DjangoMigrations::setApp,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link DjangoMigrations} field that can be
     * obtained using the {@link DjangoMigrations#getName()} method.
     */
    StringField<DjangoMigrations, String> NAME = DatastoreFields.createStringField(
        Identifier.NAME,
        o -> OptionalUtil.unwrap(o.getName()),
        DjangoMigrations::setName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link DjangoMigrations} field that can be
     * obtained using the {@link DjangoMigrations#getApplied()} method.
     */
    ComparableField<DjangoMigrations, Timestamp, Timestamp> APPLIED = DatastoreFields.createComparableField(
        Identifier.APPLIED,
        o -> OptionalUtil.unwrap(o.getApplied()),
        DjangoMigrations::setApplied,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this DjangoMigrations. The id field corresponds to the
     * database column innodb.innodb.django_migrations.id.
     * 
     * @return the id of this DjangoMigrations
     */
    Optional<Byte> getId();
    
    /**
     * Returns the app of this DjangoMigrations. The app field corresponds to
     * the database column innodb.innodb.django_migrations.app.
     * 
     * @return the app of this DjangoMigrations
     */
    Optional<String> getApp();
    
    /**
     * Returns the name of this DjangoMigrations. The name field corresponds to
     * the database column innodb.innodb.django_migrations.name.
     * 
     * @return the name of this DjangoMigrations
     */
    Optional<String> getName();
    
    /**
     * Returns the applied of this DjangoMigrations. The applied field
     * corresponds to the database column
     * innodb.innodb.django_migrations.applied.
     * 
     * @return the applied of this DjangoMigrations
     */
    Optional<Timestamp> getApplied();
    
    /**
     * Sets the id of this DjangoMigrations. The id field corresponds to the
     * database column innodb.innodb.django_migrations.id.
     * 
     * @param id to set of this DjangoMigrations
     * @return   this DjangoMigrations instance
     */
    DjangoMigrations setId(Byte id);
    
    /**
     * Sets the app of this DjangoMigrations. The app field corresponds to the
     * database column innodb.innodb.django_migrations.app.
     * 
     * @param app to set of this DjangoMigrations
     * @return    this DjangoMigrations instance
     */
    DjangoMigrations setApp(String app);
    
    /**
     * Sets the name of this DjangoMigrations. The name field corresponds to the
     * database column innodb.innodb.django_migrations.name.
     * 
     * @param name to set of this DjangoMigrations
     * @return     this DjangoMigrations instance
     */
    DjangoMigrations setName(String name);
    
    /**
     * Sets the applied of this DjangoMigrations. The applied field corresponds
     * to the database column innodb.innodb.django_migrations.applied.
     * 
     * @param applied to set of this DjangoMigrations
     * @return        this DjangoMigrations instance
     */
    DjangoMigrations setApplied(Timestamp applied);
    
    enum Identifier implements ColumnIdentifier<DjangoMigrations> {
        
        ID      ("id"),
        APP     ("app"),
        NAME    ("name"),
        APPLIED ("applied");
        
        private final String columnId;
        private final TableIdentifier<DjangoMigrations> tableIdentifier;
        
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
            return "django_migrations";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<DjangoMigrations> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}