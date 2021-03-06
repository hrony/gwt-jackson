/*
 * Copyright 2014 Nicolas Morel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.nmorel.gwtjackson.client.advanced.jsontype;

import java.util.List;

import com.github.nmorel.gwtjackson.client.GwtJacksonTestCase;
import com.github.nmorel.gwtjackson.client.ObjectMapper;
import com.github.nmorel.gwtjackson.client.ObjectWriter;
import com.github.nmorel.gwtjackson.shared.ObjectMapperTester;
import com.github.nmorel.gwtjackson.shared.ObjectWriterTester;
import com.github.nmorel.gwtjackson.shared.advanced.jsontype.JsonTypeWithEnumTester;
import com.github.nmorel.gwtjackson.shared.advanced.jsontype.JsonTypeWithEnumTester.HasCode;
import com.github.nmorel.gwtjackson.shared.advanced.jsontype.JsonTypeWithEnumTester.HasCodeWrapperBean;
import com.google.gwt.core.client.GWT;

/**
 * @author Nicolas Morel
 */
public class JsonTypeWithEnumGwtTest extends GwtJacksonTestCase {

    public interface HasCodeWrapperBeanMapper extends ObjectMapper<HasCodeWrapperBean>, ObjectMapperTester<HasCodeWrapperBean> {

        static HasCodeWrapperBeanMapper INSTANCE = GWT.create( HasCodeWrapperBeanMapper.class );
    }

    public interface HasCodeListWriter extends ObjectWriter<List<HasCode>>, ObjectWriterTester<List<HasCode>> {

        static HasCodeListWriter INSTANCE = GWT.create( HasCodeListWriter.class );
    }

    private JsonTypeWithEnumTester tester = JsonTypeWithEnumTester.INSTANCE;

    public void testWithJsonTypeInfo() {
        tester.testWithJsonTypeInfo( HasCodeWrapperBeanMapper.INSTANCE );
    }

    public void testSerializeWithoutJsonTypeInfo() {
        tester.testSerializeWithoutJsonTypeInfo( HasCodeListWriter.INSTANCE );
    }
}
