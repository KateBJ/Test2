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

verifyTrue(selenium.isElementPresent('css=div.container div.score-column1 div.score-center div.score-button-toolbar div.score-button-menu button.btn'))

verifyEquals('Text text text Toggle', selenium.getText('css=div.container div.score-column1 div.score-center div.score-button-toolbar div.score-button-menu button.btn'))

verifyTrue(selenium.isElementPresent('css=div.container div.score-column1 div.score-center div.score-button-toolbar div.score-button-menu button.btn span.caret'))

verifyFalse(selenium.isVisible('css=div.score-button-menu.open ul.dropdown-menu'))

selenium.clickAt('css=div.container div.score-column1 div.score-center div.score-button-toolbar div.score-button-menu button.btn span.caret', 
    '')

verifyTrue(selenium.isVisible('css=div.score-button-menu.open ul.dropdown-menu'))

verifyTrue(selenium.isElementPresent('//div/div[2]/div/div/div/div[3]/ul/li[1]/a'))

verifyEquals('Button Menu Link 1', selenium.getText('//div/div[2]/div/div/div/div[3]/ul/li[1]/a'))

verifyTrue(selenium.isElementPresent('css=div.score-button-toolbar div.score-button-menu.open ul.dropdown-menu li.score-button-menu-item a[href="/selenium-kitchen-sink.aspx"]'))

verifyTrue(selenium.isElementPresent('//div/div[2]/div/div/div/div[3]/ul/li[2]/a'))

verifyEquals('Button Menu Link 2', selenium.getText('//div/div[2]/div/div/div/div[3]/ul/li[2]/a'))

verifyTrue(selenium.isElementPresent('//div/div[2]/div/div/div/div[3]/ul/li[3]/span'))

verifyTrue(selenium.isElementPresent('//div/div[2]/div/div/div/div[3]/ul/li[4]/a'))

verifyEquals('Button Menu Link 3', selenium.getText('//div/div[2]/div/div/div/div[3]/ul/li[4]/a'))

selenium.clickAt('css=div.container div.score-column1 div.score-center div.score-button-toolbar div.score-button-menu button.btn span.caret', 
    '')

verifyFalse(selenium.isVisible('css=div.score-button-menu.open ul.dropdown-menu'))

WebUI.verifyElementVisible(findTestObject(null))

