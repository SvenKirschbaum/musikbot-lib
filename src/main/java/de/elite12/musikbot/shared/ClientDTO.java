package de.elite12.musikbot.shared;

public interface ClientDTO {
    default String getDTOType() {
        return this.getClass().getSimpleName();
    }
}
