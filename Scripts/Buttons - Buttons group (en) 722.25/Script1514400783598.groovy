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

WebUI.openBrowser('https://www.katalon.com/')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.katalon.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('http://s722.bootstrapui.v25.scoreqa.brainjocks.com/en/selenium-kitchen-sink/button-components')

assertFalse(selenium.isTextPresent('*Server Error in*'))

verifyTrue(selenium.isElementPresent('css=div.page-wrapper div.container div.score-column1 div.score-center div.score-button-toolbar div.score-button-group'))

verifyTrue(selenium.isElementPresent('//div/div[2]/div/div/div/div[2]/a[1]'))

verifyTrue(selenium.isElementPresent('//div/div[2]/div/div/div/div[2]/a[2]'))

verifyEquals('Button 2', selenium.getText('//div/div[2]/div/div/div/div[2]/a[1]'))

verifyEquals('Button 3', selenium.getText('//div/div[2]/div/div/div/div[2]/a[2]'))

verifyTrue(selenium.isElementPresent('css=div.score-button-toolbar div.score-button-group a.score-button[href="/selenium-kitchen-sink.aspx"]'))

verifyTrue(selenium.isElementPresent('css=div.score-button-toolbar div.score-button-group a.[\'Button 3\']score-button[href="/selenium-kitchen-sink.aspx"]'))

WebUI.openBrowser('s722.bootstrapui.v25.scoreqa.brainjocks.com')

WebUI.verifyElementNotPresent(findTestObject(null), 0)

