/*
 *
 * Redberry: symbolic tensor computations library.
 * Copyright (C) 2010-2011  Stanislav Poslavsky <stvlpos@mail.ru>
 *
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.redberry.physics.util;

import org.redberry.physics.util.IndexesFactoryUtil;
import org.junit.Ignore;
import org.junit.Test;
import redberry.core.parser.ParserIndexes;
import redberry.core.tensor.Tensor;

/**
 *
 * @author Dmitry Bolotin
 * @author Stanislav Poslavsky
 */
@Ignore
public class IndexesFactoryUtilTest {
    public IndexesFactoryUtilTest() {
    }

    @Test
    public void testCreate() {
        System.out.println(IndexesFactoryUtil.createIndexes(new Tensor[0], ParserIndexes.parse("^{\\mu\\nu}_{\\alpha\\beta}")));

    }
    
    @Test
    public void testDump() {
        System.out.println(IndexesFactoryUtil.doubleAndDumpIndexes(ParserIndexes.parse("^ab_mn")));

    }
}