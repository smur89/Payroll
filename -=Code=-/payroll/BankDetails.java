package payroll;

public class BankDetails
{
	private String accNo;
	private String sortCode;
	private String bankName;
	
	public BankDetails(String b, String a, String s)
	{
		this.bankName=b;
		this.accNo=a;
		this.sortCode=s;
	}
	
	public void setAccountNo(String acc)
	{
		this.accNo=acc;
	}
	public String getAccountNo()
	{
		return this.accNo;
	}
	public void setSortCode(String sc)
	{
		this.sortCode=sc;
	}
	public String getSortCode()
	{
		return this.sortCode;
	}
	public void setBankName(String name)
	{
		this.bankName=name;
	}
	public String getBankName()
	{
		return this.bankName;
	}
}
