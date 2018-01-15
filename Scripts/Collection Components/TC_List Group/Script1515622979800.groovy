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

'Verify List group component is displayd'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Page_Collection Components (1)/List Group Objects/List Group'), 
    0)

'Verify title for the 1 List gruop item is present'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Page_Collection Components (1)/List Group Objects/1 List group item title'), 
    0)

'Verify body for the 1 List gruop item is present'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Page_Collection Components (1)/List Group Objects/1 List group item body'), 
    0)

'Verify title for the 2 List gruop item is present'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Page_Collection Components (1)/List Group Objects/2 List group otem title'), 
    0)

'Verify body for the 2 List body is present'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Page_Collection Components (1)/List Group Objects/2 List group item body'), 
    0)

