package ru.ulearn.test_rest_service_13.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {

    private String uid;
    private String operationUid;
    private String systemTime;
    private String code;
    private String communicationId;
    private String errorCode;
    private String errorMessage;


}
