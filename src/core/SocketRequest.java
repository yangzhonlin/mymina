package core;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lin on 2017/5/8.
 */
public class SocketRequest {
    private Map<String,Object> map = new HashMap<>();

    public SocketRequest(Map<String, Object> map) {
        this.map = map;
    }

    public Object get(String key){
        return map.get(key);
    }

    public String getAction(){
        return  map.get("action").toString();
    }

    public String getSender(){
        return map.get("sender").toString();
    }
}
