package com.elliottbignell.homepix.innodb.innodb.django_session;

import com.elliottbignell.homepix.innodb.innodb.django_session.generated.GeneratedDjangoSessionEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named
 * django_session.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author Elliott Bignell
 */
public final class DjangoSessionEntityStoreSerializerImpl extends GeneratedDjangoSessionEntityStoreSerializerImpl {
    
    public DjangoSessionEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}