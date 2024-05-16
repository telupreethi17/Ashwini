package crm.objectRepositoryUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class products {

	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement createProductImgBtn;
}
