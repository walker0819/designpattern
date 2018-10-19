package com.ptop.designpattern.listener;

import java.util.Map;

public class BusinessListener implements Listener {
	@Override
	public void notifyOthers(Event event) {
		Message msg = (Message) event.getSource();
		System.out.println("开始通知其他系统");
		System.out.println("消息主体：日期=" +msg.getDate() + ", 状态=" + msg.getStatus() + ", 类型=" + msg.getType());

	}
}
