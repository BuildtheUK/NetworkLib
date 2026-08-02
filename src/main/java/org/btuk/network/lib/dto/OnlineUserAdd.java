package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Event to let a server know to add an online user.
 */
@JsonTypeName("ONLINE_USER_ADD")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OnlineUserAdd extends AbstractTransferObject {

    private OnlineUser user;

}
