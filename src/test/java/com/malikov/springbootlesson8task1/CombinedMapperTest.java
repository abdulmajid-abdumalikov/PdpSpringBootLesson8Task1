package com.malikov.springbootlesson8task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinedMapperTest {

    @Test
    public void testCombinedDTO() {
        // Arrange
        DTO1 dto1 = new DTO1("John", "Doe");
        DTO2 dto2 = new DTO2("john.doe@example.com", "123-456-7890");

        // Act
        CombinedDTO combinedDTO = CombinedMapper.INSTANCE.toCombinedDTO(dto1, dto2);

        // Assert
        assertEquals("John Doe", combinedDTO.getFullName(), "Full name should be 'John Doe'");
        assertEquals(dto2.getEmail(), combinedDTO.getEmail(), "Email should match");
        assertEquals(dto2.getPhoneNumber(), combinedDTO.getPhoneNumber(), "Phone number should match");
    }
}

