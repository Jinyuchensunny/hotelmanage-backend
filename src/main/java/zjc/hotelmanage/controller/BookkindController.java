package zjc.hotelmanage.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zjc.hotelmanage.org.model.Hotelkind;
import zjc.hotelmanage.org.to.HotelKindList;
import zjc.hotelmanage.service.HotelkindService;

import java.util.List;

@Api(value = "酒店分类服务",description = "获取所有酒店分类")
@RestController
@RequestMapping(produces = "application/json; charset=utf-8")
public class BookkindController {
    @Autowired
    HotelkindService hotelkindService;

    @ApiOperation("获取所有酒店分类-->Json")
    @GetMapping(value = "/HotelManage/findAllHotelClass")
    private String findAllHotelClasstoJson(){
        List<Hotelkind> allhotels = hotelkindService.findAllHotelClass();
        HotelKindList hotelKindList = new HotelKindList();
        hotelKindList.setBookkinds(allhotels);
        Gson gson = new Gson();
        return gson.toJson(hotelKindList, new TypeToken<HotelKindList>() {
        }.getType());
    }
}
