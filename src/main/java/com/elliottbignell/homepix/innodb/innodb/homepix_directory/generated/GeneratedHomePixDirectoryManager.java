package com.elliottbignell.homepix.innodb.innodb.homepix_directory.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_directory.HomePixDirectory;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.elliottbignell.homepix.innodb.innodb.homepix_directory.HomePixDirectory}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedHomePixDirectoryManager extends Manager<HomePixDirectory> {
    
    TableIdentifier<HomePixDirectory> IDENTIFIER = TableIdentifier.of("innodb", "innodb", "homePIX_directory");
    List<Field<HomePixDirectory>> FIELDS = unmodifiableList(asList(
        HomePixDirectory.ID,
        HomePixDirectory.PATH,
        HomePixDirectory.COUNT,
        HomePixDirectory.REMOTE_KEY,
        HomePixDirectory.REMOTE_ID,
        HomePixDirectory.THUMBNAIL_ID,
        HomePixDirectory.HITS
    ));
    
    @Override
    default Class<HomePixDirectory> getEntityClass() {
        return HomePixDirectory.class;
    }
}