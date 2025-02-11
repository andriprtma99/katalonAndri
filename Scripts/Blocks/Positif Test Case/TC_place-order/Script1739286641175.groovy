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

WebUI.click(findTestObject('Spy Object/Cart Page/span_CheckOut'))

WebUI.verifyElementVisible(findTestObject('Spy Object/Cart Page/mat-verif_Check Out'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Spy Object/Place Order Page/input_Name'), 'Andri')

WebUI.setText(findTestObject('Spy Object/Place Order Page/input_Address-Line1'), 'Kantor')

WebUI.setText(findTestObject('Spy Object/Place Order Page/input_Address-Line2'), 'My Home')

WebUI.setText(findTestObject('Spy Object/Place Order Page/input_Pincode'), '123456')

WebUI.setText(findTestObject('Spy Object/Place Order Page/input_State'), 'Open')

WebUI.click(findTestObject('Spy Object/Place Order Page/span_btn-Place Order'))

WebUI.verifyElementVisible(findTestObject('Spy Object/Place Order Page/th_verif-OrderId'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Spy Object/Place Order Page/th_verif-OrderedOn'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Spy Object/Place Order Page/th_verif-OrderTotal'), FailureHandling.CONTINUE_ON_FAILURE)

