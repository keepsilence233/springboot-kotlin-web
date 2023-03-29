package qx.leizige.app.service

import com.google.common.collect.Lists
import org.springframework.stereotype.Repository
import qx.leizige.app.dto.UserVo

@Repository
class UserRepository {

    fun findAll(): List<UserVo>{
        return Lists.newArrayList(
            UserVo("张三",23),
            UserVo("李四",24),
            UserVo("王五",25)
        )
    }
}