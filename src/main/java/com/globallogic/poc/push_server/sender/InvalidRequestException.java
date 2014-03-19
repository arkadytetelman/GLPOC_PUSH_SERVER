package com.globallogic.poc.push_server.sender;

import java.io.IOException;

/**
 * Created by arkadii.tetelman on 3/6/14.
 */
public class InvalidRequestException extends IOException{

    private final int status;
    private final String description;

    public InvalidRequestException(int status) {
        this(status, null);
    }

    public InvalidRequestException(int status, String description) {
        super(getMessage(status, description));
        this.status = status;
        this.description = description;
    }

    private static String getMessage(int status, String description) {
        StringBuilder base = new StringBuilder("HTTP Status Code: ").append(status);
        if (description != null) {
            base.append("(").append(description).append(")");
        }
        return base.toString();
    }

    /**
     * Gets the HTTP Status Code.
     */
    public int getHttpStatusCode() {
        return status;
    }

    /**
     * Gets the error description.
     */
    public String getDescription() {
        return description;
    }

}
