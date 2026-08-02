package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("PRIVATE_MESSAGE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PrivateMessage extends AbstractTransferObject {

    private String channel;

    private String sender;

    private String recipient;

    private String message;

    /** Whether the message should also be sent if the player is offline. */
    private boolean offline;

}