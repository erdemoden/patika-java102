package ObjectOrientedProgramming.Interface;

public class TosunBank implements  IBank{
    private String name;
    private String terminalId;
    private String password;

    public TosunBank(String name, String terminalId, String password) {
        this.name = name;
        this.terminalId = terminalId;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("İşlem Başarılı Oldu");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNo, String expiryDate, String cvc) {
        return true;
    }
}
