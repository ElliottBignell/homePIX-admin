package com.elliottbignell.homepix.innodb.innodb.calendarview;

import com.elliottbignell.homepix.innodb.innodb.calendarview.generated.GeneratedCalendarViewEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named
 * CalendarView.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author Elliott Bignell
 */
public final class CalendarViewEntityStoreSerializerImpl extends GeneratedCalendarViewEntityStoreSerializerImpl {
    
    public CalendarViewEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}