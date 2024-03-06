package Testngbasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {
	//depends on means execute the TC only if the dependent methods are pass
	//else skip the TC
	//significance the method will be executed only if the dependence methods or pass
	
	@Test
	public void login() {
		System.out.println("login TC");
		//Assert.fail();
		
	}
	@Test(dependsOnMethods = {"login"})
	public void sendFriendRequest() {
		System.out.println("Sending Friend Request");
		Assert.fail();
	}
	@Test(dependsOnMethods = {"login","sendFriendRequest"})
	public void acceptFriendRequest() {
		System.out.println("Accepting Friend Request");
		Assert.fail();
		
	}

}
