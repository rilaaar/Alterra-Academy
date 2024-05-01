import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to login page")
	def navigateToLoginPage() {
		println ("\n I am inside navigateToLoginPage")

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}

	@When("Click icon arrow Login1")
	def clickIconArrow() {
		println ("I am inside Login Page")

		WebUI.click(findTestObject('Object Repository/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-sign-i_3d16a9'))
	}

	@And("User enters email (.*) field in Login")
	def enterDataRegisterUser1(String email) {
		println ("\n I am inside enterDataLogin1 User")
		println ("Email : "+email)

		WebUI.setText(findTestObject('Object Repository/Page_frontend-web/input_Email_input-2275'), email)
	}

	@And("User enters password (.*) field in Login")
	def enterDataRegisterUser2(String password) {
		println ("\n I am inside enterDataLogin2 User")
		println ("Password : "+password)

		WebUI.setText(findTestObject('Object Repository/Page_frontend-web/input_Password_input-2278'), password)
	}


	@And("Click on login button in login page")
	def clickLoginButton() {
		println ("I am inside clickLoginButton")

		WebUI.click(findTestObject('Object Repository/Page_frontend-web/span_Login'))
	}

	@Then("User is navigate to homepage")
	def userNavigateToHomepage() {
		println ("I am inside homepage")
	}
}