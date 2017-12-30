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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://s722.bootstrapui.v25.scoreqa.brainjocks.com/selenium-kitchen-sink/components-with-behaviors.aspx')

WebUI.verifyElementNotVisible(findTestObject('Page_Components With Behaviors/Modal'))

WebUI.verifyElementPresent(findTestObject('Page_Components With Behaviors/Open Modal Button'), 0)

WebUI.click(findTestObject('Page_Components With Behaviors/Page_Components With Behaviors/a_Open Modal'))

WebUI.verifyElementPresent(findTestObject('Page_Components With Behaviors/a_Close'), 0)

WebUI.verifyElementVisible(findTestObject('Page_Components With Behaviors/Modal'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Components With Behaviors/a_Close'))

WebUI.verifyElementNotVisible(findTestObject('Page_Components With Behaviors/Modal'))

WebUI.closeBrowser()
