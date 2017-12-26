package com.yiibai.customer.bo;

import com.yiibai.customer.bo.CustomerBo;

/** 
* @author 作者Vladimir E-mail: gyang.shines@gmail.com
* @version 创建时间：2017年12月9日 下午12:57:36 
* 类说明 
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
