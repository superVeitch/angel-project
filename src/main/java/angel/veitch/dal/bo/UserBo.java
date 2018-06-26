package angel.veitch.dal.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserBo {
    private String id;
    private String name;
    private String address;
    private String mobile;
    private String tel;
    private Integer isActive;
}
