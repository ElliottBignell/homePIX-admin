package com.elliottbignell.homepix.innodb.innodb.homepix_csventry.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_csventry.HomePixCsventry;
import com.elliottbignell.homepix.innodb.innodb.homepix_csventry.HomePixCsventryImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_csventry.HomePixCsventryManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.elliottbignell.homepix.innodb.innodb.homepix_csventry.HomePixCsventry}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedHomePixCsventryManagerImpl 
extends AbstractManager<HomePixCsventry> 
implements GeneratedHomePixCsventryManager {
    
    private final TableIdentifier<HomePixCsventry> tableIdentifier;
    
    protected GeneratedHomePixCsventryManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("innodb", "innodb", "homePIX_csventry");
    }
    
    @Override
    public HomePixCsventry create() {
        return new HomePixCsventryImpl();
    }
    
    @Override
    public TableIdentifier<HomePixCsventry> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<HomePixCsventry>> fields() {
        return HomePixCsventryManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<HomePixCsventry>> primaryKeyFields() {
        return Stream.empty();
    }
}