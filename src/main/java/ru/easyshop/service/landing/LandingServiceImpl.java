package ru.easyshop.service.landing;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.easyshop.controller.landing.LandingRequest;
import ru.easyshop.controller.landing.dto.LandingDto;
import ru.easyshop.database.repository.landing.LandingRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class LandingServiceImpl implements LandingService {

    private final LandingRepository landingRepository;

    @Override
    public LandingDto getLandingData(LandingRequest request) {
        return landingRepository.findLandingData(request);
    }
}
