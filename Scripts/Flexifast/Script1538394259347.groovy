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

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView10 - Renovasi Rumah'), 5)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView9 - Daftar Sekarang'), 5)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView6 - Pilih Tujuan'), 10)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView2 - Handphonegadgettablet'), 5)

Mobile.tap(findTestObject('My Home Credit Indonesia/Flexifast/obj_calc_page/android.widget.LinearLayout12'), 5)

Mobile.tap(findTestObject('My Home Credit Indonesia/Flexifast/android.widget.RelativeLayout4'), 5)

Mobile.scrollToText('Lanjutkan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView12 - Lanjutkan'), 3)

Mobile.scrollToText('UPLOAD', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.Button0 - UPLOAD'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/Flexifast/ff_ktp_kamera_page/(Old kamera ktp button) android.widget.ImageButton1'), 
    3)

Mobile.scrollToText('UPLOAD', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.Button1 - UPLOAD'), 3)

Mobile.scrollToText('Lanjutkan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/Flexifast/Flexifast selfie page/android.widget.TextView16 - LANJUTKAN'), 
    0)

Mobile.tap(findTestObject('My Home Credit Indonesia/Flexifast/Flexifast selfie page/(button kamera)android.widget.ImageView10'), 
    3)

Mobile.tap(findTestObject('My Home Credit Indonesia/Flexifast/Flexifast selfie page/(selfie ceklis kamera)android.widget.ImageView3'), 
    0)

Mobile.scrollToText('Lanjutkan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView9 - LANJUTKAN'), 3)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView3 - Pilih Bank'), 10)

Mobile.setText(findTestObject('My Home Credit Indonesia/android.widget.EditText0 - Cari Nama Bank'), 'bca', 5)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView1 - Bca'), 5)

Mobile.setText(findTestObject('My Home Credit Indonesia/android.widget.EditText0'), '1300190983', 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView5 - Verifikasi Nomor Rekening'), 3)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Lanjutkan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView8 - LANJUTKAN'), 3)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('My Home Credit Indonesia/android.widget.EditText0 (1)'), 'testing flexifast', 3)

Mobile.scrollToText('Lanjutkan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView12 - LANJUTKAN (1)'), 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/android.widget.EditText0 (2)'), 'yogaaaa', 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/android.widget.EditText2'), '81213254410', 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView7 - Pilih Hubungan'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView2 - Ayah'), 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/android.widget.EditText3'), 'aryoooo', 3)

Mobile.scrollToText('Lanjutkan', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('My Home Credit Indonesia/android.widget.EditText4'), '87886840568', 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView10 - Pilih Hubungan'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView4 - KakakAdik Laki-Laki'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView12 - LANJUTKAN (1)'), 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/android.widget.EditText0 (3)'), '15000000', 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/android.widget.EditText1'), '0', 3)

Mobile.scrollToText('Kirim', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('My Home Credit Indonesia/android.widget.EditText1 (1)'), '1', 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/android.widget.EditText2 (1)'), '5', 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.CheckBox0'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.TextView11 - Kirim'), 5)

Mobile.tap(findTestObject('My Home Credit Indonesia/android.widget.Button0 - LANJUTKAN (1)'), 15)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

