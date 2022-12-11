package zjc.hotelmanage.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zjc.hotelmanage.org.dao.HotelMapper;
import zjc.hotelmanage.org.model.Hotel;
import zjc.hotelmanage.org.model.HotelExample;
import zjc.hotelmanage.service.HotelService;

import java.util.List;

@Service
public class HotelServiceImp implements HotelService {
    @Autowired
    private HotelMapper hotelMapper;

    @Override
    public List<Hotel> findHotelByHotelClassId(Integer hotelKindId) {
        HotelExample example = new HotelExample();
        example.createCriteria().andHotelkindidEqualTo(hotelKindId);
        List<Hotel> hotels = hotelMapper.selectByExample(example);
        return hotels;
    }

    @Override
    public Hotel findHotelById(Integer hotelId) {
        Hotel book = hotelMapper.selectByPrimaryKey(hotelId);
        return book;
    }

    @Override
    public void updateHotel(Hotel hotel) {
        hotelMapper.updateByPrimaryKeySelective(hotel);
    }
}
