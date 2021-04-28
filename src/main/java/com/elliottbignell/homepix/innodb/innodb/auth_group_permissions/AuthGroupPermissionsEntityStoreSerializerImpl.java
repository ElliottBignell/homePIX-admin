package com.elliottbignell.homepix.innodb.innodb.auth_group_permissions;

import com.elliottbignell.homepix.innodb.innodb.auth_group_permissions.generated.GeneratedAuthGroupPermissionsEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named
 * auth_group_permissions.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author Elliott Bignell
 */
public final class AuthGroupPermissionsEntityStoreSerializerImpl extends GeneratedAuthGroupPermissionsEntityStoreSerializerImpl {
    
    public AuthGroupPermissionsEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}