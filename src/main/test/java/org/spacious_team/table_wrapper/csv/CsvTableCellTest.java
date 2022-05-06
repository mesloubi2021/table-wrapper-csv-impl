/*
 * Table Wrapper Xml SpreadsheetML Impl
 * Copyright (C) 2022  Vitalii Ananev <spacious-team@ya.ru>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.spacious_team.table_wrapper.csv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CsvTableCellTest {
    @ParameterizedTest
    @ValueSource (ints = {1, 2, 3, 4, 5})
    void getColumnIndex(int i) {
        CsvTableCell csv = new CsvTableCell(new CsvTableCell.RowAndIndex(new String[5], i));
        Assertions.assertEquals(i, csv.getColumnIndex());
    }
}