package day9;

import java.util.Random;

public class OTPGenrator {
	public static int genrateOTP() {
		Random r = new Random();
		int otp = r.nextInt(999999) + 100000;
		return otp;
	}
}
