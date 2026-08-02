package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Event to mute or unmute a specific player.
 */
@JsonTypeName("MUTE_EVENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MuteEvent extends AbstractTransferObject {

    private String uuid;

    private String uuidToMute;

    private boolean mute;
}