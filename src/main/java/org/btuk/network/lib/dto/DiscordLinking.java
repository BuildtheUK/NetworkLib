package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("DISCORD_LINKING")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DiscordLinking extends AbstractTransferObject {

    String uuid;

    String token;

    long discordId = -1;

    boolean unlink;

}
