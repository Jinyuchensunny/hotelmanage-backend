package zjc.hotelmanage.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    private Integer hotelid;

    private Integer hotelkindid;

    private String hotelname;

    private String hotelprice;

}