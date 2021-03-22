package com.ChainOfResponsiblity;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeaveRequest leaveRequest=new LeaveRequest();
		
		leaveRequest.setEmployee("John");
		leaveRequest.setLeaveDays(1);
		ILeaveRequestHandler leaveRequestHandler = new Supervisor();
		leaveRequestHandler.handleRequest(leaveRequest);
		System.out.println("------------");
		
		
		leaveRequest=new LeaveRequest();
		leaveRequest.setEmployee("Joe");
		leaveRequest.setLeaveDays(4);
		leaveRequestHandler = new Supervisor();
		leaveRequestHandler.handleRequest(leaveRequest);
		System.out.println("-------------");
		
		
		leaveRequest=new LeaveRequest();
		leaveRequest.setEmployee("Joy");
		leaveRequest.setLeaveDays(8);
		leaveRequestHandler = new Supervisor();
		leaveRequestHandler.handleRequest(leaveRequest);
		System.out.println("-------------");
		
		leaveRequest=new LeaveRequest();
		leaveRequest.setEmployee("Jane");
		leaveRequest.setLeaveDays(11);
		leaveRequestHandler = new Supervisor();
		leaveRequestHandler.handleRequest(leaveRequest);
	}

}
