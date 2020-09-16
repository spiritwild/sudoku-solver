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
package com.github.netomi.sudoku.solver.techniques

import com.github.netomi.sudoku.solver.HintFinder

class XYWingFinderTest : BaseHintFinderTest() {
    override fun createHintFinder(): HintFinder {
        return XYWingFinder()
    }

    override fun matches(testCase: TechniqueTestCase): Boolean {
        return testCase.technique.startsWith("0800")
    }
}

class XYZWingFinderTest : BaseHintFinderTest() {
    override fun createHintFinder(): HintFinder {
        return XYZWingFinder()
    }

    override fun matches(testCase: TechniqueTestCase): Boolean {
        return testCase.technique.startsWith("0801")
    }
}

class WWingFinderTest : BaseHintFinderTest() {
    override fun createHintFinder(): HintFinder {
        return WWingFinder()
    }

    override fun matches(testCase: TechniqueTestCase): Boolean {
        return testCase.technique.startsWith("0803")
    }
}