MSG91
===================
This Android Library has been developed for sending all kinds of SMS using MSG91 Platform.

Disclaimer - This library has only been developed by the developer for educational purpose. There is no intention to use this for commercial purpose. We do not have developed it to use it for any kind of commercial benefits.

----------

Getting started
===============
Gradle
------

Just add the "maven { url 'https://jitpack.io' }" in your root build.gradle of your project.

 	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

------

Just add the "implementation 'com.github.shubham7930:msg91:1.1'" in your build.gradle of your module.

    dependencies {
    ...
    implementation 'com.github.shubham7930:msg91:1.1'
    implementation 'com.android.volley:volley:1.1.1'
    ...
    }
------

Creating account at MSG91
===============
> -Login or create account at [MSG91](https://msg91.com/) to use the Library

> -Get your Authentication key
------

Lets get started
===============

There are 6 Classes to help you out for sending SMS.
1. TransactionalSMS
2. PromotionalSMS
3. SendEmailOTP
4. SendOTP
5. ReSendOTP
6. VerifyOTP

------
TransactionalSMS
===============
There are 6 static method for sending different kind of Transactional SMS

1. sendNow() - This method is use to send transactional sms instantly. 
It take 7 parameters (Context, Authentication Key, Mobile Number, Message, Sender Id, Contry Code, new ResponseListener())

2. sendLater() - This method is use to send transactional sms with specific delay which is specified by minute. 
It take 8 parameters (Context, Authentication Key, Mobile Number, Message, Sender Id, Contry Code, DelayInMinute, new ResponseListener())

3. sendSchedule() - This method is use to send transactional sms at specific time.  (Time - Y-m-d h:i:s (2020-01-01 10:10:00) Or Y/m/d h:i:s (2020/01/01 10:10:00) Or you can send unix timestamp (1577873400))
It take 8 parameters (Context, Authentication Key, Mobile Number, Message, Sender Id, Contry Code, Time, new ResponseListener())

4. sendFlash() - This method is use to send flash transactional sms instantly.
It take 7 parameters (Context, Authentication Key, Mobile Number, Message, Sender Id, Contry Code, new ResponseListener())

5. sendFlashLater() - This method is use to send flash transactional sms with specific delay which is specified by minute. 
It take 8 parameters (Context, Authentication Key, Mobile Number, Message, Sender Id, Contry Code, DelayInMinute, new ResponseListener())

6. sendFlashSchedule() - This method is use to send flash transactional sms at specific time.  (Time - Y-m-d h:i:s (2020-01-01 10:10:00) Or Y/m/d h:i:s (2020/01/01 10:10:00) Or you can send unix timestamp (1577873400))
It take 8 parameters (Context, Authentication Key, Mobile Number, Message, Sender Id, Contry Code, Time, new ResponseListener())

------
PromotionalSMS
===============
There are 6 static method for sending different kind of Promotional SMS

1. sendNow() - This method is use to send Promotional sms instantly. 
It take 7 parameters (Context, Authentication Key, Mobile Number, Message, Sender Id, Contry Code, new ResponseListener())

2. sendLater() - This method is use to send Promotional sms with specific delay which is specified by minute. 
It take 8 parameters (Context, Authentication Key, Mobile Number, Message, Sender Id, Contry Code, DelayInMinute, new ResponseListener())

3. sendSchedule() - This method is use to send Promotional sms at specific time.  (Time - Y-m-d h:i:s (2020-01-01 10:10:00) Or Y/m/d h:i:s (2020/01/01 10:10:00) Or you can send unix timestamp (1577873400))
It take 8 parameters (Context, Authentication Key, Mobile Number, Message, Sender Id, Contry Code, Time, new ResponseListener())

4. sendFlash() - This method is use to send flash Promotional sms instantly.
It take 7 parameters (Context, Authentication Key, Mobile Number, Message, Sender Id, Contry Code, new ResponseListener())

5. sendFlashLater() - This method is use to send flash Promotional sms with specific delay which is specified by minute. 
It take 8 parameters (Context, Authentication Key, Mobile Number, Message, Sender Id, Contry Code, DelayInMinute, new ResponseListener())

6. sendFlashSchedule() - This method is use to send flash Promotional sms at specific time.  (Time - Y-m-d h:i:s (2020-01-01 10:10:00) Or Y/m/d h:i:s (2020/01/01 10:10:00) Or you can send unix timestamp (1577873400))
It take 8 parameters (Context, Authentication Key, Mobile Number, Message, Sender Id, Contry Code, Time, new ResponseListener())

ResponseListener - 

            @Override
            public void onSuccess(String response) {
                //This method returns if the sms is sent successfully
            }

            @Override
            public void onFailure(SMSError error) {
              //This method returns when sms is not sent.
              // error.getType() - This return type of error
              // error.getMessage() - This return message with reason of the error
              //error.getErrorCode() _ This return the Error code
            }

            @Override
            public void onServerError(String error) {
            //This method returns when there is any connection or server problem
            }
------
SendEmailOTP
===============
There are 4 static method for sending different kind of OTP through E-Mail
1. send() - This method is use to send OTP through E-Mail. 
It take 5 parameters (Context, Authentication Key, Email ID, OTPValue, new OtpResponseListener())

2. sendWithTemplate()- This method is use to send OTP through E-Mail using template. (Template can be create thorugh MSG91 dashboard)
It take 5 parameters (Context, Authentication Key, Email ID, OTPValue, TemplateID, new OtpResponseListener())

3. sendWithExpiry() - This method is use to send OTP through E-Mail which is valid for given mintues.
It take 6 parameters (Context, Authentication Key, Email ID, OTPValue, ExpiryAfterMinutes, new OtpResponseListener())

4. sendWithTemplateAndExpiry() - This method is use to send OTP through E-Mail with template which is valid for given mintues.
It take 7 parameters (Context, Authentication Key, Email ID, OTPValue, TemplateID, ExpiryAfterMinutes, new OtpResponseListener())
------
SendOTP
===============
There are 6 static method for sending different kind of OTP through SMS.

1. sendOTP() - This method is use to send auto generated OTP through SMS. (Mention ##OTP## in message to place otp value in the message).
It take 6 parameters (Context, Authentication Key, Message, SenderID, Mobile, new OtpResponseListener())

2. sendCustomOTP()- This method is use to send custom OTP through SMS. (Mention ##OTP## in message to place otp value in the message).
It take 7 parameters (Context, Authentication Key, Message, SenderID, Mobile, OTPValue, new OtpResponseListener())

3. sendOTPFixedLength() - This method is use to send fixed length (varies from 4 to 9) of OTP through SMS. (Mention ##OTP## in message to place otp value in the message).
It take 7 parameters (Context, Authentication Key, Message, SenderID, Mobile, Length of OTP, new OtpResponseListener()) 

4. sendOTPWithExpiry() - This method is use to send OTP through SMS with expiry of the OTP after given minutes . (Mention ##OTP## in message to place otp value in the message).
It take 7 parameters (Context, Authentication Key, Message, SenderID, Mobile, ExpiryInMinute, new OtpResponseListener()) 

5. sendCustomOTPWithExpriy() - This method is use to send custon OTP through SMS with expiry of the OTP after given minutes . (Mention ##OTP## in message to place otp value in the message).
It take 7 parameters (Context, Authentication Key, Message, SenderID, Mobile, , OTPValue, ExpiryInMinute, new OtpResponseListener()) 

6. sendOTPFixedLengthWithExpriy() - This method is use to send fixed length (varies from 4 to 9) of OTP through SMS with expiry of the OTP after given minutes . (Mention ##OTP## in message to place otp value in the message).
It take 8 parameters (Context, Authentication Key, Message, SenderID, Mobile, Length of OTP, ExpiryInMinute, new OtpResponseListener()) 

------
ReSendOTP
===============
There are 2 static method for resending OTP through SMS or Voice.

1. sendSMS() - This method is use to resend the OTP through SMS.
It take 4 parameters (Context, Authentication Key, Mobile, new OtpResponseListener())

2. sendCall() - This method is use to resend the OTP through call.
It take 4 parameters (Context, Authentication Key, Mobile, new OtpResponseListener())


OtpResponseListener -

      @Override
            public void onSuccess(String response) {
                //This method returns if the sms is sent succeessfully
            }

            @Override
            public void onFailure(String error) {
                //This method returns the message if sms has not been sent. 
            }

            @Override
            public void onServerError(String error) {
                //This method returns when there is any connection or server problem
            }

------
VerifyOTP
===============
There 1 static method for verifing OTP.

1. verify() - This method is use to verify the OTP from MSG91.
It take 4 parameters (Context, Authentication Key, Mobile, Entered OTP , new OtpResponseListener())


OtpResponseListener -

      @Override
            public void onSuccess(String response) {
                //This method returns if the OTP is succeessfully verified
            }

            @Override
            public void onFailure(String error) {
                //This method returns if the OTP is not verified
            }

            @Override
            public void onServerError(String error) {
                //This method returns when there is any connection or server problem
            }
