package com.elliottbignell.homepix.innodb.innodb.albumview;

import com.elliottbignell.homepix.innodb.innodb.albumview.generated.GeneratedAlbumViewEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named AlbumView.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author Elliott Bignell
 */
public final class AlbumViewEntityStoreSerializerImpl extends GeneratedAlbumViewEntityStoreSerializerImpl {
    
    public AlbumViewEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}