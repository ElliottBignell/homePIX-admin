package com.elliottbignell.homepix.innodb.innodb.auth_permission;

import com.elliottbignell.homepix.innodb.innodb.auth_permission.generated.GeneratedAuthPermissionEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named
 * auth_permission.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author Elliott Bignell
 */
public final class AuthPermissionEntityStoreSerializerImpl extends GeneratedAuthPermissionEntityStoreSerializerImpl {
    
    public AuthPermissionEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}