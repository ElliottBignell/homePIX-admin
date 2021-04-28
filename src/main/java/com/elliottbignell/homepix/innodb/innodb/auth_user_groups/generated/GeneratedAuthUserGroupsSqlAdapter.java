package com.elliottbignell.homepix.innodb.innodb.auth_user_groups.generated;

import com.elliottbignell.homepix.innodb.innodb.auth_user_groups.AuthUserGroups;
import com.elliottbignell.homepix.innodb.innodb.auth_user_groups.AuthUserGroupsImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.elliottbignell.homepix.innodb.innodb.auth_user_groups.AuthUserGroups}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAuthUserGroupsSqlAdapter implements SqlAdapter<AuthUserGroups> {
    
    private final TableIdentifier<AuthUserGroups> tableIdentifier;
    
    protected GeneratedAuthUserGroupsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("innodb", "innodb", "auth_user_groups");
    }
    
    protected AuthUserGroups apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(      resultSet.getString(1 + offset))
            .setUserId(  resultSet.getString(2 + offset))
            .setGroupId( resultSet.getString(3 + offset))
            ;
    }
    
    protected AuthUserGroupsImpl createEntity() {
        return new AuthUserGroupsImpl();
    }
    
    @Override
    public TableIdentifier<AuthUserGroups> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, AuthUserGroups> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, AuthUserGroups> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}