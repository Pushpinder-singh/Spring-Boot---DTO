import lombok.Data;

@Data
public class UserOfficeLocationDTO {
    private long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}