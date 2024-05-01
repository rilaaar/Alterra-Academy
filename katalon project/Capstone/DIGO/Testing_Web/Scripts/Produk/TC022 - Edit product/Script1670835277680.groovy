import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://digitaloutlet.vercel.app/login')

WebUI.setText(findTestObject('Object Repository/Edit product/Page_React App/input_Login_email (1)'), 'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Edit product/Page_React App/input_Login_password (1)'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Edit product/Page_React App/svg'))

WebUI.click(findTestObject('Object Repository/Edit product/Page_React App/button_Masuk_1'))

WebUI.click(findTestObject('Object Repository/Edit product/Page_React App/p_Produk'))

WebUI.click(findTestObject('Object Repository/Edit product/Page_React App/button'))

WebUI.setText(findTestObject('Object Repository/Edit product/Page_React App/input_Koin Transaksi_coins'), '15')

WebUI.click(findTestObject('Object Repository/Edit product/Page_React App/button_Simpan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Edit product/Page_React App/td_E-money'), 0)

WebUI.closeBrowser()

