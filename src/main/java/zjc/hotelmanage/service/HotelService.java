package zjc.hotelmanage.service;

import zjc.hotelmanage.org.model.Hotel;

import java.util.List;

public interface HotelService {
    //    1 根据酒店分类号查找所有酒店
    public List<Hotel> findHotelByHotelClassId(Integer hotelKindId);

    //    2 根据酒店号查找酒店
    public Hotel findHotelById(Integer hotelId);

    //    3 修改指定编号酒店名称和价格
    public void updateHotel(Hotel hotel);

}
