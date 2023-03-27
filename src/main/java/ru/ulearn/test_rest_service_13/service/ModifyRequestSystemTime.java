package ru.ulearn.test_rest_service_13.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.ulearn.test_rest_service_13.model.Request;

import java.lang.reflect.ParameterizedType;

@Service

public class ModifyRequestSystemTime implements ModifyRequestService {
    @Override
    public void ModifyRq(Request request) {
        request.setSystemTime("test");

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);

        new RestTemplate().exchange("http://localhost:8082/fedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });
    }
}