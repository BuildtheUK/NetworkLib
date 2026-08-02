package org.btuk.network.lib.enums;

import lombok.Getter;

@Getter
public enum PlotDifficulties {

    EASY(1),
    NORMAL(2),
    HARD(3);

    private final int value;

    PlotDifficulties(int value) {
        this.value = value;
    }

}
