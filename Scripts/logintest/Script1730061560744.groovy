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

WebUI.navigateToUrl('https://cellphones.com.vn/')

WebUI.click(findTestObject('Object Repository/Page_CellphoneS - in thoi, laptop, tablet, _02726c/svg_icon-smember .cls-1               fill _346bba'))

WebUI.click(findTestObject('Object Repository/Page_CellphoneS - in thoi, laptop, tablet, _02726c/div_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_Smember  Tri n khch hng thn thit - Tch_99f8a1/input_ng nhp vi_box-input__main'), 
    taikhoan)

WebUI.setText(findTestObject('Object Repository/Page_Smember  Tri n khch hng thn thit - Tch_99f8a1/input_S IN THOI_box-input__main'), 
    matkhau)

WebUI.click(findTestObject('Object Repository/Page_Smember  Tri n khch hng thn thit - Tch_99f8a1/button_ng nhp'))

