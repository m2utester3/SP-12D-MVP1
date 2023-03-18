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

'Windows - APK absolute path\n'
not_run: Mobile.startApplication('com.maybank2u.life', false)

'Windows - APK relative path\n'
not_run: Mobile.startApplication('com.maybank2u.life', false)

'MAC - APK absolute path'
not_run: Mobile.startApplication('/users/mosaj/git/SP12D-MV1/MAE.apk', false)

'MAC - APK relative path'
Mobile.startApplication('MAE.apk', false)

WebUI.delay(1)

Mobile.takeScreenshot()

not_run: Mobile.getText(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Maybank2u'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Maybank2u'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Enter your 6-digit PIN'), 
    0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\MAE\\2.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - 1'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Total Balance'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Savings Account-i'), 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\MAE\\3.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Savings Account-i'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - View Transactions'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Transfer'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Transfer'), 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\MAE\\4.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.setText(findTestObject('MAE Transfer/android.widget.EditText - M2U password'), findTestData('DevOps').getValue(
        2, 1), 0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.tap(findTestObject('MAE Transfer/android.widget.TextView - Continue'), 0)

not_run: WebUI.delay(5)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\MAE\\5.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - MAE'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Enter amount'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - 1 (1)'), 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\MAE\\6.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.ImageView'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Enter recipient reference'), 
    0)

not_run: Mobile.setText(findTestObject('Object Repository/MAE Transfer/android.widget.EditText'), 'self transfer', 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\MAE\\7.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.hideKeyboard()

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Continue (1)'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Transfer Now'), 0)

not_run: Mobile.tap(findTestObject('MAE Transfer/android.widget.TextView - Transfer Now'), 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\MAE\\8.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Transfer successful'), 
    0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\MAE\\9.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - 501652585M'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Share Receipt'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Successful'), 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\MAE\\10.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Transfer/android.widget.ImageView (1)'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Transfer/android.widget.TextView - Done'), 0)

not_run: Mobile.tap(findTestObject('MAE Transfer/android.widget.TextView - Done'), 0)

Mobile.closeApplication()

