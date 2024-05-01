package produk
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



class AddProductSteps {

	@Given("I set an url admin website")
	def openUrl() {
		println ("I am inside openUrl")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://digitaloutlet.vercel.app/beranda')
	}

	@When("I am on the dashboard")
	def dashboard() {
		println ("I am inside dashboard")
		WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/Page_React App/h1_Beranda'), 0)
	}

	@And("I go to product page")
	def productPage() {
		println ("I am inside productPage")
		WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/p_Produk'))
	}

	@And("I click add button")
	def clickAddBtn() {
		println ("I am inside clickAddBtn")
		WebUI.click(findTestObject('Object Repository/Add product/Page_React App/svg'))
	}

	@And("I input (.*) product name, category, (.*) minimum transaction and (.*) coin transaction")
	def inputDataAddP(String product, String minTrans, String coin) {
		println ("I am inside inputDataAddP")
		WebUI.setText(findTestObject('Object Repository/Add product/Page_React App/input_Produk_produk'), product, 0)
		WebUI.click(findTestObject('Object Repository/Add product/Page_React App/select_Kategori Produk.123as1232132132d'))
		WebUI.setText(findTestObject('Object Repository/Add product/Page_React App/input_Minimal Transaksi_transaksi'), minTrans, 0)
		WebUI.setText(findTestObject('Object Repository/Add product/Page_React App/input_Koin Transaksi_koin'), coin, 0)
	}

	@And("I click create button")
	def clickCreateBtn() {
		println ("I am inside clickCreateBtn")
		WebUI.click(findTestObject('Object Repository/Add product/Page_React App/button_Buat'))
	}

	@Then("The product success added")
	def successAddedProduct() {
		println ("I am inside successAddedProduct")
		WebUI.closeBrowser()
	}
	

}