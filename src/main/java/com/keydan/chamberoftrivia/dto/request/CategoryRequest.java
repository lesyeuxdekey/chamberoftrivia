package com.keydan.chamberoftrivia.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryRequest {

     @NotBlank(message = "Category name is required")
    @Size(max = 100, message = "Category name max 100 characters")
    private String name;

    @Size(max = 500, message = "Description max 500 characters")
    private String description;
}