package com.catalog.developercollectionservice.service;

import com.catalog.developercollectionservice.dto.DeveloperRequest;
import com.catalog.developercollectionservice.entity.Developer;
import com.catalog.developercollectionservice.repository.DeveloperRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DeveloperCommandServiceTest {

    @Mock
    private DeveloperRepository developerRepository;

    @InjectMocks
    private DeveloperCommandService commandService;

    @Test
    void createDeveloper_ShouldSaveAndReturnId() {
        // Arrange
        DeveloperRequest request = new DeveloperRequest("Lorenzo", "lorenzo@test.com");
        Developer savedDeveloper = new Developer();
        savedDeveloper.setId(1L);
        savedDeveloper.setNome("Lorenzo");
        savedDeveloper.setEmail("lorenzo@test.com");

        when(developerRepository.save(any(Developer.class))).thenReturn(savedDeveloper);

        // Act
        Long resultId = commandService.createDeveloper(request);

        // Assert
        assertEquals(1L, resultId);
        verify(developerRepository).save(any(Developer.class));
    }
}