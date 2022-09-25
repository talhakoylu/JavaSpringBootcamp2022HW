public class Main {
    public static void main(String[] args) {
        LoanUi loanUi = new LoanUi();
        loanUi.calculateLoan(new AgricultureLoanManager());
        loanUi.calculateLoan(new TeacherLoanManager());
    }
}