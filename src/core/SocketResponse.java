package core;

import com.google.gson.Gson;
import org.apache.mina.core.session.IoSession;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lin on 2017/5/8.
 */
public class SocketResponse {
    private IoSession session;
    private Map<String,Object> map = new HashMap<>();

    public SocketResponse(IoSession session) {
        this.session = session;
    }

    public void put(String key,Object value){
        map.put(key,value);
    }

    public void writeResponse(){
        String json = new Gson().toJson(map);
        System.out.println(json);
        session.write(json);
    }
}
