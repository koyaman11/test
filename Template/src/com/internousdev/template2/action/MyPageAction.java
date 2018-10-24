package com.internousdev.template2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template2.dao.MyPageDAO;
import com.internousdev.template2.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	public String deleteFlg;
	private String result;
	public String execute() throws SQLException{
		MyPageDAO myPageDAO=new MyPageDAO();
		MyPageDTO myPageDTO=new MyPageDTO();

		//商品履歴を消去しない場合
		if(deleteFlg==null){
			String item_transaction_id=session.get("id").toString();
			String user_master_id=session.get("login_user_id").toString();

			myPageDTO=myPageDAO.getMyPageUserInfo(item_transaction_id,user_master_id);
			 session.put("buyItem_name",myPageDTO.getItemName());
			 session.put("total_price",myPageDTO.getTotalPrice());
			 session.put("total_count",myPageDTO.getTotalCount());
			 session.put("total_payment",myPageDTO.getPayment());
			 session.put("message","");

			 System.out.println(session.get("buyItem_name"));
			 System.out.println(session.get("total_price"));
			 System.out.println(session.get("total_count"));
			 System.out.println(session.get("total_payment"));
			 System.out.println(session.get("message"));

			 //商品履歴を消去知る場合
		}else if(deleteFlg.equals("1")){
			delete();
		}
		result =SUCCESS;
		return result;
	}
	public void delete() throws SQLException{
		MyPageDAO myPageDAO=new MyPageDAO();

		String item_transaction_id=session.get("id").toString();
		String user_master_id=session.get("login_user_id").toString();

		int res=myPageDAO.buyItemHistoryDelete(item_transaction_id, user_master_id);
		if(res>0){
			session.put("message", "商品情報を正しく消去しました");
		}else if(res==0){
			session.put("message","商品情報の消去に失敗しました");
		}
	}
	public String getDeleteFlg(){
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg=deleteFlg;
	}

	public void setSession(Map<String,Object> loginSessionMap){
		this.session=loginSessionMap;
	}

}