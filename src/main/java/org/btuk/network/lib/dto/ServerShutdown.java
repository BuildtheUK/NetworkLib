package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Event for server shutdown.
 */
@JsonTypeName("SERVER_SHUTDOWN")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ServerShutdown extends AbstractTransferObject {
    private String serverName;
}
