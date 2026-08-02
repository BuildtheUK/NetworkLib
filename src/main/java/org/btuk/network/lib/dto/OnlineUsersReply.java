package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@JsonTypeName("ONLINE_USERS_REPLY")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OnlineUsersReply extends AbstractTransferObject {

    private Set<OnlineUser> onlineUsers;

}
