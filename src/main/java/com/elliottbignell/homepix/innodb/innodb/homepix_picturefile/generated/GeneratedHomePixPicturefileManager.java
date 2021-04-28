package com.elliottbignell.homepix.innodb.innodb.homepix_picturefile.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_picturefile.HomePixPicturefile;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.elliottbignell.homepix.innodb.innodb.homepix_picturefile.HomePixPicturefile}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedHomePixPicturefileManager extends Manager<HomePixPicturefile> {
    
    TableIdentifier<HomePixPicturefile> IDENTIFIER = TableIdentifier.of("innodb", "innodb", "homePIX_picturefile");
    List<Field<HomePixPicturefile>> FIELDS = unmodifiableList(asList(
        HomePixPicturefile.ID,
        HomePixPicturefile.FILE,
        HomePixPicturefile.TITLE,
        HomePixPicturefile.SORTKEY,
        HomePixPicturefile.ADDED_ON,
        HomePixPicturefile.TAKEN_ON,
        HomePixPicturefile.LAST_MODIFIED,
        HomePixPicturefile.LOCATION,
        HomePixPicturefile.PRIMARY_CATEGORY,
        HomePixPicturefile.SECONDARY_CATEGORY,
        HomePixPicturefile.KEYWORDS_ID,
        HomePixPicturefile.PATH_ID,
        HomePixPicturefile.HITS
    ));
    
    @Override
    default Class<HomePixPicturefile> getEntityClass() {
        return HomePixPicturefile.class;
    }
}