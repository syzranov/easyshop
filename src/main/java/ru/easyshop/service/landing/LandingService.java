package ru.easyshop.service.landing;

import ru.easyshop.controller.landing.LandingRequest;
import ru.easyshop.controller.landing.dto.LandingDto;

public interface LandingService {

    LandingDto getLandingData(LandingRequest request);
}
