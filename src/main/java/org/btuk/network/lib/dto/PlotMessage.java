package org.btuk.network.lib.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonTypeName("PLOT_MESSAGE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlotMessage extends AbstractTransferObject {

    private String messageTemplate;

    private boolean verify;

}
