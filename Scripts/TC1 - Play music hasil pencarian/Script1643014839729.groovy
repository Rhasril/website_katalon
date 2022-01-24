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

WebUI.navigateToUrl('https://music.youtube.com/')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_YouTube Music/tp-yt-iron-icon_Library_icon'))

WebUI.setText(findTestObject('Object Repository/Page_YouTube Music/input_Search_input'), search_item)

WebUI.sendKeys(findTestObject('Object Repository/Page_YouTube Music/input_Search_input'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Page_YouTube Music/yt-formatted-string_Top result'), 'Top result')

WebUI.click(findTestObject('Page_YouTube Music/ytmusic-play-button-renderer_Top result_play-button'))

if (true) {
    WebUI.getText(findTestObject('Page_YouTube Music/div_Skip Ad'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Page_YouTube Music/div_Skip Ad'))
}

WebUI.delay(3)

WebUI.click(findTestObject('Page_YouTube Music/yt-formatted-string_No thanks'))

WebUI.delay(30)

WebUI.closeBrowser()

