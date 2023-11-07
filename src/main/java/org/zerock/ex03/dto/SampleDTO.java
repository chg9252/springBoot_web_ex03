package org.zerock.ex03.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data // Getter/Setter, toString(), equals(), hashCode() 자동생성
@Builder(toBuilder = true)
public class SampleDTO {
    private Long sno;
    private String first;
    private String last;
    private LocalDateTime regTime;
}
