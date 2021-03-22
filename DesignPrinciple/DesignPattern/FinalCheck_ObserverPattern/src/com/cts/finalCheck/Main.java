package com.cts.finalCheck;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Team1 team1 = new Team1();
		Team2 team2 = new Team2();
		
		NotificationService service = new NotificationService();
		
		service.addSubscriber(team1);
		service.addSubscriber(team2);
		
		service.notifySubscriber();
		System.out.println("-------------------------");
		service.removeSubscriber(team2);
		
		service.notifySubscriber();
		
		System.out.println("-------------------------");
		service.addSubscriber(team2);
		service.notifySubscriber();
		
	}

}
