/*
 * Sudoku creator / solver / teacher.
 *
 * Copyright (c) 2020 Thomas Neidhart
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package com.github.netomi.sudoku.solver

import com.github.netomi.sudoku.model.CellSet
import com.github.netomi.sudoku.model.Grid
import com.github.netomi.sudoku.model.PredefinedType
import kotlin.test.*

class HintAggregatorTest {
    @Test
    fun duplicateHints() {
        val aggregator = HintAggregator()
        val grid: Grid = Grid.of(PredefinedType.CLASSIC_9x9)
        val hint: Hint = AssignmentHint(grid.type, SolvingTechnique.FULL_HOUSE, 0, CellSet.empty(grid), 1)
        aggregator.addHint(hint)
        aggregator.addHint(hint)
        assertEquals(1, aggregator.hints.size)
    }

    @Test
    fun differentHints() {
        val aggregator = HintAggregator()
        val grid: Grid = Grid.of(PredefinedType.CLASSIC_9x9)
        val hint1: Hint = AssignmentHint(grid.type, SolvingTechnique.FULL_HOUSE, 0, CellSet.empty(grid), 1)
        val hint2: Hint = AssignmentHint(grid.type, SolvingTechnique.FULL_HOUSE, 1, CellSet.empty(grid), 2)
        aggregator.addHint(hint1)
        aggregator.addHint(hint2)
        assertEquals(2, aggregator.hints.size)
    }
}