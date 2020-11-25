package corejavaprograms;

class Irctc
{
	private String mobileNum;
	private String emailId;
	private String userName;
	private String password;
	private String confirmPassword;
	private String firstName;
	private String lastName;
	private String dob;
	private String nationality;
	
	public String getMobileNum()
	{
		return mobileNum;
	}
	public void setMobileNum(String mobileNum)
	{
		this.mobileNum = mobileNum;
	}
	public String getEmailId()
	{
		return emailId;
	}
	public void setEmailId(String emailId)
	{
		
		emailId = emailId+"@gmail.com";
		this.emailId=emailId;

	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getConfirmPassword()
	{
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword)
	{
		this.confirmPassword = confirmPassword;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getDob()
	{
		return dob;
	}
	public void setDob(String dob)
	{
		this.dob = dob;
	}
	public String getNationality()
	{
		return nationality;
	}
	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}
	
}
public class IrctcForm
{
	public static void main(String[] args)
	{
		Irctc irc=new Irctc();
		irc.setMobileNum("8790197899");
		irc.setEmailId("divyareddymuskula");
		irc.setUserName("DivyaReddyMuskula");
        irc.setPassword("divya1996");
        irc.setConfirmPassword("divya1996");
        irc.setFirstName("Divya");
        irc.setLastName("Reddy");
        irc.setDob("08/06/1996");
        irc.setNationality("Indian");
        System.out.println("IRCTC Registration Form Page");
        System.out.println("========================");
        System.out.println(irc.getMobileNum());
        System.out.println(irc.getEmailId());
        System.out.println(irc.getUserName());
        System.out.println(irc.getPassword());
        System.out.println(irc.getConfirmPassword());
        System.out.println(irc.getFirstName());
        System.out.println(irc.getLastName());
        System.out.println(irc.getDob());
        System.out.println(irc.getNationality());
        
     }
}
