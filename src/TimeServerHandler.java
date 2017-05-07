import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

import java.util.Date;

/**
 * Created by Lin on 2017/5/6.
 */
public class TimeServerHandler extends IoHandlerAdapter {

    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
        super.exceptionCaught(session, cause);
    }

    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        String msg = (String) message;
        if (msg.trim().equals("quit")){
            session.closeNow();
            return;
        }
        Date date = new Date();
        session.write(date.toString());
        System.out.println("Message written....");
    }
}
