/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice.parser.service;

import invoice.parser.dao.interfaces.ITransporterDao;
import invoice.parser.entity.Form.Transporter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author konstantinos
 */
@Service
public class TransporterService {
    
    @Autowired
    @Qualifier("MySQLTransporter")
    private ITransporterDao transporterDao;
    
    public int addTransporter(Transporter transporter) {
        return transporterDao.addTransporter(transporter);
    }
    
    public Transporter getTransporterById(int id) {
        return transporterDao.getTransporterById(id);
    }
    
    public List<Transporter> getTransporters() {
        return transporterDao.getTransporters();
    }
    
}
