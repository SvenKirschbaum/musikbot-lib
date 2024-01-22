package de.elite12.musikbot.shared.dtos;

import de.elite12.musikbot.shared.ClientDTO;
import de.elite12.musikbot.shared.SongTypes;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class SongDTO implements ClientDTO {
    private final String id;
    private final String title;
    private final SongTypes type;
}
