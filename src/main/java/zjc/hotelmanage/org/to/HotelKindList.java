package zjc.hotelmanage.org.to;

import lombok.Data;
import zjc.hotelmanage.org.model.Hotelkind;

import java.util.ArrayList;
import java.util.List;

@Data
public class HotelKindList {
    private List<Hotelkind> bookkinds = new ArrayList<>();
}
