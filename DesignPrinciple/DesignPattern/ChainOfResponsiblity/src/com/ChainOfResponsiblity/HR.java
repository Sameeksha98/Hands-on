package com.ChainOfResponsiblity;

public class HR implements ILeaveRequestHandler{

	ILeaveRequestHandler nextHandler;
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() <= 10) {
			System.out.println("Request Approved by HR");
		}
		else {
			System.out.println("Rejected by HR");
		}
	}

}
