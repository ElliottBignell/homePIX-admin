package com.elliottbignell.homepix.innodb.innodb.django_admin_log.generated;

import com.elliottbignell.homepix.innodb.innodb.django_admin_log.DjangoAdminLog;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.elliottbignell.homepix.innodb.innodb.django_admin_log.DjangoAdminLog}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedDjangoAdminLogManager extends Manager<DjangoAdminLog> {
    
    TableIdentifier<DjangoAdminLog> IDENTIFIER = TableIdentifier.of("innodb", "innodb", "django_admin_log");
    List<Field<DjangoAdminLog>> FIELDS = unmodifiableList(asList(
        DjangoAdminLog.ID,
        DjangoAdminLog.ACTION_TIME,
        DjangoAdminLog.OBJECT_ID,
        DjangoAdminLog.OBJECT_REPR,
        DjangoAdminLog.CHANGE_MESSAGE,
        DjangoAdminLog.CONTENT_TYPE_ID,
        DjangoAdminLog.USER_ID,
        DjangoAdminLog.ACTION_FLAG
    ));
    
    @Override
    default Class<DjangoAdminLog> getEntityClass() {
        return DjangoAdminLog.class;
    }
}