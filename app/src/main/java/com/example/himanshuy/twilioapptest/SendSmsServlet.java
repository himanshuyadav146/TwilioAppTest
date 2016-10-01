package com.example.himanshuy.twilioapptest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by himanshu.y on 9/30/2016.
 */

public class SendSmsServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException,
            ServletException {
        final String twilioAccountSid = System.getenv("TWILIO_ACCOUNT_SID");
        final String twilioAuthToken = System.getenv("TWILIO_AUTH_TOKEN");
        final String twilioNumber = System.getenv("TWILIO_NUMBER");
        final String toNumber = (String) req.getParameter("to");
        if (toNumber == null) {
            resp.getWriter()
                    .print("Please provide the number to message in the \"to\" query string parameter.");
            return;

        }
//        TwilioRestClient client = new TwilioRestClient(twilioAccountSid, twilioAuthToken);
//        Account account = client.getAccount();
//        MessageFactory messageFactory = account.getMessageFactory();
//        List<NameValuePair> params = new ArrayList<NameValuePair>();
//        params.add(new BasicNameValuePair("To", toNumber));
//        params.add(new BasicNameValuePair("From", twilioNumber));
//        params.add(new BasicNameValuePair("Body", "Hello from Twilio!"));
//        try {
//            Message sms = messageFactory.create(params);
//            resp.getWriter().print(sms.getBody());
//        } catch (TwilioRestException e) {
//            throw new ServletException("Twilio error", e);
//        }

    }

}
