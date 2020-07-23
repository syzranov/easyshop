package ru.easyshop.service.landing;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import ru.easyshop.controller.landing.LandingRequest;
import ru.easyshop.controller.landing.dto.LandingDto;
import ru.easyshop.database.repository.landing.LandingRepository;
import ru.easyshop.service.StartService;

import static org.mockito.Mockito.mock;

@SpringBootTest
public class LandingServiceTest {

//    @MockBean
//    LandingRepository landingRepository;

    @Autowired
    LandingService landingService;

//    @BeforeEach
//    public void Init() {
//        landingRepository = mock(LandingRepository.class);
//    }

    @Test
    public void getLandingDataTest() {
        var expected = getExpectedGetLandingData();
        var request = getRequestLandingData();
        var actual = landingService.getLandingData(request);

        assertLandingEquals(expected, actual);
    }

    private void assertLandingEquals(LandingDto expected, LandingDto actual) {
        Assert.assertEquals(expected.getHeader(), actual.getHeader());
    }

    private LandingRequest getRequestLandingData() {
        return LandingRequest.builder().build();
    }

    private LandingDto getExpectedGetLandingData() {
        return LandingDto.builder()
                .build();
    }
}
