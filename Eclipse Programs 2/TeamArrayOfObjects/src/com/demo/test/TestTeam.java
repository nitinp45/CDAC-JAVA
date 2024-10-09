package com.demo.test;
import java.util.Scanner;

import com.demo.beans.Player;
import com.demo.beans.Team;
import com.demo.service.TeamService;
public class TestTeam {
	public static void main(String[] args)
	{
	
		Scanner sc= new Scanner(System.in); 
		int choice=0;
		do {
			System.out.println("1.Add new Team");
			System.out.println("2.Search by teamId");
	        System.out.println("3.Delete the Team");      
	        System.out.println("4.Search by Player Id");
	        System.out.println("5.Delete Player from the Team");
	        System.out.println("6.Add a New player in the Team");
	        System.out.println("7.Display All");
	        System.out.println("8.Exit....");
	        System.out.println("enter choice:");
	        choice=sc.nextInt();
	        
	        switch(choice) {
	        case 1: 
	        		boolean status=TeamService.addNewTeam();
	        		if(status) {
	        			System.out.println("Added new team successfully");
	        		}else {
	        			System.out.println("New team failed to add");
	        		}
	        		
	        		break;
	        		
	        		
	        case 3:System.out.println("Enter team id:");
    				int tid=sc.nextInt();
    				Team res[]=TeamService.findTeamById(tid);
    				for(Team t:res)
			        {
			        	if(t!=null)
			        	{
			        		System.out.println(t);
			        	}
			        	else{
			        		break;
			        	}
			        }
    				
	        	break;
	        	
	        case 2:System.out.println("Enter team id:");
		    		tid=sc.nextInt();
		    		status=TeamService.deleteTeamById(tid);
		    		if(status) {
		    			System.out.println("Deleted team successfully");
		    		}else {
		    			System.out.println("team not found");
		    		}
		    		break;
	        case 4:System.out.println("Enter Player Id to search:");
     	   		   int pid = sc.nextInt();
     	   		   Player p= TeamService.findPlayerById(pid);
     	   		   if(p!=null)
     	   		   		{
     	   			   		System.out.println(p);
     	   		   		}
     	   		   		else{
     	   		   			break;
     	   		   		}
     	   		   break;
	        	
	        case 5:System.out.println("Enter team id:");
	        	   tid=sc.nextInt();
	        	   System.out.println("Enter Player Id:");
	        	   pid=sc.nextInt();
	        	   status = TeamService.deletePlayerFromTeamById(tid,pid);
	        	   if(status) {
	        			System.out.println("Deleted Player successfully");
	        		}else {
	        			System.out.println("Player or Team not found");
	        		}
	        	   break;
	        case 6:
	        	System.out.println("Enter Team Id:");
	        	tid=sc.nextInt();
	        	status=TeamService.addPlayerToTeam(tid);
	        	if(status) {
        			System.out.println("Player Added successfully");
        		}else {
        			System.out.println("Team not found");
        		}
	        	break;
	        	
	        case 7:Team[] ans=TeamService.displayAll();
			        for(Team t:ans)
			        {
			        	if(t!=null)
			        	{
			        		System.out.println(t);
			        	}
			        	else{
			        		break;
			        	}
			        }
	        		
	        	break;
	        	
	        case 8:System.out.println("thank you for visiting.....");
	        		sc.close();
	        	break;
	        default:
	        	break;
	        }
	        
	}	while(choice!=8);
}
}
