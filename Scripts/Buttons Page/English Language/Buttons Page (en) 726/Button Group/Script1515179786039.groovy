import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Open browser'
WebUI.openBrowser(GlobalVariable.G_url_2a)

WebUI.verifyTextNotPresent('*Server Error in*', false)

WebUI.verifyElementPresent(findTestObject('Page_Button Components (2)/Button Group/Buttons Toolbar'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Button Components (2)/Button Group/a_Button 2'), 0)

WebUiBuiltInKeywords.verifyElementClickable(findTestObject('Page_Button Components (2)/Button Group/a_Button 2'))

WebUI.verifyElementPresent(findTestObject('Page_Button Components (2)/Button Group/a_Button 3'), 0)

WebUiBuiltInKeywords.verifyElementClickable(findTestObject('Page_Button Components (2)/Button Group/a_Button 3'))

WebUI.closeBrowser()

