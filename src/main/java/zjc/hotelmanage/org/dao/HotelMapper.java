package zjc.hotelmanage.org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import zjc.hotelmanage.org.model.Hotel;
import zjc.hotelmanage.org.model.HotelExample;

@Mapper
public interface HotelMapper {
    long countByExample(HotelExample example);

    int deleteByExample(HotelExample example);

    int deleteByPrimaryKey(Integer hotelid);

    int insert(Hotel record);

    int insertSelective(Hotel record);

    List<Hotel> selectByExample(HotelExample example);

    Hotel selectByPrimaryKey(Integer hotelid);

    int updateByExampleSelective(@Param("record") Hotel record, @Param("example") HotelExample example);

    int updateByExample(@Param("record") Hotel record, @Param("example") HotelExample example);

    int updateByPrimaryKeySelective(Hotel record);

    int updateByPrimaryKey(Hotel record);
}