package zjc.hotelmanage.org.to;

import lombok.Data;
import zjc.hotelmanage.org.model.Hotel;

import java.util.ArrayList;
import java.util.List;

@Data
public class HotelList {
    private List<Hotel> hotels = new ArrayList<>();
}
