package service;

import dao.PointsDao;
import domain.Points;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Lin on 2017/5/8.
 */
@Component
public class PointsService {
    @Resource
    private PointsDao pointsDao;

    public List<Points> findPoints(String sequence){
        return pointsDao.findPoints(sequence);
    }

    public void addPoint(Points points){
        pointsDao.addPoint(points);
    }
}
