package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Event to let a server know to remove an online user.
 */
@JsonTypeName("ONLINE_USER_REMOVE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OnlineUserRemove extends AbstractTransferObject {

    private String uuid;

}
