package cucumberrr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLocators {

	public class LocatorPom extends PomBaseclass {
		public LocatorPom() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(id = "rental1")
		private WebElement monthRent;

		@FindBy(id = "local_minutes")
		private WebElement freeLoc;
		
		@FindBy(id = "inter_minutes")
		private WebElement freeInteg;

		@FindBy(id = "sms_pack")
		private WebElement treeSMS;
		
		@FindBy(id = "minutes_charges")
		private WebElement locCharg;
		
		@FindBy(id = "inter_charges")
		private WebElement intCharg;
		
		@FindBy(id = "sms_charges")
		private WebElement sMSCharge;
		
		@FindBy(name = "submit")
		private WebElement btnsubmit;
		
		@FindBy(tagName = "h2")
		private WebElement check;
		
		
		public WebElement getmonthRent() {
			return monthRent;
		}

		public WebElement getfreeLoc() {
			return freeLoc;
		}

		public WebElement getfreeInteg() {
			return freeInteg;
		}

		public WebElement getsMSCharge() {
			return sMSCharge;
		}

		public WebElement gettreeSMS() {
			return treeSMS;
		}

		public WebElement getlocCharg() {
			return locCharg;
		}

		public WebElement getintCharg() {
			return intCharg;
		}

		public WebElement getbtnsubmit() {
			return btnsubmit;
		}

		public WebElement getcheck() {
			return check;
		}

	

	}

}
