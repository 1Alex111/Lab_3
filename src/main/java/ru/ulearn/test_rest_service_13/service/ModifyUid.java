package ru.ulearn.test_rest_service_13.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.ulearn.test_rest_service_13.model.Response;

@Service
@RequiredArgsConstructor
@Qualifier("id1")
public class ModifyUid implements MyModifyService{
    @Override
    public Response modify(Response response) {
        response.setUid("New uid");
        return response;
    }
}
