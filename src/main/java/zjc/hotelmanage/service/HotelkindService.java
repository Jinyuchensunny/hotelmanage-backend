package zjc.hotelmanage.service;

import zjc.hotelmanage.org.model.Hotelkind;

import java.util.List;

public interface HotelkindService {
    //    1 查找所有酒店分类
    public List<Hotelkind> findAllHotelClass();

}
