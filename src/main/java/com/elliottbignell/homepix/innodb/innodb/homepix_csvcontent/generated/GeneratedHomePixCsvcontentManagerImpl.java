package com.elliottbignell.homepix.innodb.innodb.homepix_csvcontent.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_csvcontent.HomePixCsvcontent;
import com.elliottbignell.homepix.innodb.innodb.homepix_csvcontent.HomePixCsvcontentImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_csvcontent.HomePixCsvcontentManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.elliottbignell.homepix.innodb.innodb.homepix_csvcontent.HomePixCsvcontent}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedHomePixCsvcontentManagerImpl 
extends AbstractManager<HomePixCsvcontent> 
implements GeneratedHomePixCsvcontentManager {
    
    private final TableIdentifier<HomePixCsvcontent> tableIdentifier;
    
    protected GeneratedHomePixCsvcontentManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("innodb", "innodb", "homePIX_csvcontent");
    }
    
    @Override
    public HomePixCsvcontent create() {
        return new HomePixCsvcontentImpl();
    }
    
    @Override
    public TableIdentifier<HomePixCsvcontent> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<HomePixCsvcontent>> fields() {
        return HomePixCsvcontentManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<HomePixCsvcontent>> primaryKeyFields() {
        return Stream.empty();
    }
}