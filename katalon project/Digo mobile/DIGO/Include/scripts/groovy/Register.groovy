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



class Register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Open the app mobile")
	def openAppDigo() {
		Mobile.startApplication('D:\\Ra\\file kuliah\\semester 7\\katalon project\\Digo mobile\\07-12-2022 (save seasson dan logic login done).apk', true)
	}

	@When("User go to register page")
	def registPage() {
		Mobile.tap(findTestObject('Object Repository/TC002-Register/android.view.View'), 0)
		Mobile.tap(findTestObject('Object Repository/TC002-Register/android.view.View'), 0)
		Mobile.tap(findTestObject('Object Repository/TC002-Register/android.view.View'), 0)
		Mobile.tap(findTestObject('Object Repository/TC002-Register/android.widget.Button'), 0)
	}

	@And("User enters username (.*) in the field username")
	def enterUsername(String username) {
		println ("Username : " +username)
		Mobile.tap(findTestObject('Object Repository/TC002-Register/android.widget.ImageView - Masukan username'), 0)
		Mobile.setText(findTestObject('Object Repository/TC002-Register/android.widget.ImageView - Masukan username'), username, 0)
	}

	@And("User enters email (.*) in the field email")
	def enterEmail(String email) {
		println ("Email : " +email)
		Mobile.tap(findTestObject('Object Repository/TC002-Register/android.widget.ImageView - Masukan email'), 0)
		Mobile.setText(findTestObject('Object Repository/TC002-Register/android.widget.ImageView - Masukan email'), email, 0)
	}

	@And("User enters password (.*) in the field password")
	def enterPassword(String password) {
		println ("Password : " +password)
		Mobile.tap(findTestObject('Object Repository/TC002-Register/android.widget.EditText -'), 0)
		Mobile.setText(findTestObject('Object Repository/TC002-Register/android.widget.EditText -'), password, 0)
	}

	@And("User enters confirm password (.*) in the field confirm password")
	def enterConfirmPw(String confirmpw) {
		println ("Confirm Password : " +confirmpw)
		Mobile.tap(findTestObject('Object Repository/TC002-Register/android.widget.EditText - Konfirmasi kata sandi'), 0)
		Mobile.setText(findTestObject('Object Repository/TC002-Register/android.widget.EditText - Konfirmasi kata sandi'), confirmpw, 0)
	}

	@And("User enters valid code referral (.*) in the field code referral")
	def enterCodeReferral(String referral) {
		println ("Code Referral : " +referral)
		Mobile.tap(findTestObject('Object Repository/TC002-Register/android.widget.EditText - Kode Refferal'), 0)
		Mobile.setText(findTestObject('Object Repository/TC002-Register/android.widget.EditText - Kode Refferal'), referral, 0)
	}

	@And("Click on register button in register page")
	def clickRegistBtn() {
		Mobile.tap(findTestObject('Object Repository/TC002-Register/android.view.View (1)'), 0)
	}

	@Then("Show alert error state")
	def showErrorState() {
		Mobile.getAttribute(findTestObject('Object Repository/Register/android.view.View (1)'), 'text', 0)
	}
}