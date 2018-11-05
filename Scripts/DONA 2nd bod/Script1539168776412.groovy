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

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView4 - LANJUT'), 5)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView8 - ISI DATA TAMBAHAN'), 5)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView4 - -- Pilih --'), 0)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView6 - Universitas - Sarjana'), 
    3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView6 - -- Pilih --'), 0)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView1 - Belum Kawin'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView9 - LANJUT ISI KONTAK KERABAT'), 
    3)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.EditText0'), 'kontak satu', 0)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.EditText1'), '899999999999', 0)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView10 - - Pilih -'), 0)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView2 - Ayah'), 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.EditText2'), 'kontak dua', 0)

Mobile.scrollToText('LANJUT ISI PEKERJAAN', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.EditText1 (1)'), '87777777777777', 
    0)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView7 - - Pilih -'), 0)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView4 - KakakAdik Laki-Laki'), 
    3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView9 - LANJUT ISI PEKERJAAN'), 
    3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView8 - -- Pilih --'), 0)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView6 - Manager'), 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.EditText0 (1)'), 'companyss', 0)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView11 - -- Pilih --'), 0)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView6 - Layanan'), 0)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.EditText1 (2)'), '5', 0)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.EditText2 (1)'), '5', 0)

Mobile.scrollToText('LANJUT ISI REKENING', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView11 - LANJUT ISI DATA REKENING'), 
    3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView10 - -- Pilih --'), 0)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.EditText0 (2)'), 'bca', 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView1 - Bca'), 3)

Mobile.setText(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.EditText0 (3)'), '1300190983', 
    0)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView12 - Verifikasi Nomor Rekening'), 
    3)

Mobile.scrollToText('LIHAT RANGKUMAN', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView12 - LIHAT RANGKUMAN'), 3)

Mobile.scrollToText('AJUKAN PINJAMAN', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView20 - AJUKAN PINJAMAN'), 3)

Mobile.tap(findTestObject('My Home Credit Indonesia/DONA/Dona 2nd bod/android.widget.TextView1 - Selesai'), 3)

