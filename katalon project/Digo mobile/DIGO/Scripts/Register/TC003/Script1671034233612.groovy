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

Mobile.startApplication('D:\\Ra\\file kuliah\\semester 7\\katalon project\\Digo mobile\\notification, tansaction, product, reedeem done.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Register/android.view.View (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.view.View (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.view.View (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.ImageView - Masukan username'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.ImageView - Masukan username'), 'sarahprb', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.ImageView - Masukan email'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.ImageView - Masukan email'), 'sarah@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText -'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText -'), 'Windows11', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Konfirmasi kata sandi'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Konfirmasi kata sandi'), 'Windows', 
    0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - ABC123, Kode Refferal'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - ABC123, Kode Refferal'), 'A45HYS7', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Register/android.view.View (4)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Register/android.view.View (12)'), 0)

Mobile.closeApplication()

