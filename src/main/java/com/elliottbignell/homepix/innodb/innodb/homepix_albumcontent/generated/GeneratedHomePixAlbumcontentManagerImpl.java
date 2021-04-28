package com.elliottbignell.homepix.innodb.innodb.homepix_albumcontent.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_albumcontent.HomePixAlbumcontent;
import com.elliottbignell.homepix.innodb.innodb.homepix_albumcontent.HomePixAlbumcontentImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_albumcontent.HomePixAlbumcontentManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.elliottbignell.homepix.innodb.innodb.homepix_albumcontent.HomePixAlbumcontent}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedHomePixAlbumcontentManagerImpl 
extends AbstractManager<HomePixAlbumcontent> 
implements GeneratedHomePixAlbumcontentManager {
    
    private final TableIdentifier<HomePixAlbumcontent> tableIdentifier;
    
    protected GeneratedHomePixAlbumcontentManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("innodb", "innodb", "homePIX_albumcontent");
    }
    
    @Override
    public HomePixAlbumcontent create() {
        return new HomePixAlbumcontentImpl();
    }
    
    @Override
    public TableIdentifier<HomePixAlbumcontent> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<HomePixAlbumcontent>> fields() {
        return HomePixAlbumcontentManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<HomePixAlbumcontent>> primaryKeyFields() {
        return Stream.empty();
    }
}