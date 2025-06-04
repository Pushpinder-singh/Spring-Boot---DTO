import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // reflect the data on browser after fethcing from JPA repo
    @GetMapping("/users-office-location")
    public List<UserOfficeLocationDTO> getAllUsersLocation(){
        return userService.getAllUsersLocation();
    }
}

