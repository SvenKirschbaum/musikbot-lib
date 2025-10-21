package de.elite12.musikbot.shared;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.elite12.musikbot.shared.dtos.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.SIMPLE_NAME, include = JsonTypeInfo.As.PROPERTY, property = "dtotype")
@JsonSubTypes({
        @JsonSubTypes.Type(NoListenerCommand.class),
        @JsonSubTypes.Type(PauseCommand.class),
        @JsonSubTypes.Type(ShutdownCommand.class),
        @JsonSubTypes.Type(SongDTO.class),
        @JsonSubTypes.Type(SongRequest.class),
        @JsonSubTypes.Type(StopCommand.class),
        @JsonSubTypes.Type(VolumeCommand.class),
})
public interface ClientDTO {
}
