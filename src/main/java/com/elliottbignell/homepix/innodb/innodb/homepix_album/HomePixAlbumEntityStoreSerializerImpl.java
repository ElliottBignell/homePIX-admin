package com.elliottbignell.homepix.innodb.innodb.homepix_album;

import com.elliottbignell.homepix.innodb.innodb.homepix_album.generated.GeneratedHomePixAlbumEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named
 * homePIX_album.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author Elliott Bignell
 */
public final class HomePixAlbumEntityStoreSerializerImpl extends GeneratedHomePixAlbumEntityStoreSerializerImpl {
    
    public HomePixAlbumEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}