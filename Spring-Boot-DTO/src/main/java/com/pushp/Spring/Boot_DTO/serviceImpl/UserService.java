import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserOfficeLocationDTO> getAllUsersLocation(){
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());

    }

    private UserOfficeLocationDTO convertEntityToDto(User user){
        UserOfficeLocationDTO userOfficeLocationDTO = new UserOfficeLocationDTO();
        userOfficeLocationDTO.setUserId(user.getId());
        userOfficeLocationDTO.setEmail(user.getEmail());
        userOfficeLocationDTO.setPlace(user.getLocation().getPlace());
        userOfficeLocationDTO.setLongitude(user.getLocation().getLongitude());
        userOfficeLocationDTO.setLatitude(user.getLocation().getLatitude());
        return userOfficeLocationDTO;
    }
}