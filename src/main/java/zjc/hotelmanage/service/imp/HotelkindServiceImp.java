package zjc.hotelmanage.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zjc.hotelmanage.org.dao.HotelkindMapper;
import zjc.hotelmanage.org.model.Hotelkind;
import zjc.hotelmanage.org.model.HotelkindExample;
import zjc.hotelmanage.service.HotelkindService;

import java.util.List;

@Service
public class HotelkindServiceImp implements HotelkindService {
   @Autowired
   private HotelkindMapper hotelkindMapper;

    @Override
    public List<Hotelkind> findAllHotelClass() {
        HotelkindExample example = new HotelkindExample();
        example.createCriteria().getAllCriteria();
        List<Hotelkind> hotelkinds= hotelkindMapper.selectByExample(example);
        for (Hotelkind hotelkind : hotelkinds){
            System.out.println(hotelkind);
        }
        return hotelkinds;
    }
}
