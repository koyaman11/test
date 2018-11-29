package com.internousdev.mimosa.action;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.mimosa.util.CommonUtility;
import com.internousdev.mimosa.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CreateDestinationConfirmAction extends ActionSupport implements SessionAware{

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private List<String> sexList= new ArrayList<String>();
	private String sex;
	private static final String MALE="男性";
	private static final String FEMALE="女性";
	private String defaultSexValue=MALE;
	private String email;
	private String telNumber;
	private String userAddress;

	private Map<String,Object> session;

	public String execute(){

		List<String> familyNameErrorMessageList=new ArrayList<String>();
		List<String> firstNameErrorMessageList=new ArrayList<String>();
		List<String> familyNameKanaErrorMessageList=new ArrayList<String>();
		List<String> firstNameKanaErrorMessageList=new ArrayList<String>();
		List<String> emailErrorMessageList=new ArrayList<String>();
		List<String> telNumberErrorMessageList=new ArrayList<String>();
		List<String> userAddressErrorMessageList=new ArrayList<String>();

		sexList.add(MALE);
		sexList.add(FEMALE);
		defaultSexValue = sex;

		String result=ERROR;
		CommonUtility commonUtility = new CommonUtility();
		if(!commonUtility.checkSession(session)) {
			return "sessionTimeOut";
		}
		InputChecker inputChecker =new InputChecker();//文字imputchekey内の文字型に対してtrueかfalseか
		familyNameErrorMessageList=inputChecker.doCheck("姓",familyName,1,16,true, true, true, false, false, false, false, false, false);
		firstNameErrorMessageList=inputChecker.doCheck("名",firstName,1,16,true, true, true, false, false, false, false, false, false);
		familyNameKanaErrorMessageList=inputChecker.doCheck("姓ふりがな",familyNameKana,1,16,false, false, true, false, false, false, false, false, false);
		firstNameKanaErrorMessageList=inputChecker.doCheck("名ふりがな",firstNameKana,1,16,false, false, true, false, false, false, false, false, false);
		emailErrorMessageList=inputChecker.doCheck("メールアドレス",email,15,32,true, false, false, true, true, false, false, false, false);
		telNumberErrorMessageList=inputChecker.doCheck("電話番号",telNumber,10,13,false, false, false, true, false, false, false, false, false);
		userAddressErrorMessageList=inputChecker.doCheck("住所",userAddress,15,50,true, true, true, true, true, true, false, false, false);

		if(familyNameErrorMessageList.size()==0
			&& firstNameErrorMessageList.size()==0
			&& familyNameKanaErrorMessageList.size()==0
		    && firstNameKanaErrorMessageList.size()==0
		    && emailErrorMessageList.size()==0
		    && telNumberErrorMessageList.size()==0
		    && userAddressErrorMessageList.size()==0){
		    result = SUCCESS;

		}else{
			session.put("familyNameErrorMessageList", familyNameErrorMessageList);
			session.put("firstNameErrorMessageList", firstNameErrorMessageList);
			session.put("familyNameKanaErrorMessageList", familyNameKanaErrorMessageList);
			session.put("firstNameKanaErrorMessageList", firstNameKanaErrorMessageList);
			session.put("emailErrorMessageList", emailErrorMessageList);
			session.put("telNumberErrorMessageList", telNumberErrorMessageList);
			session.put("userAddressErrorMessageList", userAddressErrorMessageList);
			result = ERROR;
		}

		return result;
	}

	public String getDefaultSexValue(){
		return defaultSexValue;
	}

	public void setDefaultSexValue(String defaultSexValue){
		this.defaultSexValue = defaultSexValue;
	}

	public List<String> getSexList(){
		return sexList;
	}

	public void setSexList(List<String> sexList){
		this.sexList = sexList;
	}

	public String getSex(){
		return sex;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public String getFamilyName(){
		return familyName;
	}

	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFamilyNameKana(){
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana){
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana(){
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana){
		this.firstNameKana = firstNameKana;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getTelNumber(){
		return telNumber;
	}

	public void setTelNumber(String telNumber){
		this.telNumber = telNumber;
	}

	public String getUserAddress(){
		return userAddress;
	}

	public void setUserAddress(String userAddress){
		this.userAddress = userAddress;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}