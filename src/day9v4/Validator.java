package day9v4;
import java.util.*;
public class Validator extends BankDriverApp{
	Scanner sc = new Scanner(System.in);
	public  boolean validateDeposit(double depositAmount) {
		if(depositAmount>0) return true;
		else return false;
	}
	BankingServices bank = new HDFCBank(5000.00);
	public  boolean validatewithdraw(double withdrawAmount) {
		if(withdrawAmount>0 && withdrawAmount<=bank.checkBalance()) return true;
		else return false;
	}
	public boolean vaidateOTP() {
		int messageOTP=OTPGenrator.genrateOTP();
		System.out.println("OTP for the transaction is " +messageOTP + " valid for 15 minutes");
		System.out.println("Enter the OTP");
		int userEnteredOTP=sc.nextInt();
		if (messageOTP==userEnteredOTP) return true;
		else return false;
	}
	
	
}
