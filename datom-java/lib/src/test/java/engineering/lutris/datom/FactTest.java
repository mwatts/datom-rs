// SPDX-FileCopyrightText: 2022 Lutris, Inc
// SPDX-License-Identifier: BlueOak-1.0.0 OR BSD-2-Clause-Patent
// SPDX-FileContributor: Piper McCorkle <piper@lutris.engineering>

package engineering.lutris.datom;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactTest {
    @Test
    void ednRoundtrip() {
        String edn = "[:entity, :attribute, \"value\", ]";
        try (Fact fact = Fact.fromEdn(edn)) {
            assertEquals(edn, fact.toEdn());
        }
    }
}
