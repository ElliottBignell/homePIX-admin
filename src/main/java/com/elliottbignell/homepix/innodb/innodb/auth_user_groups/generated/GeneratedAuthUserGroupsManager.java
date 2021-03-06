package com.elliottbignell.homepix.innodb.innodb.auth_user_groups.generated;

import com.elliottbignell.homepix.innodb.innodb.auth_user_groups.AuthUserGroups;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.elliottbignell.homepix.innodb.innodb.auth_user_groups.AuthUserGroups}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAuthUserGroupsManager extends Manager<AuthUserGroups> {
    
    TableIdentifier<AuthUserGroups> IDENTIFIER = TableIdentifier.of("innodb", "innodb", "auth_user_groups");
    List<Field<AuthUserGroups>> FIELDS = unmodifiableList(asList(
        AuthUserGroups.ID,
        AuthUserGroups.USER_ID,
        AuthUserGroups.GROUP_ID
    ));
    
    @Override
    default Class<AuthUserGroups> getEntityClass() {
        return AuthUserGroups.class;
    }
}