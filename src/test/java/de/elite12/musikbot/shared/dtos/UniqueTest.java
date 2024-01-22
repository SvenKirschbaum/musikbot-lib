package de.elite12.musikbot.shared.dtos;

import de.elite12.musikbot.shared.ClientDTO;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class UniqueTest {
    @Test
    public void testCommandsUnique() throws IOException {
        Reflections reflections = new Reflections("de.elite12.musikbot.shared.dtos");

        Set<Class<? extends ClientDTO>> dtos = reflections.getSubTypesOf(ClientDTO.class);

        Set<String> dtoTypes = new HashSet<>();

        for (Class<? extends ClientDTO> dto : dtos) {
            String dtoType = dto.getSimpleName();

            assertFalse(dtoTypes.contains(dtoType));

            dtoTypes.add(dtoType);
        }
    }
}
