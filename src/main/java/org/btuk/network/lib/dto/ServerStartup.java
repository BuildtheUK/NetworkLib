package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Event for server startup.
 */
@JsonTypeName("SERVER_STARTUP")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ServerStartup extends AbstractTransferObject {
    private String serverName;
}
