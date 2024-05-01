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

WebUI.setText(findTestObject('Object Repository/Add product/Page_React App/input_Login_email'), 'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Add product/Page_React App/input_Login_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Add product/Page_React App/svg'))

WebUI.click(findTestObject('Object Repository/Add product/Page_React App/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Add product/Page_React App/p_Produk'))

WebUI.click(findTestObject('Object Repository/Add product/Page_React App/button_Reward Koin Transaksi_button_circle'))

WebUI.setText(findTestObject('Object Repository/Add product/Page_React App/input_Judul_name'), 'E-money')

WebUI.setText(findTestObject('Object Repository/Add product/Page_React App/textarea_o'), 'Top up uang elektronik')

WebUI.setText(findTestObject('Object Repository/Add product/Page_React App/input_Provider_provider'), 'Mandiri')

WebUI.setText(findTestObject('Object Repository/Add product/Page_React App/input_Masa Aktif (Hari)_active_period'), '30')

WebUI.setText(findTestObject('Object Repository/Add product/Page_React App/input_Harga (Rp)_price'), '20999')

WebUI.selectOptionByValue(findTestObject('Object Repository/Add product/Page_React App/select_Kategori Produk.EntertainmentPulsaPa_1dfa42'), 
    '22', true)

WebUI.setText(findTestObject('Object Repository/Add product/Page_React App/input_Minimal Transaksi_minimum_transaction'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Add product/Page_React App/input_Koin Transaksi_coins'), '10')

WebUI.click(findTestObject('Object Repository/Add product/Page_React App/button_Buat'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Add product/Page_React App/td_E-money'), 0)

WebUI.closeBrowser()

