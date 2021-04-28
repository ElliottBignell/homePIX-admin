package com.elliottbignell.homepix.innodb.innodb.django_admin_log;

import com.elliottbignell.homepix.innodb.innodb.django_admin_log.generated.GeneratedDjangoAdminLogEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named
 * django_admin_log.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author Elliott Bignell
 */
public final class DjangoAdminLogEntityStoreSerializerImpl extends GeneratedDjangoAdminLogEntityStoreSerializerImpl {
    
    public DjangoAdminLogEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}