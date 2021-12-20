package pompages;

import wrappers.GenericWrappers;

public class GuestUserLogin extends GenericWrappers {

		public GuestUserLogin GuestUser() {
			clickById("profile-tab");
			return this;
		}
		public GuestUserLogin enterUserName(String email) {
			enterById("modalLRInput10", email);
			return this;
		}
		public GuestUserLogin enterMobileNumber(String mobileNumber) {
			enterByName("mobileNo",mobileNumber);
			return this;
		}
		public void loginButton() throws InterruptedException {
			clickByXpath("/html/body/app-root/login/div/div/div/div/div/div[2]/div/form/div[3]/button");
			Thread.sleep(1000);
		}
}
