package ru.easyshop.controller.landing;

import ru.easyshop.controller.landing.dto.LandingDto;
import ru.easyshop.controller.response.BaseResponseWithData;

public class LandingResponse extends BaseResponseWithData<LandingDto> {
    public LandingResponse(LandingDto data) {
        super(data);
    }
}
