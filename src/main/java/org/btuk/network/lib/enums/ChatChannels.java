package org.btuk.network.lib.enums;

import lombok.Getter;

/**
 * Default chat channels.
 */
@Getter
public enum ChatChannels {

    GLOBAL("global"),
    STAFF("staff"),
    REVIEWER("reviewer");

    ChatChannels(String channelName) {
        this.channelName = channelName;
    }

    private final String channelName;
}
