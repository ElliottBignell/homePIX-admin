package com.elliottbignell.homepix.innodb.innodb.auth_user.generated;

import com.elliottbignell.homepix.innodb.innodb.auth_user.AuthUser;
import com.elliottbignell.homepix.innodb.innodb.auth_user.AuthUserImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.util.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * com.elliottbignell.homepix.innodb.innodb.auth_user.AuthUser} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAuthUserSqlAdapter implements SqlAdapter<AuthUser> {
    
    private final TableIdentifier<AuthUser> tableIdentifier;
    
    protected GeneratedAuthUserSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("innodb", "innodb", "auth_user");
    }
    
    protected AuthUser apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(          getByte(resultSet, 1 + offset))
            .setPassword(    resultSet.getString(2 + offset))
            .setLastLogin(   resultSet.getString(3 + offset))
            .setIsSuperuser( getByte(resultSet, 4 + offset))
            .setUsername(    resultSet.getString(5 + offset))
            .setLastName(    resultSet.getString(6 + offset))
            .setEmail(       resultSet.getString(7 + offset))
            .setIsStaff(     getByte(resultSet, 8 + offset))
            .setIsActive(    getByte(resultSet, 9 + offset))
            .setDateJoined(  resultSet.getString(10 + offset))
            .setFirstName(   resultSet.getString(11 + offset))
            ;
    }
    
    protected AuthUserImpl createEntity() {
        return new AuthUserImpl();
    }
    
    @Override
    public TableIdentifier<AuthUser> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, AuthUser> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, AuthUser> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}