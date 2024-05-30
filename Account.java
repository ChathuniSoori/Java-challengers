public class Account{
	private String name;
	private String accNum;
	private String amountType;
	private double balance;

	public Account(String name,String accNum,String amountType,double balance){
		this.name=name;
		this.accNum=accNum;
		this.amountType=amountType;
		this.balance=balance;	
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getAccNum(){
		return this.accNum;
	}
	public void setAccNum(String accNum){
		this.accNum=accNum;
	}
	public String getAmountType(){
		return this.amountType;
	}
	public void setAmountType(String amountType){
		this.amountType=amountType;
	}
	public double getBalance(){
		return this.balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
}