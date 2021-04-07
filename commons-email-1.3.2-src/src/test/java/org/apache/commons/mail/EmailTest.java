package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import javax.mail.internet.MimeMessage;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EmailTest {

	private static final String[] t_emailS = {"ab@bc.com", "ab@c.org", 
			"hjdfh@fjdfh.com"};
	
	private static final String t_email = "ab@bc.com";

	
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception{
		
	}
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	

	
	/*
	 * Test addBcc(String...) by comparing the size 
	 */
	@Test
	public void testaddBcc_2() throws Exception{
		
		email.addBcc(t_emailS);
		assertEquals(3, email.getBccAddresses().size());
	}
	
	
	
	
	
	
}
