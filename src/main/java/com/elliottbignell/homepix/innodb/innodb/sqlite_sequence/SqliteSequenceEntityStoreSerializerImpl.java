package com.elliottbignell.homepix.innodb.innodb.sqlite_sequence;

import com.elliottbignell.homepix.innodb.innodb.sqlite_sequence.generated.GeneratedSqliteSequenceEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named
 * sqlite_sequence.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author Elliott Bignell
 */
public final class SqliteSequenceEntityStoreSerializerImpl extends GeneratedSqliteSequenceEntityStoreSerializerImpl {
    
    public SqliteSequenceEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}