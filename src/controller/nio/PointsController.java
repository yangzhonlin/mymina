package controller.nio;

import core.Action;
import core.SocketRequest;
import core.SocketResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import service.PointsService;

import javax.annotation.Resource;

/**
 * Created by Lin on 2017/5/8.
 */
@Controller
public class PointsController implements Action {
    @Resource
    private PointsService pointsService;

    @Override
    public void doAction(SocketRequest request, SocketResponse response) {
        Object sequence = request.get("sequence");
        Object time = request.get("time");
        Object x = request.get("x");
        Object y = request.get("y");
        Object userid = request.get("userid");


    }
}
