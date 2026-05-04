package com.catalog.resource_catalog_service.controller;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.service.ResourceCommandService;
import com.catalog.resource_catalog_service.service.ResourceQueryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ResourceController.class)
class ResourceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ResourceCommandService commandService;

    @MockBean
    private ResourceQueryService queryService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void createResource_WhenInvalid_ShouldReturnBadRequest() throws Exception {
        // Nome vuoto per triggerare @NotBlank
        ResourceRequest invalid = new ResourceRequest("", "Desc", "url", 1L);

        mockMvc.perform(post("/api/v1/resources")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(invalid)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.status").value(400));
    }

    @Test
    void createResource_WhenValid_ShouldReturnCreated() throws Exception {
        ResourceRequest valid = new ResourceRequest("Java Docs", "Desc", "https://docs.oracle.com", 1L);
        when(commandService.createResource(any())).thenReturn(1L);

        mockMvc.perform(post("/api/v1/resources")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(valid)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$").value(1));
    }
}