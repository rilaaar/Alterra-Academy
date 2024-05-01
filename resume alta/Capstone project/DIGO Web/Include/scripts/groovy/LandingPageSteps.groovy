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



class LandingPageSteps {
	
	@Given("I set an url")
	def openUrl() {
		println ("I am inside openUrl")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://digitaloutlet.vercel.app/#beranda')
	}

	@When("I am on the home page")
	def homePage() {
		println ("I am inside homePage")
		WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Page_React App/h1_DIGO (DIGital Outlet)'), 0)
	}

	@Then("Home page succsess showed")
	def showDownloadBtn() {
		println ("I am inside showDownloadBtn")
		WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Page_React App/button_Download app'), 0)
	}
	
	@And ("I click about")
	def clickAbout() {
		println ("I am inside clickAbout")
		WebUI.click(findTestObject('Object Repository/AboutPage/Page_React App/a_Tentang'))
	}
	
	@Then("About page succsess showed")
	def showAboutPage() {
		println ("I am inside showAboutPage")
		WebUI.verifyElementPresent(findTestObject('Object Repository/AboutPage/Page_React App/img_Download app_phone'), 0)
	}
	
	@And ("I click feature")
	def clickFeature() {
		println ("I am inside clickFeature")
		WebUI.click(findTestObject('Object Repository/FeaturePage/Page_React App/a_Fitur'))
	}
	
	@Then("Features page succsess showed")
	def showFeaturesPage() {
		println ("I am inside showFeaturesPage")
		WebUI.verifyElementPresent(findTestObject('Object Repository/AboutPage/Page_React App/img_Download app_phone'), 0)
	}
	
	@And ("I click contact")
	def clickContact() {
		println ("I am inside clickContact")
		WebUI.click(findTestObject('Object Repository/ContactPage/Page_React App/a_Kontak'))
	}
	
	@Then("Contact page succsess showed")
	def showContactPage() {
		println ("I am inside showContactPage")
		WebUI.verifyElementPresent(findTestObject('Object Repository/ContactPage/Page_React App/h1_Kontak DIGO nihh'), 0)
		WebUI.closeBrowser()
	}
}