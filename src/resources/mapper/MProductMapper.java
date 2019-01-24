package resources.mapper;

import com.gdz.dao.MProduct;
import com.gdz.dao.MProductExample;
import java.util.List;

public interface MProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MProduct record);

    int insertSelective(MProduct record);

    List<MProduct> selectByExample(MProductExample example);

    MProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MProduct record);

    int updateByPrimaryKey(MProduct record);
}