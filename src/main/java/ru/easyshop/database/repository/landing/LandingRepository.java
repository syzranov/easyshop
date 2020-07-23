package ru.easyshop.database.repository.landing;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.easyshop.controller.landing.LandingRequest;
import ru.easyshop.controller.landing.dto.LandingDto;
import ru.easyshop.database.entity.landing.Landing;

public interface LandingRepository extends JpaRepository<Landing, Integer> {

    LandingDto findLandingData(LandingRequest landingRequest);
}
