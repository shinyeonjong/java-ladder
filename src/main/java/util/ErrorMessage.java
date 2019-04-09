package util;

public enum ErrorMessage {
    NAME_EXCESS("이름은 5자 이하입니다."),
    NOT_NUMBER("숫자가 아닙니다."),
    NONE_PLAYER("참여자가 없습니다."),
    NOT_MATCH("결과 입력 오류입니다."),
    NOT_CONTAINS_PLAYER("알 수 없는 참여자입니다.");

    private String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
