package angel.veitch.dal.dao;

import angel.veitch.dal.bo.UserBo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    int insert(UserBo userBo);

    UserBo query(@Param("id") String id);
}
