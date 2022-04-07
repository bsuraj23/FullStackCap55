package abcd.demoabcd.payload;

import abcd.demoabcd.Validation.ValidMovie;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
@Data
public class PutMovie {
    @NotNull
    @NotEmpty
    @ValidMovie
    private String MovieName;
    @NotEmpty
    @NotNull
    private Long MovieId;
}
