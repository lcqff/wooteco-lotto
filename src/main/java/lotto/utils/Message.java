package lotto.utils;

public enum Message {
    PAYMENT_INPUT_MESSAGE("구입금액을 입력해 주세요.");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}