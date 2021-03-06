package com.elliottbignell.homepix.innodb.innodb.auth_user.generated;

import com.elliottbignell.homepix.innodb.innodb.auth_user.AuthUser;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.elliottbignell.homepix.innodb.innodb.auth_user.AuthUser} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAuthUserManager extends Manager<AuthUser> {
    
    TableIdentifier<AuthUser> IDENTIFIER = TableIdentifier.of("innodb", "innodb", "auth_user");
    List<Field<AuthUser>> FIELDS = unmodifiableList(asList(
        AuthUser.ID,
        AuthUser.PASSWORD,
        AuthUser.LAST_LOGIN,
        AuthUser.IS_SUPERUSER,
        AuthUser.USERNAME,
        AuthUser.LAST_NAME,
        AuthUser.EMAIL,
        AuthUser.IS_STAFF,
        AuthUser.IS_ACTIVE,
        AuthUser.DATE_JOINED,
        AuthUser.FIRST_NAME
    ));
    
    @Override
    default Class<AuthUser> getEntityClass() {
        return AuthUser.class;
    }
}