package com.yiibai.customer.bo;
/** 
 * @author ����Vladimir E-mail: gyang.shines@gmail.com
 * @version ����ʱ�䣺2017��12��8�� ����8:04:53 
 * ��˵�� 
 */
public interface CustomerBo {

	void addCustomer();

	String addCustomerReturnValue();

	void addCustomerThrowException() throws Exception;

	void addCustomerAround(String name); 
}
