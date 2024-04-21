package itmo.laba6;

public interface IClientable
{
    public String getBankName();
    public long getMoneyAccountId();
    public void changeBank(String newBankName, long newMoneyAccountId);
}
