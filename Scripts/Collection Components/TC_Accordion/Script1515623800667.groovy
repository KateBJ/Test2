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
WebUI.openBrowser('http://s825.bootstrapui.v21.scoreqa.brainjocks.com//selenium-kitchen-sink/collection-components')

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_1 panel title'), 
    0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion Component'), 
    0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_2 panel title'), 
    0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_3 panel title'), 
    0)

WebUiBuiltInKeywords.verifyElementVisible(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_1 panel body'))

WebUiBuiltInKeywords.verifyElementNotVisible(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_2 panel body'))

WebUiBuiltInKeywords.verifyElementNotVisible(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_3 panel body'))

WebUiBuiltInKeywords.click(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_2 panel title'))

WebUiBuiltInKeywords.verifyElementVisible(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_2 panel body'))

WebUiBuiltInKeywords.verifyElementNotVisible(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_1 panel body'))

WebUiBuiltInKeywords.verifyElementNotVisible(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_3 panel body'))

WebUiBuiltInKeywords.click(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_3 panel title'))

WebUiBuiltInKeywords.verifyElementVisible(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_3 panel body'))

WebUiBuiltInKeywords.verifyElementVisible(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_2 panel body'))

WebUiBuiltInKeywords.verifyElementNotVisible(findTestObject('Page_Collection Components (1)/Accordion Objects/Accordion_1 panel body'))

