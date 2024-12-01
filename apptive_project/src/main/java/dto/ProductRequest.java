package dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ProductRequest(
        @Size(min = 1, max = 5, message = "이름은 1~5자 사이여야 합니다.")
        String name, //@Size: 문자열, 배열, 컬렉션에 사용

        @Min(value = 1000, message = "가격은 최소 1000원 이상이어야 합니다.")
        @Max(value = 5000, message = "가격은 최대 5000원 이하이어야 합니다.")
        Long price,

        @Max(value = 999, message = "수량은 최대 999까지 등록 가능합니다.")
        Integer quantity
) {}


