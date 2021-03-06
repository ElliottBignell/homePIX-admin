package com.elliottbignell.homepix.innodb.innodb.homepix_album.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_album.HomePixAlbum;
import com.elliottbignell.homepix.innodb.innodb.homepix_album.HomePixAlbumImpl;
import com.elliottbignell.homepix.innodb.innodb.homepix_album.HomePixAlbumManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.elliottbignell.homepix.innodb.innodb.homepix_album.HomePixAlbum} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedHomePixAlbumManagerImpl 
extends AbstractManager<HomePixAlbum> 
implements GeneratedHomePixAlbumManager {
    
    private final TableIdentifier<HomePixAlbum> tableIdentifier;
    
    protected GeneratedHomePixAlbumManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("innodb", "innodb", "homePIX_album");
    }
    
    @Override
    public HomePixAlbum create() {
        return new HomePixAlbumImpl();
    }
    
    @Override
    public TableIdentifier<HomePixAlbum> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<HomePixAlbum>> fields() {
        return HomePixAlbumManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<HomePixAlbum>> primaryKeyFields() {
        return Stream.empty();
    }
}