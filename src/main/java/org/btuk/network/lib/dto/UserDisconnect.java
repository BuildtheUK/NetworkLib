package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("USER_DISCONNECT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDisconnect extends AbstractTransferObject {

    private String uuid;

    /**
     * Check the server, since for server-switching the connect event is sent before the disconnect, then we can ignore the disconnect.
     * To update the user information we send a UserDisconnect event in the SwitchServer object.
     */
    private String server;

    private Boolean navigatorEnabled;

    private Boolean teleportEnabled;

    private Boolean nightvisionEnabled;

    private String chatChannel;

    private Boolean tipsEnabled;

}
