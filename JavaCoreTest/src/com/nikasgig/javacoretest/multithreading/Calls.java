package com.nikasgig.javacoretest.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Calls {

	private Lock lock = new ReentrantLock();

	public void mobile() {
		lock.lock();
		try {
			System.out.println("Mobile call start");
			System.out.println("Mobile call finish");
		} catch (Exception e) {
		} finally {
			lock.unlock();
		}
	}
	public void telegram() {
		lock.lock();
		try {
			System.out.println("Telegram call start");
			System.out.println("Telegram call finish");
		} catch (Exception e) {
		} finally {
			lock.unlock();
		}
	}
	public void instagram() {
		lock.lock();
		try {
			System.out.println("Instagram call start");
			System.out.println("Instagram call finish");
		} catch (Exception e) {
		} finally {
			lock.unlock();
		}
	}
}
