package top.zh.springbootdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.zh.springbootdatabase.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
