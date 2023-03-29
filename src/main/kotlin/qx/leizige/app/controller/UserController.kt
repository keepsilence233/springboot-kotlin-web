package qx.leizige.app.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import qx.leizige.app.service.UserRepository

@RestController
@RequestMapping("/api/user")
class UserController(private val repository: UserRepository) {


    @GetMapping("findAll")
    fun findAll() = repository.findAll()
}