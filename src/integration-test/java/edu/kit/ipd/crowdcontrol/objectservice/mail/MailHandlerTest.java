package edu.kit.ipd.crowdcontrol.objectservice.mail;

import org.junit.Test;

import javax.mail.Message;
import java.util.UUID;

import static org.junit.Assert.assertTrue;

/**
 * @author Niklas Keller
 * @author Felix Rittler
 */
public abstract class MailHandlerTest {
    protected MailHandler handler;
    protected String mail;
    protected String folder;

    @Test
    public void test() throws Exception {
        String uuid = UUID.randomUUID().toString();
        String subject = "[test] " + uuid;

        handler.sendMail("pseipd@trash-mail.com", subject, uuid);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        Message[] messages = handler.fetchFolder(folder);

        boolean found = false;


        for (Message message : messages) {

            if (message.getSubject().equals(subject)) {
                found = true;
                handler.deleteMails(message);
                break;
            }
        }
        assertTrue(found);
    }
}