package online.pythonbot.FullStackApplicationbackend.repository;

import online.pythonbot.FullStackApplicationbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long>{


}
