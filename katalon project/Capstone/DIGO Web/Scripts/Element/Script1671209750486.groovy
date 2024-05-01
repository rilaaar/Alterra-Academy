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

WebUI.navigateToUrl('https://digitaloutlet.vercel.app/beranda')

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/h1_Beranda'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/p_Agen'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/th_Agen'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/p_Transaksi'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/h1_Transaksi'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/p_Koin'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/h1_Koin'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/p_Produk'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/th_Produk'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/p_Kategori'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/th_Nama Kategori'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/p_Keuangan'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/h1_Keuangan'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/p_Pembayaran'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/h1_Pembayaran'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/p_Berkas'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_React App/h1_Berkas'))

WebUI.closeBrowser()

