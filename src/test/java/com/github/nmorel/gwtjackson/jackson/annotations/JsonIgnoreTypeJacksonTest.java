package com.github.nmorel.gwtjackson.jackson.annotations;

import com.github.nmorel.gwtjackson.jackson.AbstractJacksonTest;
import com.github.nmorel.gwtjackson.shared.annotations.JsonIgnoreTypeTester;
import org.junit.Test;

/**
 * @author Nicolas Morel
 */
public class JsonIgnoreTypeJacksonTest extends AbstractJacksonTest {

    @Test
    public void testDeserialize() {
        JsonIgnoreTypeTester.INSTANCE.testDeserialize( createDecoder( JsonIgnoreTypeTester.NonIgnoredType.class ) );
    }

    @Test
    public void testSerialize() {
        JsonIgnoreTypeTester.INSTANCE.testSerialize( createEncoder( JsonIgnoreTypeTester.NonIgnoredType.class ) );
    }
}