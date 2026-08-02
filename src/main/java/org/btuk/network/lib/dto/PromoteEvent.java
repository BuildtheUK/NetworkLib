package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("PROMOTE_EVENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PromoteEvent {

    private String uuid;

    private String role;

    /** True if the role should be removed */
    private boolean remove;

}
