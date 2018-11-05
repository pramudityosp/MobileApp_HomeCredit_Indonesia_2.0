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

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/DONA Telco/android.widget.ImageView5'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/DONA Telco/android.widget.TextView8 - AJUKAN SEKARANG'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/DONA Telco/android.widget.TextView4 - LANJUTKAN'), 3)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/DONA Telco/android.widget.TextView8 - HUBUNGI SAYA LEWAT TELEPON'), 
    3)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/DONA Telco/android.widget.EditText0'), 'hcis8mobile@gmail.com', 
    1)

Mobile.scrollToText('HUBUNGI SAYA', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/DONA Telco/android.widget.TextView9 - HUBUNGI SAYA'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/DONA Telco/android.widget.TextView0 - SELESAI'), 5)

Mobile.pressBack()

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

