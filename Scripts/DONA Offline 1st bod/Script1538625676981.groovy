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

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.ImageView5 (Dona Banner 2)'), 5)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView6 - AJUKAN SEKARANG'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView4 - LANJUTKAN (1)'), 3)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView7 - MULAI PENGAJUAN (1)'), 5)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.ImageView1 (3)'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView9 - LANJUTKAN (1)'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView0 - GANTI KAMERA (1)'), 5)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.ImageView10'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.ImageView2'), 1)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView2 - LANJUTKAN'), 20)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.ImageView2 (1)'), 3)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('LANJUTKAN', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView15 - LANJUTKAN'), 10)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.ImageButton1 (2)'), 10)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView2 - LANJUTKAN (1)'), 10)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView1 - MULAI PENGAJUAN'), 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/android.widget.EditText0'), '1234561701931125', 0)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/android.widget.EditText1'), 'DONNAATTTTT LAGIIII', 0)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/android.widget.EditText2'), 'Offline', 0)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/android.widget.EditText3'), 'Jakarta', 0)

Mobile.scrollToText('LANJUT ISI KONTAK', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/android.widget.EditText1 (1)'), 'MOMMMYY DONAT', 0)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView3 - LANJUT ISI KONTAK'), 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/android.widget.EditText1 (2)'), 'hcis8mobile@gmail.com', 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView8 - LANJUT ISI ALAMAT'), 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/android.widget.EditText0 (1)'), 'Testing jalan ktp donnaa', 
    3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.LinearLayout23'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView5 - Aceh Selatan'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.LinearLayout24'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView7 - Kota Bahagia'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView13 - -Pilih-'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView1 - Alur Dua Mas'), 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/android.widget.EditText1 (3)'), '1', 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/android.widget.EditText2 (1)'), '2', 3)

Mobile.scrollToText('LANJUT ISI PENGHASILAN', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView11 - LANJUT ISI PENGHASILAN'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView10 - --Pilih--'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView1 - KaryawanSwasta'), 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/android.widget.EditText0 (2)'), '15000000', 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/android.widget.EditText1 (4)'), '0', 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView16 - LIHAT RANGKUMAN'), 3)

Mobile.scrollToText('AJUKAN PINJAMAN', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.CheckBox0'), 5)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView16 - AJUKAN PINJAMAN'), 5)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.Button0 - LANJUTKAN'), 5)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/android.widget.TextView1 - Selesai'), 10)

Mobile.pressBack()

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

