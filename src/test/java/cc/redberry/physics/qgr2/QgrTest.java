/*
 * Redberry: symbolic tensor computations.
 *
 * Copyright (c) 2010-2012:
 *   Stanislav Poslavsky   <stvlpos@mail.ru>
 *   Bolotin Dmitriy       <bolotin.dmitriy@gmail.com>
 *
 * This file is part of Redberry.
 *
 * Redberry is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Redberry is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Redberry. If not, see <http://www.gnu.org/licenses/>.
 */
package cc.redberry.physics.qgr2;

import cc.redberry.core.tensor.Expression;
import org.junit.Test;


/**
 *
 * @author Dmitry Bolotin
 * @author Stanislav Poslavsky
 */
public class QgrTest {
    public QgrTest() {
    }

    @Test
    public void test1() {
        Qgr qgr = new Qgr();
        Expression Action =
            new Expression("S = Integral[Lagrange,x_m]");
//        CC.parse("Integral[Lagrange,x_m]");
//        System.out.println(Qgr.Action);
    }
}