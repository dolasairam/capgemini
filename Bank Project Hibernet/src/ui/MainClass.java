package ui;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import bean.Account;
import bean.LoginDetails;
import bean.TransactionDetails;
import dao.DaoClass;
import service.ServiceClass;

public class MainClass {

	public static void main(String[] args) {
	
			ServiceClass bsc;
			Account account;
			LoginDetails login;
			int count=0;

			while(true)
			{
				try
				{
					System.out.println("1. To create a new Account");
					System.out.println("2. To Login");
					System.out.println("3. To exit");
					Scanner sc = new Scanner(System.in);
	
					count=sc.nextInt();
//					Console cnsl = null;
					switch(count)
					{
					case 1:
						account = new Account();
						bsc = new ServiceClass();
						System.out.println("First Name: ");
						String str = sc.nextLine();
						str = sc.nextLine();
						account.setFirstName(str);
						System.out.println("Last Name: ");
						String lastName=sc.nextLine();
						account.setLastName(lastName);
						System.out.println("Father's Name: ");
						String fatherName=sc.nextLine();
						account.setFathersName(fatherName);
						System.out.println("Mother's Name: ");
						String motherName=sc.nextLine();
						account.setMothersName(motherName);
						String username;
						login = new LoginDetails();
						do
						{
							System.out.println("username:");
							username=sc.nextLine();
						}while(bsc.validateUserName(username));
						login.setUserName(username);
						System.out.println("Password");
						String password = sc.next();
						System.out.println("Re-enter Password:");
						String rePassword = sc.next();
						bsc = new ServiceClass();
						while(!password.equals(rePassword))
						{
							System.out.println("Password");
							password = sc.next();
							System.out.println("Re-enter Password:");
							rePassword = sc.next();
							login.setPassword(rePassword);
						}
						account.setLogin(login);
						String c = bsc.createAccount(account);
						System.out.println(c);
			
			break;
		case 2:
			bsc = new ServiceClass();
			System.out.println("Enter the userName");
			String user = sc.next();
			boolean flag=bsc.validateUserName(user);
			if(flag)
			{
				System.out.println("Enter the password");
				String pass = sc.next();
				
				if(bsc.checkAccount(user, pass))
				{
					a:
					while(true) {
					System.out.println("1. To check the Balance");
					System.out.println("2. To deposit");
					System.out.println("3. To WithDraw");
					System.out.println("4. To fund transfer");
					System.out.println("5. To Print Transactions");
					System.out.println("6. To Logout");
					int temp=sc.nextInt();
					switch(temp)
					{
					case 1:
						System.out.println(bsc.checkBalance(user));
						continue;
					case 2:
						System.out.println("Enter the account to deposite");
						Double amount=sc.nextDouble();
						bsc.deposit(amount, user);
						System.out.println("Updated balance " + bsc.checkBalance(user));
						break;
					case 3:
						System.out.println("Enter the account to withdraw");
						Double amountWith = sc.nextDouble();
						bsc.withdraw(amountWith, user);
						System.out.println("Updated balance " + bsc.checkBalance(user));
						break;
					case 4:
						System.out.println("Enter the Account No to which you want to transfer the amount");
						Long id2 = sc.nextLong();
						System.out.println("Enter the Amount you want to transfer:");
						Double amountDou = sc.nextDouble();
						String st= bsc.fundTransfer(id2, amountDou, user);
						System.out.println(st);
						break;
					case 5:
						System.out.println("accountId \t type \t\t amount \t Date and time");
						List<TransactionDetails> li=bsc.transactions(user);
						for (TransactionDetails transactionDetails : li) {
							System.out.println(transactionDetails.getAccountId()+"\t\t"+transactionDetails.getType()+"\t\t"
									+transactionDetails.getAmount()+"\t\t"+transactionDetails.getDate());
						}
						break;
					case 6:
						break a;
					default:
						System.out.println("Invalid command");	
					}
					}
				}
			}
			else
			{
				System.out.println("Invalid");
			}
			break;
		case 3:
		{
			System.exit(0);
		}
		break;
		default:
			System.out.println("Invalid command");	
		}
	}
	catch(Exception e)
	{
		System.out.println("Enter the valid data");
		continue;
	}
			
			}
	}
}
