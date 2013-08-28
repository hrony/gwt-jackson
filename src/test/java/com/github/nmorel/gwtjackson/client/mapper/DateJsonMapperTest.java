package com.github.nmorel.gwtjackson.client.mapper;

import java.util.Date;

/** @author Nicolas Morel */
public class DateJsonMapperTest extends AbstractJsonMapperTest<DateJsonMapper>
{
    @Override
    protected DateJsonMapper createMapper()
    {
        return new DateJsonMapper();
    }

    @Override
    protected void testDecodeValue( DateJsonMapper mapper )
    {
        assertEquals( new Date( 1377543971773l ), mapper.decode( "1377543971773" ) );
        assertEquals( getUTCDate( 2012, 8, 18, 15, 45, 56, 543 ), mapper.decode( "\"2012-08-18T17:45:56.543+02:00\"" ) );
    }

    @Override
    protected void testEncodeValue( DateJsonMapper mapper )
    {
        Date date = getUTCDate( 2012, 8, 18, 12, 45, 56, 543 );
        assertEquals( "" + date.getTime(), mapper.encode( date ) );
    }
}
