package bankstatement;

import java.util.List;

public interface BankStatemmentParser {

    BankTransaction parseFrom(String line);

    List<BankTransaction> parseLineFrom(List<String> lines);
}
