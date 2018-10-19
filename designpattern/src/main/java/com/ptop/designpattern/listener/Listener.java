package com.ptop.designpattern.listener;

import java.util.EventListener;
import java.util.Map;

/**
 * 事件监听器
 * @author josh
 * @version 1.0.0
 * @date 2018年10月19日
 */
public interface Listener extends EventListener {
	public void notifyOthers(Event event);
}
