package de.elite12.musikbot.shared.dtos;

import de.elite12.musikbot.shared.ClientDTO;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class VolumeCommand implements ClientDTO {
    /**
     * Volume to set in Percent
     */
    private final short volume;
}
