package bankstatement;

import java.io.IOException;

public class AnalyzerApplication {
    public static void main(String[] args) throws IOException {
        final BankStatementAnalyzer bankStatementAnalyzer
                = new BankStatementAnalyzer();

        final BankStatemmentParser bankStatemmentParser
                = new BankStatementCSVParser();

        bankStatementAnalyzer.analyze(args[0], bankStatemmentParser);
    }
}
