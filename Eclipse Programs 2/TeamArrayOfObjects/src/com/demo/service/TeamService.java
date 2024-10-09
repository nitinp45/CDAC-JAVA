package com.demo.service;
import java.util.Scanner;
import com.demo.beans.Player;
import com.demo.beans.Team;

public class TeamService {
	
	static Team[] tarr;
	static int cnt;
	static Player[] parr;
	static int pcnt = 0;
	
	static {
		tarr=new Team[20];
		parr = new Player[10];
		parr[0]= new Player(45,"Rohit Sharma","batsman");
		parr[1]=new Player(93,"Jasprit Bumrah","Bowler");
		parr[2]=new Player(63,"Suryakumar Yadav","Batsman");
		pcnt=3;
		tarr[0]=new Team(01,"Mumbai Indians","Jaywardhan",new Player(45,"Rohit Sharma","batsman"),parr);
		cnt = 1;
		
		
	}

	public static boolean addNewTeam() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter team id:");
		int tid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter team name:");
		String tname=sc.nextLine();
		
		System.out.println("Enter team coach:");
		String tcoach=sc.next();
		
		
		System.out.println("Enter captain ID:");
		sc.nextLine();
		int cid=sc.nextInt();
		
		System.out.println("Enter captain name:");
		sc.nextLine();
		String cname=sc.nextLine();
		
		System.out.println("Enter captain speciality:");
		String cspecial=sc.nextLine();
		
		Player parr1= new Player(cid,cname,cspecial);
		
		Player plist[] = new Player[15];
	 String ans= "Yes";
		do {
			System.out.println("Enter Player id:");
			int pid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Player name:");
			String pname=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Player Speciality");
			String pspec=sc.next();
			
			plist[pcnt]= new Player(pid,pname,pspec);
			pcnt++;
			System.out.println("Do you want to continue?(Yes/No)");
			 ans=sc.next();
		}while(ans.equals("Yes"));
		
		tarr[cnt]=new Team(tid,tname,tcoach,parr1,plist);
		cnt++;
		
		return true;
		
		
	}

	public static Team[] displayAll() {
		return tarr;
		
	}

	public static boolean deleteTeamById(int tid) {
		for(int i=0;i<cnt;i++)
		{
			if(tarr[i].getTid()==tid)
			{
				for(int j=i;j<cnt;j++)
				{
					tarr[j]=tarr[j+1];
				}
			cnt--;
			return true;
			}
		}
		return false;
		
   }

	public static Team[] findTeamById(int tid) {
		for(Team t1:tarr)
		{
			if(t1!=null)
			{
				if(t1.getTid()==tid)
				{
					return tarr;
				}
			}
		}
		return null;
	}

	public static Player findPlayerById(int pid) {
		
		for(Team t:tarr)
		{
			if(t!=null)
			{
				Player[] parr=t.getPlist();
				for(Player p:parr)
				{
					if(p!=null)
					{
						if(p.getPid()==pid)
						{
							return p;
						}
					}else
						break;
				}
			}else
				break;
		}
		
		return null;
	}

	public static boolean deletePlayerFromTeamById(int tid, int pid) {
		for(Team t:tarr)
		{
			if(t!=null)
			{
				if(t.getTid()==tid)
				{
					Player[] parr=t.getPlist();
					for(Player p:parr)
					{
						if(p!=null)
						{
							if(p.getPid()==pid)
							{
								for(int i=0;i<pcnt;i++)
								{
									if(parr[i].getPid()==pid)
									{
										for(int j=i;j<pcnt;j++)
										{
											parr[j]=parr[j+1];
										}
									pcnt--;
									return true;
									}
								}
							}
						}else
							break;
					}
				}
			}
		}
		return false;
	}

	public static boolean addPlayerToTeam(int tid) {
		
		for(Team t:tarr)
		{
			if(t!=null)
			{
				if(t.getTid()==tid)
				{
					Player[] parr=t.getPlist();
					for(Player p:parr)
					{
						if(p==null)
						{
							Scanner sc=new Scanner(System.in);
							System.out.println("Enter Player id:");
							int pid=sc.nextInt();
							sc.nextLine();
							System.out.println("Enter Player name:");
							String pname=sc.nextLine();
							sc.nextLine();
							System.out.println("Enter Player Speciality");
							String pspec=sc.next();
							
							parr[pcnt]= new Player(pid,pname,pspec);
							pcnt++;
							return true;
							
						}
					}
				}
			}
		}
		
		return false;
	}
	
	

}
