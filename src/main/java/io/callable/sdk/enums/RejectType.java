package io.callable.sdk.enums;

public enum RejectType {
    BAD_REQUEST(400),
    UNAUTHORISED(401),
    FORBIDDEN(403),
    NOT_FOUND(404),
    REQUEST_TIMEOUT(408),
    TEMPORARY_UNAVAILABLE(480),
    LOOP_DETECTED(482),
    BUSY_HERE(486),
    NOT_ACCEPTABLE_HERE(488),
    DECLINE(603);

    private int type;

    private RejectType(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }
}
