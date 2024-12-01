package Exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum Errorcode {
    PRODUCT_NAME_DUPLICATION_ERROR(HttpStatus.BAD_REQUEST, "이미 등록된 상품입니다.");

    private final HttpStatus status;
    private final String message;
    }

