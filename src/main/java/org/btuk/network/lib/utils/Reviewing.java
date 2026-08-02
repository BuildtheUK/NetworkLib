package org.btuk.network.lib.utils;

import org.btuk.network.lib.enums.PlotDifficulties;

import java.util.ArrayList;
import java.util.List;

public class Reviewing {

    /**
     * Get the difficulties of plots that can be reviewed with a specific role and reputation.
     *
     * @param isReviewer whether the player is a reviewer
     * @param reputation the reputation of the player
     * @return a list of plot difficulties
     */
    public static List<PlotDifficulties> getAvailablePlotDifficulties(boolean isArchitect, boolean isReviewer, double reputation) {

        List<PlotDifficulties> difficulties = new ArrayList<>();

        if (!isArchitect && !isReviewer) {
            return difficulties;
        }

        // Hard plots can only be reviewed by reviewers with at least 5 reputation.
        if (reputation >= 5 && isReviewer) {
            difficulties.add(PlotDifficulties.HARD);
        }

        // Normal plots require a reputation of at least 2.5.
        if (reputation >= 2.5) {
            difficulties.add(PlotDifficulties.NORMAL);
        }

        // Easy plot are available to all.
        difficulties.add(PlotDifficulties.EASY);
        return difficulties;
    }

    /**
     * The reassessment chance is the odds of a review requiring a second opinion.
     *
     * @param reputation the reputation of the player
     * @return the reassessment chance as a percentage [0-1]
     */
    public static double getReassessmentChance(double reputation) {

        // For any reputation of 5 and below the chance is 100%.
        // If the reputation is greater or equal than 10 then there is a flat 10% chance.
        // This is necessary as to ensure high reputation reviewers are still occasionally assessed.
        if (reputation <= 5) {
            return 1;
        } else if (reputation >= 10) {
            return 0.1;
        }

        // For the remaining reputation there will an inverse quadratic scale between 10% and 100%.
        return 30 * Math.pow(1 / reputation, 2) - 0.2;
    }
}
