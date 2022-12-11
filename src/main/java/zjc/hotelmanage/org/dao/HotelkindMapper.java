package zjc.hotelmanage.org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import zjc.hotelmanage.org.model.Hotelkind;
import zjc.hotelmanage.org.model.HotelkindExample;

@Mapper
public interface HotelkindMapper {
    long countByExample(HotelkindExample example);

    int deleteByExample(HotelkindExample example);

    int deleteByPrimaryKey(Integer hotelkindid);

    int insert(Hotelkind record);

    int insertSelective(Hotelkind record);

    List<Hotelkind> selectByExample(HotelkindExample example);

    Hotelkind selectByPrimaryKey(Integer hotelkindid);

    int updateByExampleSelective(@Param("record") Hotelkind record, @Param("example") HotelkindExample example);

    int updateByExample(@Param("record") Hotelkind record, @Param("example") HotelkindExample example);

    int updateByPrimaryKeySelective(Hotelkind record);

    int updateByPrimaryKey(Hotelkind record);
}