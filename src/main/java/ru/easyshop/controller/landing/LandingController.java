package ru.easyshop.controller.landing;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.easyshop.service.landing.LandingService;

@Slf4j
@RestController
@RequiredArgsConstructor
public class LandingController {

    private final LandingService landingService;

    @Operation(summary = "Landing page", tags = "landing", security = @SecurityRequirement(name = "jwtAuth"))
    @RequestMapping(method = RequestMethod.POST, path = "/landing")
    public LandingResponse getLanding(@RequestBody LandingRequest request) throws JsonProcessingException {
        return new LandingResponse(landingService.getLandingData(request));
    }
}
