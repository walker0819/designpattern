package com.ptop.designpattern.listener;

public class BusinessOperator {
	private Listener listener;
	public void setListener(Listener listener) {
		this.listener = listener;
	}
	public void doBusiness(){
		System.out.println("开做业务操作");
		if (listener != null){
			Message msg = new Message();
			msg.setDate("2018年10月19日");
			msg.setStatus("成功");
			msg.setType("运营商");
			listener.notifyOthers(new Event(msg));
		}
		System.out.println("业务操作结束");
	}
}
