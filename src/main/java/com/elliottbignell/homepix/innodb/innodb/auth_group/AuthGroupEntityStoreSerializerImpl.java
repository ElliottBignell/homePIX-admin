package com.elliottbignell.homepix.innodb.innodb.auth_group;

import com.elliottbignell.homepix.innodb.innodb.auth_group.generated.GeneratedAuthGroupEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named auth_group.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author Elliott Bignell
 */
public final class AuthGroupEntityStoreSerializerImpl extends GeneratedAuthGroupEntityStoreSerializerImpl {
    
    public AuthGroupEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}