package com.yiibai.customer.bo;

import com.yiibai.customer.bo.CustomerBo;

/** 
* @author ����Vladimir E-mail: gyang.shines@gmail.com
* @version ����ʱ�䣺2017��12��9�� ����12:57:36 
* ��˵�� 
*/
public class CustomerBoImpl implements CustomerBo {

	@Override
	public void addCustomer() {
		// TODO Auto-generated method stub
		System.out.println("addCustomer() is running ");

	}

	@Override
	public String addCustomerReturnValue() {
		// TODO Auto-generated method stub
		System.out.println("addCustomerReturnValue() is running ");
		return "abc";
	}

	@Override
	public void addCustomerThrowException() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}

	@Override
	public void addCustomerAround(String name) {
		// TODO Auto-generated method stub
		System.out.println("addCustomerAround() is running, args : " + name);
	}

}
