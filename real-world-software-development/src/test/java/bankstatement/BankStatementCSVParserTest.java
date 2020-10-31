package bankstatement;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

public class BankStatementCSVParserTest {

    private final BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();

    @Test
    public void shouldParseOneCorrectLine() {
        //given
        final String line = "30-01-2017,-50,Tesco";

        final BankTransaction result = bankStatementCSVParser.parseFrom(line);

        //when
        final BankTransaction expected = new BankTransaction(LocalDate.of(2017, Month.JANUARY, 30), -50, "Tesco");

        //then
        assertThat(expected.getDate()).isEqualTo(result.getDate());
        assertThat(expected.getDescription()).isEqualTo(result.getDescription());
        assertThat(expected.getAmount()).isEqualTo(result.getAmount());
    }
}
