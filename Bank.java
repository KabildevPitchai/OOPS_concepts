package gettersetter;    

public class Bank
{
	
private int balance;

private int acc_num;
	
public int getAcc_num()
{
	return this.acc_num;
}

public void setAcc_num(int acc_num)
{
	this.acc_num=acc_num;
}
	
public int getBalance()
{
	return this.balance; //its goes to line 6 
}
	
public void setBalance(int balance)
{
	this.balance=balance; //after code execute its goes to line 22 becoz using THIS KEYWORD , SO CURRENT OBJ CALLED....
}
	
}