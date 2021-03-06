package com.elliottbignell.homepix.innodb.innodb.homepix_albumcontent.generated;

import com.elliottbignell.homepix.innodb.innodb.homepix_albumcontent.HomePixAlbumcontent;
import com.elliottbignell.homepix.innodb.innodb.homepix_albumcontent.HomePixAlbumcontentImpl;
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
 * com.elliottbignell.homepix.innodb.innodb.homepix_albumcontent.HomePixAlbumcontent}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedHomePixAlbumcontentSqlAdapter implements SqlAdapter<HomePixAlbumcontent> {
    
    private final TableIdentifier<HomePixAlbumcontent> tableIdentifier;
    
    protected GeneratedHomePixAlbumcontentSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("innodb", "innodb", "homePIX_albumcontent");
    }
    
    protected HomePixAlbumcontent apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(      getShort(resultSet, 1 + offset))
            .setAlbumId( getByte(resultSet, 2 + offset))
            .setEntryId( getInt(resultSet, 3 + offset))
            ;
    }
    
    protected HomePixAlbumcontentImpl createEntity() {
        return new HomePixAlbumcontentImpl();
    }
    
    @Override
    public TableIdentifier<HomePixAlbumcontent> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, HomePixAlbumcontent> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, HomePixAlbumcontent> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}