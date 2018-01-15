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

'Verify 1 Tab s displayed'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Page_Collection Components (1)/Tabs Objects/1 Tab_Panel One'), 
    0)

'Verify 2 Tab is displayed'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Page_Collection Components (1)/Tabs Objects/2 Tab_Panel Two'), 
    0)

'Verify 3 Tab is displayed'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Page_Collection Components (1)/Tabs Objects/3 Tab_Tab with Deep Linking'), 
    0)

'Verify 1 Tab body is visible'
WebUI.verifyElementVisible(findTestObject('Page_Collection Components (1)/Tabs Objects/1 Tab body'))

'Verify 2 Tab body is not visible'
WebUI.verifyElementNotVisible(findTestObject('Page_Collection Components (1)/Tabs Objects/2 Tab body'))

'Verify 3 Tab body is not visible'
WebUiBuiltInKeywords.verifyElementNotVisible(findTestObject('Page_Collection Components (1)/Tabs Objects/3 Tab_Tab with Deep Linking'))

'Click on the Tab 2'
WebUI.click(findTestObject('Page_Collection Components (1)/Tabs Objects/2 Tab_Panel Two'))

'Verify that 2 Tab body is visible'
WebUiBuiltInKeywords.verifyElementVisible(findTestObject('Page_Collection Components (1)/Tabs Objects/2 Tab body'))

'Verify that 1 Tab body is not visible'
WebUiBuiltInKeywords.verifyElementNotVisible(findTestObject('Page_Collection Components (1)/Tabs Objects/1 Tab body'))

'Verify that 3 Tab body is not visible'
WebUiBuiltInKeywords.verifyElementNotVisible(findTestObject('Page_Collection Components (1)/Tabs Objects/3 Tab body'))

'Click on the Tab 3'
WebUiBuiltInKeywords.click(findTestObject('Page_Collection Components (1)/Tabs Objects/3 Tab_Tab with Deep Linking'))

'Verify that 3 Tab body is visible'
WebUiBuiltInKeywords.verifyElementVisible(findTestObject('Page_Collection Components (1)/Tabs Objects/3 Tab body'))

'Verify that 1 Tab body is not visible'
WebUiBuiltInKeywords.verifyElementNotVisible(findTestObject('Page_Collection Components (1)/Tabs Objects/1 Tab body'))

'Verify 2 Tab body is not visible'
WebUI.verifyElementNotVisible(findTestObject('Page_Collection Components (1)/Tabs Objects/2 Tab body'))

