package com.noon.iosapp.util;

public interface IConstants {

	String IPA_PATH = System.getProperty("user.dir")+"/ipa/FastFish.ipa";
	//String IPA_PATH = System.getProperty("user.dir")+"/ipa/noon PRD 26 1.0.ipa";
	//String IPA_PATH = System.getProperty("user.dir")+"/ipa/FastFish1.ipa";
	String APPIUM_VERSION= "1.6";
	String PLATFORM_VERSION = "10.3";
	
	//String PLATFORM_VERSION = "9.3";
	String PLATFORM_NAME = "iOS";
	String DEVICE_NAME = "iPhone 7";
	//String DEVICE_NAME = "iPhone 6s";
	//String UDID = "7DDE181F-F076-4309-8ED2-34E53BA21712";
	//String LAUNCH_TIMEOUT = "500000";
	//String AUTOMATION_NAME = "IOS_XCUI_TEST";
	String AUTOMATION_NAME = "XCUITest";
	String HUB_URL = "http://0.0.0.0:4723/wd/hub";
		
		
		
		//Report
		String REPORT_PATH = "/Users/kartikbhatt/IOSReport";
		//Screen shot
		String SCREENSHOT_PATH = "/Users/kartikbhatt/screenshot";
		//excel file for data-driven framework
		String XLS_PATH = System.getProperty("user.dir")+"/data/TestData.xlsx";
		
		//Screen selection
		String POPUP_SCREEN="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[6]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]";
		String WINDOW_SCREEN="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/";
		
		//Localization page
		String ARABIC_SCREEN_LOGIN="//XCUIElementTypeButton[@label='تسجيل الدخول من خلال البريد الإلكتروني أو الهاتف']";
		String ENGLISH_SCREEN="//XCUIElementTypeButton[@name='English']";
		
		
		//Element for home page
		
		String SPLASH_SCREEN="//XCUIElementTypeButton[@name='Allow']";
		String APPS_MENU="//XCUIElementTypeButton[@name='menu']";
		String HELLO_TEXT="//XCUIElementTypeStaticText[@name='Hello, noon']";
		String ADDRESS_BOOK="//XCUIElementTypeStaticText[@name='Address Book']";
		
		//Element for sidebarlink page
		String NOON_AFTERNOON="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeImage[1]";
		String HELLO_GUEST="//XCUIElementTypeStaticText[@name='Hello, Guest']";
		String REGISTER_OR_SIGNIN="//XCUIElementTypeButton[@name='sideMenu_headerView_signInButton']";
		String NOON_HOME="//XCUIElementTypeStaticText[@name='Home']";
		String ARABIC_SCREEN="//XCUIElementTypeButton[@name='عربي']";
		String SHOP_BY_CATEGORY="//XCUIElementTypeStaticText[@name='Shop by Category']";
		String TODAYS_DEALS="//XCUIElementTypeStaticText[@name=\"Today's Deals\"]";
		String MY_ORDERS="//XCUIElementTypeStaticText[@name='My Orders']";
		String MY_ACCOUNT="//XCUIElementTypeStaticText[@name='My Account']";
		String RETURNS_EXCHANGE="//XCUIElementTypeStaticText[@name='Returns & Exchanges']";
		String INVITE_FRIENDS="//XCUIElementTypeStaticText[@name='Share noon with friends']";
		String CUSTOMER_SERVICE="//XCUIElementTypeStaticText[@name='Customer Service']";
		String CALL_US="//XCUIElementTypeStaticText[@name='Call us']";
		String CHAT_WITH_US="//XCUIElementTypeStaticText[@name='Chat with us']";
		String TERMS_POLICIES="//XCUIElementTypeButton[@name='Terms & Policies']";
		String COPY_RIGHT="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]";
		
		
		//Elements for signin with email  page
		String SIGNIN_BUTTON="//XCUIElementTypeButton[@name='home.accountLogin.button']";
		//String REGISTER_TAB="//XCUIElementTypeStaticText[@name='Register']";
		String LOGIN_TAB="//XCUIElementTypeStaticText[@name='Sign in']";
		String LOGIN_WITH_EMAIL="//XCUIElementTypeButton[@name='login_identifier_switchPhoneEmail_button']";
		String SIGNIN_WITH="//XCUIElementTypeStaticText[@name='Sign in with']";
		String GOOGLE_BUTTON="//XCUIElementTypeButton[@name='google plus']";
		String FACEBOOK_BUTTON="//XCUIElementTypeButton[@name='facebook']";
		String TWITTER_BUTTON="//XCUIElementTypeButton[@name='twitter']";
		String LOGIN_DETAILS="//XCUIElementTypeStaticText[@name='Or sign in with your details']";
		//String USER_EMAIL="//XCUIElementTypeStaticText[@name='+1']";
		String USER_EMAIL="//XCUIElementTypeTextField[@name='login_identifier_email_textfield']";
		
		//String USER_EMAIL="//XCUIElementTypeTextField[@value='Email address*']";
		
		String USER_PASSWORD="//XCUIElementTypeSecureTextField[1]";
		String USER_LOGIN_BUTTON="//XCUIElementTypeButton[@name='Login']";
		String FORGOT_PASSWORD="//XCUIElementTypeButton[@name='Forgot password?']";
		String RESET_PASSWORD="//XCUIElementTypeStaticText[@name='Reset password']";
		String RESET_PASSWORD_DETAILS="//XCUIElementTypeStaticText[@name='To reset your password , please enter your email or your mobile number']";
		String RESET_PASSWORD_INPUT_BOX="//XCUIElementTypeTextField[@name='(null)']";
		String RESET_PASSWORD_BUTTON="//XCUIElementTypeButton[@name='Reset']";
		String RESET_PASSWORD_CANCEL_BUTTON="//XCUIElementTypeButton[@name='Cancel']";
		
		//Elements fir singin with phone page
		String SELECT_COUNTRYCODE="//XCUIElementTypeButton[@name='login_identifier_countryCode_selector_button']";
		String USA_COUNTRYCODE="//XCUIElementTypeCell[@name='login_identifier_countryCode_selector_United States +1']";
		String UAE_COUNTRYCODE="//XCUIElementTypeCell[@name='login_identifier_countryCode_selector_United Arab Emirates +971']";
		//String USER_PHONE="//XCUIElementTypeTextField[@value='Phone number*']";
		String USER_PHONE="//XCUIElementTypeTextField[@name='login_identifier_phone_textfield']";
		String USER_PHONE_PASSWORD="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]/XCUIElementTypeSecureTextField[1]";
		String USER_PHONE_VERIFY="//XCUIElementTypeStaticText[@name='Hello, Kartik']";
		String USER_PHONE_NAME="//XCUIElementTypeStaticText[@name='profile_userName_label']";
		String USER_PHONE_NUMBER="//XCUIElementTypeStaticText[@name='profile_userLogin_label']";
		
		//Element for register with email page
		String REGISTER_TAB="//XCUIElementTypeStaticText[@name='Register']";
		String REGISTER_WITH="//XCUIElementTypeStaticText[@name='Register with']";
		String REGISTER_GOOGLE_BUTTON="//XCUIElementTypeButton[@name='register_google_button']";
		String REGISTER_FACEBOOK_BUTTON="//XCUIElementTypeButton[@name='register_facebook_button']";
		String REGISTER_TWITTER_BUTTON="//XCUIElementTypeButton[@name='register_twitter_button']";
		String REGISTER_WITH_DETAILS="//XCUIElementTypeStaticText[@name='Or register with your details']";
		String REGISTER_USE_EMAIL="//XCUIElementTypeButton[@name='register_identifier_switchPhoneEmail_button']";
		String REGISTER_USER_NAME="//XCUIElementTypeTextField[@name='register_name_textfield']";
		String REGISTER_USER_PHONE="//XCUIElementTypeTextField[@name='register_identifier_phone_textfield']";
		String REGISTER_USER_EMAIL1="//XCUIElementTypeTextField[@name='register_identifier_email_textfield']";
		String REGISTER_USER_PASSWORD="//XCUIElementTypeSecureTextField[@name='register_password_textfield']";
		String REGISTER_BUTTON="//XCUIElementTypeButton[@name='register_continue_button']";
		String VERIFICATION_EMAIL="//XCUIElementTypeStaticText[@name='Thanks, we just sent you a verification email']";
		String DIGIT_TEXT="//XCUIElementTypeStaticText[@name='enter_sms_label']";
		String RESEND_EMAIL="//XCUIElementTypeButton[@name='register_switchPhoneEmail_button']";
		String OTP_CODE_1="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeTextField[1]";
		String OTP_CODE_2="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeTextField[2]";
		String OTP_CODE_3="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeTextField[3]";
		String OTP_CODE_4="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeTextField[4]";
		
		//Social media page element
		String GOOGLE_LOGIN="//XCUIElementTypeButton[@name='home.googleLogin.button']";
		String GOOGLE_EMAIL="//XCUIElementTypeTextField[@name='Email or phone']";
		String GOOGLE_NEXT_BUTTON="//XCUIElementTypeButton[@name='NEXT']";
		String GOOGLE_PASSWORD="//XCUIElementTypeSecureTextField[@name='Enter your password']";
		String VERIFY_GOOGLEUSER="//XCUIElementTypeStaticText[@name='Hello, kk']";
		String GOOGLEUSERNAME_LABEL="//XCUIElementTypeStaticText[@name='profile_userName_label']";
		String GOOGLEUSEREMAIL_LABEL="//XCUIElementTypeStaticText[@name='profile_userLogin_label']";
		String OPEN_SAFARI ="//XCUIElementTypeToolbar[1]/XCUIElementTypeButton[4]";
		String SHOW_BOOKMARKS="//XCUIElementTypeButton[@name='Show Bookmarks']";
		String CLEAR_HISTORY="//XCUIElementTypeButton[@name='Clear']";
		String DELETE_ALLTIME_HISTORY="//XCUIElementTypeButton[@name='All time']";
		String HISTORY_DONE_BUTTON="//XCUIElementTypeButton[@name='Done']";
		String RETURN_NOON_PROD="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[3]/XCUIElementTypeStatusBar[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]";
		
		//facebook login element
		String FACEBOOK_LOGIN="//XCUIElementTypeButton[@name='home.facebookLogin.button']";
		String ENGLISH_US="//XCUIElementTypeLink[@name='English (US)']";
		String FACEBOOK_EMAIL="//XCUIElementTypeTextField[@value='Email or Phone']";
		String FACEBOOK_PASSWORD="//XCUIElementTypeSecureTextField[@value='Facebook Password']";
		String FACEBOOK_LOGIN_BUTTON="//XCUIElementTypeButton[@name='Log In']";
		String FACEBOOK_OK="//XCUIElementTypeButton[@name='OK']";
		String CONTINUE_AS_USER="//XCUIElementTypeButton[@name='Continue as Strangerketi']";
		String VERIFY_FACEBOOKUSER="//XCUIElementTypeStaticText[@name='Hello, kk bb']";
		String FACEBOOKUSERNAME_LABEL="//XCUIElementTypeStaticText[@name='profile_userName_label']";
		String FACEBOOKUSEREMAIL_LABEL="//XCUIElementTypeStaticText[@name='profile_userLogin_label']";
		
		//twitter login element
		String TWITTER_LOGIN="//XCUIElementTypeButton[@name='home.twitterLogin.button']";
		String TWITTER_EMAIL="//XCUIElementTypeTextField[1]";
		String TWITTER_PASSWORD="//XCUIElementTypeSecureTextField[1]";
		String TWITTER_SIGNIN="//XCUIElementTypeButton[@name='Sign In']";
		String TWITTER_AUTHORIZE="//XCUIElementTypeButton[@name='Authorize app']";
		
		//Element for My Account
		//String ADDRESS_BOOK="//XCUIElementTypeStaticText[@name='Address Book']";
		String PROFILE="//XCUIElementTypeStaticText[@name='Profile']";
		String PROFILE_USERNAME="//XCUIElementTypeStaticText[@name='profile_userName_label']";
		String PROFILE_USERELOGIN="//XCUIElementTypeStaticText[@name='profile_userLogin_label']";
		String PROFILE_SIGNOUT="//XCUIElementTypeButton[@name='profile_signOut_button']";
		String POPUP_LOGOUT="//XCUIElementTypeStaticText[@name='Logout']";
		String POPUP_SURE_LOGOUT="//XCUIElementTypeStaticText[@name='Are you sure to logout ?']";
		String POPUP_CONTINUE="//XCUIElementTypeButton[@name='Continue']";
		String POPUP_CANCEL="//XCUIElementTypeButton[@name='Cancel']";
		String POPUP_LOGOUT_TEXT="//XCUIElementTypeStaticText[@label='You are Logged out']";
		String POPUP_LOGOUT_OK="//XCUIElementTypeButton[@name='OK']";

		//Element for product search Page
		String SEARCH_BOX="//XCUIElementTypeSearchField[@name='What are you looking for today?']";
		String SEARCH_TYPE="//XCUIElementTypeImage[1]";

		String SEARCH_TEXT_SELECT="//XCUIElementTypeStaticText[@name='Roja Perfums Roja Perfums Scandal Perfum EDP Eau de Parfum']";
		String SEARCH_ITEM_PRICE="//XCUIElementTypeStaticText[@name='search_result_cell_price_label']";
		String SEARCH_ITEM_CART="//XCUIElementTypeButton[@name='search_result_cart_button']";
		
		//Element for Product Details
		String PRODUCT_IMAGE="//XCUIElementTypeCollectionView[1]";
		String PRODUCT_CELL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]";
		//String PRODUCT_COLOR="//XCUIElementTypeCell[3]/XCUIElementTypeButton[1]";
		String DELI_LOCATION="//XCUIElementTypeCell[3]/XCUIElementTypeButton[1]";
		String BUYNOW_BUTTON="//XCUIElementTypeCell[4]/XCUIElementTypeButton[1]";
		String ADDTOCART="//XCUIElementTypeButton[@name='Add to cart']";
		String PROD_DESCRIPTION="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]";
		String PROD_SPECIFICATION="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]";
		String PROD_SOLDBY="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]";
		String PROD_RELATED="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]";
	
		
		//Elements for AddToCart page
		String SEARCH_TEXT_TITLE="//XCUIElementTypeStaticText[@name='Danger Perfum EDP']";
		String TOTAL_CELL="//XCUIElementTypeCell[1]";
		String PRODUCT_TAPAREA="//XCUIElementTypeButton[@name='cart_cartCell_product_tapArea']";
		//String CART_GRAY="//XCUIElementTypeButton[@name='add to cart gray']";
		String IN_CART="//XCUIElementTypeButton[2]";
		String CART_ITEM="//XCUIElementTypeButton[3]";
		String ONE_ITEM="//XCUIElementTypeStaticText[1]";
		String ONE_ITEM_TOTAL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]";
		String ITEM_EXC_SHIPPING="//XCUIElementTypeStaticText[@name='excluding shipping fee']";
		String SECURE_CHECKOUT="//XCUIElementTypeCell[2]/XCUIElementTypeButton[1]";
		String ADD_CHANGE_ADDRESS="//XCUIElementTypeStaticText[@name='Add or change address']";
		String ITEM_DETAILS="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]";
		//String ITEM_REMOVE="//XCUIElementTypeButton[@name='cart_cartCell_remove_button']";
		//String ITEM_REMOVE="//XCUIElementTypeButton[3]";
		String CROSS_BUTTON="//XCUIElementTypeButton[@name='cross']";
		String BACK_BUTTON="//XCUIElementTypeButton[@name='back']";
		String BACK1_BUTTON="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]";
		//String BACK_BUTTON="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]";
		String CONTINUE_SHOPPING="//XCUIElementTypeCell[4]/XCUIElementTypeButton[1]";
		
		//Element for increase, decrease, add multiple items and remove items
		String ITEMS1="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]";
		String ITEMS2="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]";
		String VERIFY_ITEM1="//XCUIElementTypeCell[3]";
		String VERIFY_ITEM2="//XCUIElementTypeCell[4]";
		String REMOVE_ITEM2="//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]";
		String PRODUCT_QUANTITY="//XCUIElementTypeCell[3]/XCUIElementTypeStaticText[4]";
		String INCREASE_ITEM="//XCUIElementTypeButton[@name='cart_cartCell_increaseQuantity_button']";
		String DECREASE_ITEM="//XCUIElementTypeButton[@name='cart_cartCell_decreaseQuantity_button']";
		String ITEM_REMOVE="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeButton[2]";
		
		//Elements for Add New Address page
		String NO_ADDRESS_ADDED="//XCUIElementTypeStaticText[@name='No address added yet']";
		String ADD_NEW_ADDRESS_TEXT="//XCUIElementTypeStaticText[@name='Add new address']";
	    String WE_DELIVER_TEXT="//XCUIElementTypeStaticText[@name='checkout_deliveryStepOne_addNewAddressCell_subtitleLabel']";
		//String ADD_NEW_ADDRESS_TEXT="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]";
		String ADD_NEW_ADDRESS_BUTTON="//XCUIElementTypeButton[@name='Add new address']";
		String DELIVERY_ADDRESS="//XCUIElementTypeStaticText[@name='Where should we deliver to?']";
		String DELIVERY_ADDRESS_EDIT="//XCUIElementTypeTextField[1]";
		                             
		String DELIVERY_ADDRESS_CELL="///XCUIElementTypeStaticText[@name='Emaar Square Building #3']";
		String ADDRESS_DONE_BUTTON="//XCUIElementTypeButton[@name='addAddress_map_done_button']";
		String ADDRESS_LOCATION_IMAGE="//XCUIElementTypeImage[1]";
		String ALMOST_DONE_AREA="//XCUIElementTypeOther[1]";
		String ALMOST_DONE_TEXT1="//XCUIElementTypeStaticText[@name='Almost done!']";
		String DELIVERY_ADDRESS_TEXT="//XCUIElementTypeStaticText[@name='Delivery address']";
		String DELIVERY_ADDRESS_COUNTRY="//XCUIElementTypeStaticText[@name='Country']";
		String DELIVERY_ADDRESS_CITY="//XCUIElementTypeStaticText[@name='City']";
		String DELIVERY_ADDRESS_BUILDING="//XCUIElementTypeStaticText[@name='Building']";
		String DELIVERY_ADDRESS_BUILDING_EDIT="//XCUIElementTypeTextField[@value='Building']";
		String DELIVERY_ADDRESS_APRT_NUMBER="//XCUIElementTypeStaticText[@name='Apartment Number']";
		String DELIVER_ADDRESS_FLAT_EDIT="//XCUIElementTypeTextField[@value='Flat number']";
		String DELIVERY_FLOOR_NUMBER="//XCUIElementTypeStaticText[@name='Floor Number']";
		String DELIVERY_ADDRESS_FLOOR_EDIT="//XCUIElementTypeTextField[5]";
		String HIDE_KEYBOARD1="//XCUIElementTypeOther[1]";
		String DELIVERY_ADDRESS_AREA="//XCUIElementTypeStaticText[@name='Area']";
		String DELIVERY_ADDRESS_STREET="//XCUIElementTypeStaticText[@name='Street']";
		String DELIVERY_ADDRESS_COURIER="//XCUIElementTypeStaticText[@name='Details for courier']";
		String DELIVERY_ADDRESS_BUTTON1="//XCUIElementTypeButton[@name='This is a business address']";
		String DELIVERY_ADDRESS_BUTTON2="//XCUIElementTypeButton[@name='Default']";
		String DELIVERY_ADDRESS_DETAILS="//XCUIElementTypeStaticText[@name='Contact details']";
		String DELIVERY_ADDRESS_NAME="//XCUIElementTypeStaticText[@name='Name']";
		String DELIVERY_ADDRESS_PHONE="//XCUIElementTypeStaticText[@name='Phone']";
		String DELIVERY_ADDRESS_PHONE_EDIT="//XCUIElementTypeTextField[@value='Mobile']";
		String DELIVERY_ADDRESS_SAVE="//XCUIElementTypeButton[@name='addAddress_form_done_button']";
		String DEFAULT_ADDRESS_BACKBUTTON="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]";
		String DELIVERY_ADDRESS_CONFORM="//XCUIElementTypeStaticText[@name='Home, Emaar Square Building #3']";
		//String DELIVERY_ADDRESS_CONFORM="//CUIElementTypeTable[1]";
		
		//Element for Address Book  
		String ADDRESSBOOK_ADDADDRESS  ="//XCUIElementTypeButton[@name='Add new address']";
		String PROFILE_ADDRESS_CONFORM="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]";
		
		//Element for checkout page
		String CREDIT_CART_BUTTON="//XCUIElementTypeButton[2]";
		String PERSONAL_DELIVERY="//XCUIElementTypeButton[@name='checkout_addressCell_makeDefault_button']";
		String ADD_NEWCARD="//XCUIElementTypeStaticText[@name='Add new card']";
		
		
		//Add credit card element
		String CARD_NAME="//XCUIElementTypeTextField[@name='addCard.cardName.field']";
		String CARD_NUMBER="//XCUIElementTypeTextField[@name='addCard.cardNumber.field']";
		String DROP_DOWN_MONTH_05="//XCUIElementTypeStaticText[@name='05']";
		String CARD_EXPIRYMONTH="//XCUIElementTypeButton[@name='addCard.expiryDate.dropDown_button']";
		//String CARD_MONTH_SELECT="//XCUIElementTypeButton[@name='addCard.expiryMonth.dropDown_button']";
		String DROP_DOWN_YEAR_2020="//XCUIElementTypeStaticText[@name='2020']";
		String CARD_EXPIRYYEAR="//XCUIElementTypeButton[@name='addCard.expiryMonth.dropDown_button']";
		String CARD_CVVNUMBER="//XCUIElementTypeTextField[@name='addCard.cvvNumber.field']";
		//String CREDIT_DONE_BUTTON="//XCUIElementTypeButton[@name='keyboard_done_button]";
		String CREDIT_DONE_BUTTON="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeToolbar[1]/XCUIElementTypeButton[1]";
		String SAVE_CARD="//XCUIElementTypeButton[@name='addCard.saveCard.button']";
		
		//Add Payment by credit card next screen element
		String REVIEW_ORDER="//XCUIElementTypeCell[2]";
		String ORDERS_SUBTOTAL="//XCUIElementTypeCell[3]";
		String ORDER_PAYMENT_INFO="//XCUIElementTypeCell[4]";
		String ORDER_SHIP_INFO="//XCUIElementTypeCell[5]";
		String SHIPMENT_ONE_IMAGE="//XCUIElementTypeCell[6]";
		String DELIVERY_OPTION="//XCUIElementTypeCell[7]";
		String SAME_DAY="//XCUIElementTypeStaticText[@name='shipping_option_single_cell_title_label']";
		String NEXT_DAY="//XCUIElementTypeStaticText[@name='shipping_option_single_cell_date_label']";
		String THREE_DAYS="//XCUIElementTypeStaticText[@name='shipping_option_single_cell_price_label']";
		String SHIPPING_TOTAL="//XCUIElementTypeCell[8]";
		String ORDER_SUMMARY="//XCUIElementTypeStaticText[@name='order_summary_notification_title']";
		String PLACE_ORDER="//XCUIElementTypeButton[@name='Place order']";
		String MY_WALLET="//XCUIElementTypeStaticText[@name='My Wallet']";
		String WALLET_ADDNEW_CARD="//XCUIElementTypeButton[@name='my_account_wallet_cards_fallback_add_card_button']";
		String WALLET_SAVED_CARDS="//XCUIElementTypeStaticText[@name='Saved cards']";
		String CREDIT_CARD_CONFIRM="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]";
		String DELETE_CREDIT_CARD="//XCUIElementTypeButton[@name='Delete']";
		String DELETE_CARD_CONFO="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]";
		String VISA_INFO="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]";
		String DELETE_YES_NO="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]";
		String DELETE_YES="//XCUIElementTypeButton[@name='Yes']";
		String NO_SAVE_CARD="//XCUIElementTypeStaticText[@name='my_account_wallet_cards_fallback_label']";
		String NO_SAVE_IMAGE="//XCUIElementTypeImage[@name='fallback_card_icon']";
		
		//Element for COD pay on delivery
		String PAY_ON_DELIVERY="//XCUIElementTypeStaticText[@name='Pay on delivery']";
		String DELIVERY_CELL="//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]";
		String REVIEW_CELL="//XCUIElementTypeStaticText[@name='Please scroll down to place your order']";
		String PAY_ON_DELIVERY_CELL="//XCUIElementTypeStaticText[@name='Pay on delivery']";
		String PAYMENT_CELL="//XCUIElementTypeStaticText[@name='Payment']";
		String SHIPTO_CELL="//XCUIElementTypeStaticText[@name='Ship to']";
		String SHIPMENTONE_CELL="//XCUIElementTypeStaticText[@name='Shipment one']";
		String SELECT_DELIVERY_OPTION_TEXT="//XCUIElementTypeStaticText[@name='Select delivery option']";
		String SELECT_COD_OPTION="///XCUIElementTypeStaticText[@name=' - Standard (AED 14.00)']";
		String COD_SAME_DAY="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]";
		String COD_NEXT_DAY="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]";
		String COD_STANDARD="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]";
		String SHIPPING_TOTAL_CELL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[1]";
		String ALL_DONE="//XCUIElementTypeStaticText[@name='order_summary_notification_title']";
		String COD_PLACE_ORDER="//XCUIElementTypeButton[@name='Place order']";
		
		
		
		//Element for Shop by Category Fashion Page
		String FASHION_LINK="//XCUIElementTypeStaticText[@name='Fashion']";
		String FASHION_CELL1="//XCUIElementTypeCell[1]";
		String FASHION_CELL2="//XCUIElementTypeCell[2]";
		String FASHION_CELL3="//XCUIElementTypeCell[3]";
		String FASHION_CELL4="//XCUIElementTypeCell[4]";
		String FASHION_CELL5="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[1]";
		String FASHION_CELL6="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[1]";
		String FASHION_WOMEN_TEXT="//XCUIElementTypeStaticText[@name='Women']";
		String FASHION_WOMEN_CLOTHING="//XCUIElementTypeStaticText[@name='Clothing']";
		String FASHION_WOMEN_FOOTWEAR="//XCUIElementTypeStaticText[@name='Footwear']";
		String FASHION_WOMEN_BAGS="//XCUIElementTypeStaticText[@name='Bags & Luggage']";
		String FASHION_WOMEN_JEWELLERY="//XCUIElementTypeStaticText[@name='Jewellery & Watches']";
		String FASHION_WOMEN_EYEWEAR="//XCUIElementTypeStaticText[@name='Eyewear']";
		String FASHION_WOMEN_SPORTS="//XCUIElementTypeStaticText[@name='Sports']";
		String FASHION_MEN_TEXT="//XCUIElementTypeStaticText[@name='Men']";
		String FASHION_MEN_CLOTHING="//XCUIElementTypeStaticText[@name='Clothing']";
		String FASHION_MEN_FOOTWEAR="//XCUIElementTypeStaticText[@name='Footwear']";
		String FASHION_MEN_BAGS="//XCUIElementTypeStaticText[@name='Bags & Luggage']";
		String FASHION_MEN_WATCHES="//XCUIElementTypeStaticText[@name='Watches']";
		String FASHION_MEN_ACCESSORIES="//XCUIElementTypeStaticText[@name='Accessories']";
		String FASHION_MEN_SPORTS="//XCUIElementTypeStaticText[@name='Sports']";
		String FASHION_GIRLS_TEXT="//XCUIElementTypeStaticText[@name='Girls']";
		String FASHION_GIRLS_CLOTHING="//XCUIElementTypeStaticText[@name='Clothing']";
		String FASHION_GIRLS_SHOES="//XCUIElementTypeStaticText[@name='Shoes']";
		String FASHION_GIRLS_ACCESSORIES="//XCUIElementTypeStaticText[@name='Accessories']";
		String FASHION_GIRLS_WATCHES="//XCUIElementTypeStaticText[@name='Watches']";
		String FASHION_GIRLS_UNDERWEAR="//XCUIElementTypeStaticText[@name='Underwear']";
		String FASHION_GIRLS_SPORTS="//XCUIElementTypeStaticText[@name='Sports']";
		String FASHION_BOYS_TEXT="//XCUIElementTypeStaticText[@name='Boys']";
		String FASHION_BOYS_CLOTHING="//XCUIElementTypeStaticText[@name='Clothing']";
		String FASHION_BOYS_FOOTWEAR="//XCUIElementTypeStaticText[@name='Footwear']";
		String FASHION_BOYS_ACCESSORIES="//XCUIElementTypeStaticText[@name='Accessories']";
		String FASHION_BOYS_SPORTS="//XCUIElementTypeStaticText[@name='Sports']";
		String FASHION_BABY_TEXT="//XCUIElementTypeStaticText[@name='Baby']";
		String FASHION_BABY_CLOTHING="//XCUIElementTypeStaticText[@name='Girls Clothing']";
		String FASHION_BABY_CLOTHING1="//XCUIElementTypeStaticText[@name='Boys Clothing']";
		String FASHION_BABY_FOOTWEAR="//XCUIElementTypeStaticText[@name='Girls Footwear']";
		String FASHION_BABY_FOOTWEAR1="//XCUIElementTypeStaticText[@name='Boys Footwear']";
		
		//Element for Shop by Category Electronics Page
		String ELECTRONICS_LINK="//XCUIElementTypeStaticText[@name='Electronics']";
		String MOBILES_LINK="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]";
		String MOBILES_TEXT="//XCUIElementTypeStaticText[@name='Mobiles']";
		String TABLETS_LINK="//XCUIElementTypeStaticText[@name=\"Tablets & E-Readers\"]";
		String TABLETS_TEXT="//XCUIElementTypeStaticText[@name='Tablets']";
		String EREADERS_TEXT="//XCUIElementTypeStaticText[@name=\"E-Readers\"]";
		String DESKTOP_LINK="//XCUIElementTypeStaticText[@name='Desktops']";
		String MONITORS_TEXT="//XCUIElementTypeStaticText[@name='Monitors']";
		String HOME_APPLIANCE="//XCUIElementTypeStaticText[@name='Home Appliances']";
		String AUDIO_LINK="//XCUIElementTypeStaticText[@name='Audio Visual']";
		String TELEVISION_TEXT="//XCUIElementTypeStaticText[@name='Television']";
		String DISC_PLAYERS_TEXT="//XCUIElementTypeStaticText[@name='Disc Players']";
		String HOME_CINEMA_TEXT="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]";
		String SPEAKERS_TEXT="//XCUIElementTypeStaticText[@name='Speakers']";
		String AUDIO_EQUIP_TEXT="//XCUIElementTypeStaticText[@name='Audio Equipment']";
		String STREAMING_TEXT="//XCUIElementTypeStaticText[@name='Streaming & Satellite']";
		String LAPTOP_LINK="//XCUIElementTypeStaticText[@name='Laptops & Gaming']";
		String LAPTOP_TEXT="//XCUIElementTypeStaticText[@name='Laptops & Gaming Consoles']";
		String LAPTOPS_TEXT="//XCUIElementTypeStaticText[@name='Laptops']";
		String CONSOLES_TEXT="//XCUIElementTypeStaticText[@name='Consoles & Video Games']";
		String CAMERAS_LINK="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]";
		String CAMERAS_TEXT="/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]";
		String DIGITAL_CELL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]";
		String PROF_CAMERAS_TEXT="//XCUIElementTypeStaticText[@name='Professional Cameras']";
		String CAMCORDERS_CELL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]";
		String INSTANT_PHOTO_TEXT="//XCUIElementTypeStaticText[@name='Instant Photography']";
		String VIDEO_SURV_CELL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[10]";
		String BINOCULARS_TEXT="//XCUIElementTypeStaticText[@name='Binoculars']";
		String ACCESSORIES_LINK="//XCUIElementTypeStaticText[@name='Accessories']";
		
		//Element for Shop by Category Toys Page
		String TOYS_LINK="//XCUIElementTypeStaticText[@name='Toys']";
		String TOYS_TEXT="//XCUIElementTypeStaticText[@name='Toys & Games']";
		String TOYS_0_12="//XCUIElementTypeStaticText[@name='0-12']";
		String TOYS_1_3="//XCUIElementTypeStaticText[@name='1-3']";
		String TOYS_4_6="//XCUIElementTypeStaticText[@name='4-6']";
		String TOYS_7_9="//XCUIElementTypeStaticText[@name='7-9']";
		String TOYS_10="//XCUIElementTypeStaticText[@name='10']";
		String TOYS_ALLAGE="//XCUIElementTypeStaticText[@name='All ages']";
		
		//Element for Shop by Category Baby Page
		String BABY_LINK="//XCUIElementTypeStaticText[@name='Baby']";
		String BABY_TEXT="////XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]";
		String BABY_CLOTHING="//XCUIElementTypeStaticText[@name='Clothing']";
		String BABY_BABYCARE="//XCUIElementTypeStaticText[@name='Baby care']";
		String BABY_BABYGEAR="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]";
		String BABY_FEEDING="//XCUIElementTypeStaticText[@name='Feeding']";
		
		//Element for Shop by Category Book,music & movies Page
		String BOOK_LINK="//XCUIElementTypeStaticText[@name='Books, Music, & Movies']";
		String BOOK_TEXT="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]";

		String BOOK1_TEXT="//XCUIElementTypeStaticText[@name='Books']";
		String SUBCATEGORY_TEXT="//XCUIElementTypeStaticText[@name='Subcategory']";
		String MIND_TEXT="//XCUIElementTypeStaticText[@name='Mind, Body, & Spirit']";
		String BIOGRAPHY_TEXT="//XCUIElementTypeStaticText[@name='Biography']";
		String CELL5_SCROLL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]";
		String FOOD_TEXT="//XCUIElementTypeStaticText[@name='Food & Drink']";
		String REFERENCE_TEXT="//XCUIElementTypeStaticText[@name='Reference']";
		String CELL6_SCROLL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]";
		String FICTION_TEXT="//XCUIElementTypeStaticText[@name='Fiction']";
		String YOUNG_TEXT="//XCUIElementTypeStaticText[@name='Young Adult']";
		String CELL7_SCROLL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]";
		String BUSINESS_TEXT="//XCUIElementTypeStaticText[@name='Business, Law, & Finance']";
		String HEALTH_TEXT="//XCUIElementTypeStaticText[@name='Health Family & Lifestyle']";
		
		
		
		//Element for Shop by Category Health & Beauty Page
		String HEALTH_LINK="//XCUIElementTypeStaticText[@name='Health & Beauty']";
		String BESTBEAUTY_TEXT="//XCUIElementTypeCell[2]";
		String FRAGRANCE_TEXT="//XCUIElementTypeCell[3]";
		String SKINCARE_TEXT="//XCUIElementTypeCell[4]";
		String HAIRCARE_TEXT="//XCUIElementTypeCell[5]";
		String PERSONALCARE_TEXT="//XCUIElementTypeCell[6]";
		
		
		String CELL8_SCROLL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]";
		String CELL24_SCROLL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[24]";
			
		String COSMETICS_TEXT="//XCUIElementTypeStaticText[@name='Cosmetics']";
		String FRAGRANCE1_TEXT="//XCUIElementTypeStaticText[@name='Fragrance']";
		String FRAGRANCE2_TEXT="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[33]/XCUIElementTypeStaticText[1]";
		String CELL29_SCROLL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[29]";
		String CELL10_SCROLL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[10]";
		String HAIRCARE1_TEXT="//XCUIElementTypeStaticText[@name='Hair Care']";
		String MENGROOMING_TEXT="//XCUIElementTypeStaticText[@name=\"Men's Grooming\"]";
		String CELL11_SCROLL="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[11]";
		String PERSONALCARE1_TEXT="//XCUIElementTypeStaticText[@name='Personal Care']";
		String SKINCARE1_TEXT="//XCUIElementTypeStaticText[@name='Skin Care']";
		String BABYCHILD_TEXT="//XCUIElementTypeStaticText[@name='Baby & Child Care']";
		String BATHBODY_TEXT="//XCUIElementTypeStaticText[@name='Bath & Body']";
		String HEALTHCARE_TEXT="//XCUIElementTypeStaticText[@name='Health Care']";
		String MAKEUP_TEXT="//XCUIElementTypeStaticText[@name='Makeup']";
		String MEDICAL_TEXT="//XCUIElementTypeStaticText[@name='Medical Supplies & Equipment']";
		String NUTRITION_TEXT="//XCUIElementTypeStaticText[@name='Nutrition & Wellness']";
		String SPORTSNUTRITION_TEXT="//XCUIElementTypeStaticText[@name='Sports Nutrition']";
		String TOOLS_TEXT="//XCUIElementTypeStaticText[@name='Tools & Accessories']";
		String VITAMINS_TEXT="//XCUIElementTypeStaticText[@name='Vitamins & Dietary Supplements']";
		
		
		
		//Element for Shop by Category Home & Garden Page
		String HOME_LINK="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]";
		String HOME_TEXT=" //XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]";
		/*String BEDDING_TEXT="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]";
		String CANDLES_TEXT="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]";
		String PET_TEXT="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]";
		String GARDENING_TEXT="///XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]";
		String TOOLSHOME_TEXT="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]";*/
		
		String KITCHEN_TEXT="//XCUIElementTypeStaticText[@name='Kitchen & Dining']";
		String COOKEWARE_TEXT="//XCUIElementTypeStaticText[@name='Cookeware']";
		String DINNERWARE_TEXT="//XCUIElementTypeStaticText[@name='Dinnerware']";
		String BAKEWARE_TEXT="//XCUIElementTypeStaticText[@name='Bakeware']";
		String UTENSILS_TEXT="//XCUIElementTypeStaticText[@name='Kitchen Utensils & Gadgets']";
		
		String BEDDINGBATH_TEXT="//XCUIElementTypeStaticText[@name='Bedding & bath']";
		String BEDDING1_TEXT="//XCUIElementTypeStaticText[@name='Bedding']";
		String BATH_TEXT="//XCUIElementTypeStaticText[@name='Bath']";
		String GARDENING1_LINK="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[10]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]";
		String GARDENING1_TEXT="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]";
		String GARDDECOR_TEXT="//XCUIElementTypeStaticText[@name='Garden Decor']";
		String GARDACCESSORIES_TEXT="//XCUIElementTypeStaticText[@name='Gardening Accessories']";
		String GARDTOOLS_TEXT="//XCUIElementTypeStaticText[@name='Gardening Tools']";
		String WATEREQUI_TEXT="//XCUIElementTypeStaticText[@name='Watering Equipment']";
		
		String HOMEIMPRO_TEXT="//XCUIElementTypeStaticText[@name='Home Improvement']";
		String SAFETY_TEXT="//XCUIElementTypeStaticText[@name='Safety & Security']";
		String HARDWARE_TEXT="//XCUIElementTypeStaticText[@name='Hardware']";
		String HOMESUPP_TEXT="//XCUIElementTypeStaticText[@name='Home Supplies']";
		String POWER_TEXT="//XCUIElementTypeStaticText[@name='Power & Hands tools']";
		
		String ARTWORK_TEXT="//XCUIElementTypeStaticText[@name='Artwork']";
		String DECOR_TEXT="//XCUIElementTypeStaticText[@name='Decor']";
		String FURNITURE_TEXT="//XCUIElementTypeStaticText[@name='Furniture']";
		String HOMEKITCHEN_TEXT="//XCUIElementTypeStaticText[@name='Home & Kitchen']";
		String PATIO_TEXT="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[31]";
		
		String SHOPBYBRAND_TEXT="//XCUIElementTypeStaticText[@name='Shop By Brands']";
		String CATEGORIES_TEXT="//XCUIElementTypeStaticText[@name='Categories']";
		
		//Element for Shop by Category sports Page
		String SPORTS_LINK="//XCUIElementTypeStaticText[@name='Sports']";
		
		
		
		
		
		
}
