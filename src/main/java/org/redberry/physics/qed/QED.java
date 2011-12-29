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
package org.redberry.physics.qed;

import org.redberry.physics.ToFourier;
import redberry.core.context.CC;
import redberry.core.tensor.Expression;
import redberry.core.transformation.CalculateNumbers;
import redberry.core.transformation.ExpandBrackets;
import redberry.core.transformation.Transformer;
import redberry.core.transformation.contractions.IndexesContractionsTransformation;
import redberry.core.transformation.integral.CollectIntegralFromSum;
import redberry.core.transformation.integral.ExpandIntegral;

/**
 *
 * @author Stanislav Poslavsky
 */
public class QED {
    public final Expression Action =
            new Expression("S = Integral[Lagrangian[x_a],x_a]");
    public final Expression Lagrangian =
            new Expression("Lagrangian[x_a] = (-1/4)*F_{mn}[x_a]*F^{mn}[x_a]");
    public final Expression F =
            new Expression("F_{mn}[x_a] = D[A_{m}[x_a],x^n]-D[A_{n}[x_a],x^m]");
    final Expression[] initial = new Expression[]{Action, Lagrangian, F};

    public QED() {
        Action.eval(
                Lagrangian,
                F,
                new Transformer(ExpandBrackets.EXPAND_ALL),
                new Transformer(ExpandIntegral.INSTANCE),
                new Transformer(new ToFourier(CC.parseSimple("x_a"), CC.parseSimple("p_a"))),
                IndexesContractionsTransformation.CONTRACTIONS_WITH_METRIC,
                CalculateNumbers.INSTANCE,
                CollectIntegralFromSum.INSTANCE);
    }
}