package com.catalog.developercollectionservice.service;

import com.catalog.developercollectionservice.dto.DeveloperResponse;
import com.catalog.developercollectionservice.entity.Developer;
import com.catalog.developercollectionservice.mapper.DeveloperMapper;
import com.catalog.developercollectionservice.repository.DeveloperRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DeveloperQueryServiceTest {

    @Mock
    private DeveloperRepository developerRepository;

    @Mock
    private DeveloperMapper developerMapper;

    @InjectMocks
    private DeveloperQueryService queryService;

    @Test
    void getAllDevelopers_ShouldReturnMappedResponses() {
        Developer developer = new Developer();
        developer.setId(1L);
        DeveloperResponse response = new DeveloperResponse(1L, "Test Developer", "test@example.com");

        when(developerRepository.findAll()).thenReturn(List.of(developer));
        when(developerMapper.toResponse(developer)).thenReturn(response);

        List<DeveloperResponse> result = queryService.getAllDevelopers();

        assertEquals(1, result.size());
        assertEquals(1L, result.get(0).id());
        verify(developerRepository).findAll();
    }

    @Test
    void getDeveloperById_WhenFound_ShouldReturnResponse() {
        Developer developer = new Developer();
        developer.setId(1L);
        DeveloperResponse response = new DeveloperResponse(1L, "Test Developer", "test@example.com");

        when(developerRepository.findById(1L)).thenReturn(Optional.of(developer));
        when(developerMapper.toResponse(developer)).thenReturn(response);

        DeveloperResponse result = queryService.getDeveloperById(1L);

        assertEquals(1L, result.id());
        verify(developerRepository).findById(1L);
    }

    @Test
    void getDeveloperById_WhenNotFound_ShouldThrowException() {
        when(developerRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> queryService.getDeveloperById(99L));
    }
}