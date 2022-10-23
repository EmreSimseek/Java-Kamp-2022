package business;

import core.logging.Logger;
import dataAccess.EducatorDao;
import entities.Educator;
import java.util.ArrayList;
import java.util.List;

public class EducatorManager {
    private EducatorDao educatorDao;
    private  Logger[] loggers;
    private List<Educator> educators;

    public EducatorManager(EducatorDao educatorDao, Logger[] loggers){
        this.educatorDao=educatorDao;
        this.loggers=loggers;
        educators = new ArrayList<Educator>();

    }
    public void add(Educator educator) throws Exception{

        for(Educator educatorA :educators)
        {

            if(educator.getEducatorId()==educatorA.getEducatorId())
            {
                throw new Exception("Eğitmen id numarası aynı olamaz");
            }
        }


        educatorDao.add(educator);
        for (Logger logger:loggers){
            logger.log(educator.getEducatorName()+" "+educator.getEducatorLastName());
        }

    }



}
