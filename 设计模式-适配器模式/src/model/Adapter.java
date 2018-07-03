package model;

import model.InnerService;
import service.Service;

public class Adapter implements Service {

    private InnerService service = new InnerService();
    @Override
    public String service() {
        return service.service();
    }
}
