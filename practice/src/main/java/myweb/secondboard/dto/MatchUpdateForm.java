package myweb.secondboard.dto;

import lombok.Getter;
import lombok.Setter;
import myweb.secondboard.web.CourtType;
import myweb.secondboard.web.MatchType;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class MatchUpdateForm {

    private Long id;

    @NotNull
    @Size(min = 1, max = 30, message = "1에서 30자 이내로 입력해주세요.")
    private String matchTitle;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate matchDate;

    @DateTimeFormat(pattern = "HH:mm")
    @NotNull
    private LocalTime matchTime;

    @NotNull
    private MatchType matchType;

    @NotNull
    private CourtType courtType;

    @NotNull @Size(min = 1, max = 144, message = "입력해주세요.")
    private String matchPlace;

    @Override
    public String toString() {
        return "MatchUpdateForm{" +
                "matchTitle='" + matchTitle + '\'' +
                ", matchDate=" + matchDate +
                ", matchTime=" + matchTime +
                ", matchType=" + matchType +
                ", courtType=" + courtType +
                ", matchPlace='" + matchPlace + '\'' +
                '}';
    }
}


