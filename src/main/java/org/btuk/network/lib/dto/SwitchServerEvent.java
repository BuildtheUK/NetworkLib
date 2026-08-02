package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("SWITCH_SERVER_EVENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SwitchServerEvent extends AbstractTransferObject {

    private String uuid;

    private String to_server;

    private String from_server;

    /** Included here since the disconnect event is cancelled when switching server, but we still need the info. */
    private UserDisconnect userDisconnect;

}