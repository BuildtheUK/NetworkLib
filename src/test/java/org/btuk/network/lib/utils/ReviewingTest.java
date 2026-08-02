package org.btuk.network.lib.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ReviewingTest {

    @Test
    void getReassessmentChance() {

        assertEquals(1, Reviewing.getReassessmentChance(2.5));
        assertEquals(1, Reviewing.getReassessmentChance(5));
        assertEquals((1 / 3d), Reviewing.getReassessmentChance(7.5));
        assertEquals(0.1, Reviewing.getReassessmentChance(10));
        assertEquals(0.1, Reviewing.getReassessmentChance(15));

    }
}