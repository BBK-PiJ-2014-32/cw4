package tests;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import contactManager.Contact;
import contactManager.ContactImpl;
import contactManager.FutureMeeting;
import contactManager.FutureMeetingImpl;


/**
 * The Class FutureMeetingTest.
 */
public class FutureMeetingTest {

	/**
	 * Future meeting test.
	 */
	@Test
	public void futureMeetingTest() {
		Calendar date = new GregorianCalendar(2015, 4, 12);
		Set<Contact> contactSet = new LinkedHashSet<Contact>();
		Contact contact1 = new ContactImpl("Mr Man", 1);
		Contact contact2 = new ContactImpl("Miss Miss", 2);
		Contact contact3 = new ContactImpl("Mr Smith", 3);
		Contact contact4 = new ContactImpl("Mrs Ladyla", 4);
		contactSet.add(contact1);
		contactSet.add(contact2);
		contactSet.add(contact3);
		contactSet.add(contact4);
		FutureMeeting testMeet = new FutureMeetingImpl(date,contactSet, 1);
		Set<Contact> outputSet = testMeet.getContacts();
		Iterator<Contact> it = outputSet.iterator();
		String output = "";
		while(it.hasNext()){
		  Contact loopCon = it.next();
		  output += loopCon.getName() + ", ";
		}
		String expected = "Mr Man, Miss Miss, Mr Smith, Mrs Ladyla, ";
		assertEquals(expected, output);
	}

}
