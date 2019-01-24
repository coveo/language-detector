/*
 * Copyright 2011 Nakatani Shuyo
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

package com.optimaize.langdetect.cybozu.util;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Nakatani Shuyo
 * @author Fabian Kessler
 */
public class CharNormalizerTest {
    /**
     * Test method for {@link CharNormalizer#normalize(char)} with Latin characters
     */
    @Test
    public final void testNormalizeWithLatin() {
        assertEquals(CharNormalizer.normalize('\u0000'), ' ');
        assertEquals(CharNormalizer.normalize('\u0009'), ' ');
        assertEquals(CharNormalizer.normalize('\u0020'), ' ');
        assertEquals(CharNormalizer.normalize('\u0030'), ' ');
        assertEquals(CharNormalizer.normalize('\u0040'), ' ');
        assertEquals(CharNormalizer.normalize('\u0041'), '\u0041');
        assertEquals(CharNormalizer.normalize('\u005a'), '\u005a');
        assertEquals(CharNormalizer.normalize('\u005b'), ' ');
        assertEquals(CharNormalizer.normalize('\u0060'), ' ');
        assertEquals(CharNormalizer.normalize('\u0061'), '\u0061');
        assertEquals(CharNormalizer.normalize('\u007a'), '\u007a');
        assertEquals(CharNormalizer.normalize('\u007b'), ' ');
        assertEquals(CharNormalizer.normalize('\u007f'), ' ');
        assertEquals(CharNormalizer.normalize('\u0080'), '\u0080');
        assertEquals(CharNormalizer.normalize('\u00a0'), ' ');
        assertEquals(CharNormalizer.normalize('\u00a1'), '\u00a1');

        assertEquals(CharNormalizer.normalize('a'), 'a');
        assertEquals(CharNormalizer.normalize('z'), 'z');
        assertEquals(CharNormalizer.normalize('A'), 'A');
        assertEquals(CharNormalizer.normalize('Z'), 'Z');
        assertEquals(CharNormalizer.normalize('9'), ' ');
    }

    /**
     * Test method for {@link CharNormalizer#normalize(char)} with CJK Kanji characters
     */
    @Test
    public final void testNormalizeWithCJKKanji() {
        assertEquals(CharNormalizer.normalize('\u4E00'), '\u4E00');
        assertEquals(CharNormalizer.normalize('\u4E01'), '\u4E01');
        assertEquals(CharNormalizer.normalize('\u4E02'), '\u4E02');
        assertEquals(CharNormalizer.normalize('\u4E03'), '\u4E01');
        assertEquals(CharNormalizer.normalize('\u4E04'), '\u4E04');
        assertEquals(CharNormalizer.normalize('\u4E05'), '\u4E05');
        assertEquals(CharNormalizer.normalize('\u4E06'), '\u4E06');
        assertEquals(CharNormalizer.normalize('\u4E07'), '\u4E07');
        assertEquals(CharNormalizer.normalize('\u4E08'), '\u4E08');
        assertEquals(CharNormalizer.normalize('\u4E09'), '\u4E09');
        assertEquals(CharNormalizer.normalize('\u4E10'), '\u4E10');
        assertEquals(CharNormalizer.normalize('\u4E11'), '\u4E11');
        assertEquals(CharNormalizer.normalize('\u4E12'), '\u4E12');
        assertEquals(CharNormalizer.normalize('\u4E13'), '\u4E13');
        assertEquals(CharNormalizer.normalize('\u4E14'), '\u4E14');
        assertEquals(CharNormalizer.normalize('\u4E15'), '\u4E15');
        assertEquals(CharNormalizer.normalize('\u4E1e'), '\u4E1e');
        assertEquals(CharNormalizer.normalize('\u4E1f'), '\u4E1f');
        assertEquals(CharNormalizer.normalize('\u4E20'), '\u4E20');
        assertEquals(CharNormalizer.normalize('\u4E21'), '\u4E21');
        assertEquals(CharNormalizer.normalize('\u4E22'), '\u4E22');
        assertEquals(CharNormalizer.normalize('\u4E23'), '\u4E23');
        assertEquals(CharNormalizer.normalize('\u4E24'), '\u4E13');
        assertEquals(CharNormalizer.normalize('\u4E25'), '\u4E13');
        assertEquals(CharNormalizer.normalize('\u4E30'), '\u4E30');
    }

}
