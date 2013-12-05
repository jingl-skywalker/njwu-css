package businesslogicservice.planblservice;

import businesslogic.planbl.PlanController;


public class PlanOerationFactory {

	public PlanBLService createCourseBL() {
        return new PlanController();
    }
	
}
