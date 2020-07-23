package ru.easyshop.controller.landing.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "Landing page")
@Builder
public class LandingDto implements Serializable {

    @Schema(description = "Header")
    private String header;
}