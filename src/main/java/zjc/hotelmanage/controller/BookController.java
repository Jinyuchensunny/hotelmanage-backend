package zjc.hotelmanage.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zjc.hotelmanage.org.model.Hotel;
import zjc.hotelmanage.org.to.HotelList;
import zjc.hotelmanage.service.HotelService;

import java.util.List;

@Api(value = "酒店服务",description = "指定分类所有酒店、指定编号酒店、修改")
@RestController
@RequestMapping(produces = "application/json; charset=utf-8")
public class BookController {
    @Autowired
    HotelService hotelService;

    @ApiOperation("获取某酒店分类下所有酒店-->Json")
    @GetMapping(value = "/BookManage/findHotelByHotelClassId={hotelClassId}")
    public String findBookByBookClassIdtoJson(@PathVariable("hotelClassId")Integer hotelKindId){
        List<Hotel> hotels = hotelService.findHotelByHotelClassId(hotelKindId);
        System.out.println(hotelKindId);
        HotelList hotelList = new HotelList();
        hotelList.setHotels(hotels);
        Gson gson = new Gson();
        return gson.toJson(hotelList,new TypeToken<HotelList>(){}.getType());
    }

    @ApiOperation("获取指定编号的酒店-->Json")
    @GetMapping(value = "/BookManage/findHotelById/hotelId={hotelId}")
    public String findBookByIdtoJson(@PathVariable("hotelId")Integer hotelId) {
        Hotel hotel = hotelService.findHotelById(hotelId);
        System.out.println(hotelId);
        Gson gson = new Gson();
        return gson.toJson(hotel);
    }

    @ApiOperation("修改酒店名称和价格-->Json")
    @GetMapping(value = "/BookManage/updateBookById")
    public String updateHotelByIdtoJson(Hotel hotel){
        hotelService.updateHotel(hotel);
        Gson gson = new Gson();
        System.out.println("hotel"+gson.toJson(hotel));
        System.out.println(gson.toJson("修改酒店成功"));
        return gson.toJson("success");
    }
}
